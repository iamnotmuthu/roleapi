package ai.tirios.rolePermission.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import ai.tirios.rolePermission.dto.Auth;
import ai.tirios.rolePermission.dto.Permission;
import ai.tirios.rolePermission.dto.UserRole;

@Repository
public class UserDaoImpl implements UserDao{

	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public Auth getUserAuth(int userId) {
		System.out.println(jdbcTemplate);
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("userId", userId);
		String query = "select ur.id, u.user_id, ur.role_id,ur.role_name,p.*\r\n" + 
				"from user_role ur, service_user u, role_permission rp, permission p where ur.role_id=rp.role_id and ur.user_id=u.user_id and rp.PERMISSION_ID=p.permission_id\r\n" + 
				"and u.user_id=:userId";
		Auth result = (Auth) jdbcTemplate.query(query, namedParameters,new Extractor());
				//BeanPropertyRowMapper.newInstance(UserRole.class));
		System.out.println("permissions are printing from dao" + result);
		return result;
	
	}

}

class MyMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserRole ur=new UserRole();
		ur.setId(rs.getInt("id"));
		ur.setRoleId(rs.getInt("role_id"));
		ur.setUserId(rs.getInt("user_id"));
		Permission p=new Permission();
		p.setPermissionId(rs.getInt("permission_id"));
		p.setPermissionName(rs.getString("permission_name"));
		ur.getPermissionList().add(p);
		return ur;
	}
	
}

class Extractor implements ResultSetExtractor{

	@Override
	public ai.tirios.rolePermission.dto.Auth extractData(ResultSet rs) throws SQLException, DataAccessException {
		Map<Integer,List<Permission>> map=new HashMap<>();
		ai.tirios.rolePermission.dto.Auth auth=new ai.tirios.rolePermission.dto.Auth();
		while(rs.next()) {
			
			int userId=rs.getInt("user_id");
			auth.setUser(userId);
			int roleId=rs.getInt("role_id");
			if(!map.containsKey(roleId)) {
				map.put(roleId,new ArrayList<Permission>());
			}
			int pId=rs.getInt("permission_id");
			String pname=rs.getString("permission_name");
			Permission p=new Permission();
			p.setPermissionId(pId);
			p.setPermissionName(pname);
			map.get(roleId).add(p);
		}
		auth.setRoleMap(map);
		System.out.println(auth);
		return auth;
	}
	
}
package ai.tirios.rolePermission.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import ai.tirios.rolePermission.dto.Permission;
import ai.tirios.rolePermission.dto.Role;

@Repository
public class RoleDaoImpl implements RoleDao {

	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Role> getRoles() {
		System.out.println(jdbcTemplate);
		List<Role> result = jdbcTemplate.query("SELECT * FROM ROLE", BeanPropertyRowMapper.newInstance(Role.class));
		System.out.println("roles are printing from dao" + result);
		return result;
	}

	@Override
	public List<Permission> getPermissions(int roleId) {
		System.out.println(jdbcTemplate);
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("roleid", roleId);
		String query = "select P.PERMISSION_NAME,P.permission_id from ROLE_permission RP,PERMISSION P WHERE RP.PERMISSION_ID=P.permission_id AND role_id=:roleid";
		List<Permission> result = jdbcTemplate.query(query, namedParameters,
				BeanPropertyRowMapper.newInstance(Permission.class));
		System.out.println("permissions are printing from dao" + result);
		return result;
	}

	

}

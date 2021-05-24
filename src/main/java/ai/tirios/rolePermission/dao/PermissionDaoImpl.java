package ai.tirios.rolePermission.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ai.tirios.rolePermission.dto.Permission;

@Repository
public class PermissionDaoImpl implements PermissionDao {

	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Permission> getPermissions() {

		System.out.println(jdbcTemplate);
		List<Permission> result = jdbcTemplate.query("SELECT * FROM Permission",
				BeanPropertyRowMapper.newInstance(Permission.class));
		System.out.println("permissions are printing from dao" + result);
		return result;

	}

}

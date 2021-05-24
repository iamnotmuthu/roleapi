package ai.tirios.rolePermission.dao;

import java.util.List;

import ai.tirios.rolePermission.dto.Permission;
import ai.tirios.rolePermission.dto.Role;

public interface RoleDao {
	public List<Role> getRoles();

	public List<Permission> getPermissions(int roleId);

	//public Map<String, List<String>> getRolePermissions(int userId);

}

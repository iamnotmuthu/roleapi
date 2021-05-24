package ai.tirios.rolePermission.service;

import java.util.List;

import ai.tirios.rolePermission.dto.Permission;
import ai.tirios.rolePermission.dto.Role;


public interface RoleService {

	public List<Role> getRoles();
	public List<Permission> getPermissions(int role);
}

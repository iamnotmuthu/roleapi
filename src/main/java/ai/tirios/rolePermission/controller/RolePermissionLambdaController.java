package ai.tirios.rolePermission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ai.tirios.rolePermission.dto.Permission;
import ai.tirios.rolePermission.dto.Role;
import ai.tirios.rolePermission.service.PermissionService;
import ai.tirios.rolePermission.service.RoleService;

//@Controller
//@Qualifier("rolePermissionLambdaController")
public class RolePermissionLambdaController {
	@Autowired
	RoleService roleService;

	@Autowired
	PermissionService permissionService;
	
	public List<Role> getRoles() {
		return roleService.getRoles();
	}
	public List<Permission> getPermissions(int role) {
		return roleService.getPermissions(role);
	}
	
	public List<Permission> getPermissions() {
		return permissionService.getPermissions();
	}
}

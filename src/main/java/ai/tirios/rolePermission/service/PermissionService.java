package ai.tirios.rolePermission.service;

import java.util.List;

import ai.tirios.rolePermission.dto.Permission;

public interface PermissionService {

	List<Permission> getPermissions();
}

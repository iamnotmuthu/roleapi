package ai.tirios.rolePermission.dao;

import java.util.List;

import ai.tirios.rolePermission.dto.Permission;

public interface PermissionDao {
	public List<Permission> getPermissions();
}

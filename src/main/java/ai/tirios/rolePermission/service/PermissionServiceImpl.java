package ai.tirios.rolePermission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.tirios.rolePermission.dao.PermissionDao;
import ai.tirios.rolePermission.dto.Permission;

@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	PermissionDao permissionDao; 
	@Override
	public List<Permission> getPermissions() {
		
		return permissionDao.getPermissions();
	}

}

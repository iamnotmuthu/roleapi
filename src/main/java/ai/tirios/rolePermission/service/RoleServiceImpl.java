package ai.tirios.rolePermission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ai.tirios.rolePermission.dao.RoleDao;
import ai.tirios.rolePermission.dto.Permission;
import ai.tirios.rolePermission.dto.Role;

@Component
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	public List<Role> getRoles() {
		return roleDao.getRoles();
	}

	@Override
	public List<Permission> getPermissions(int roleId) {
		// TODO Auto-generated method stub
		return roleDao.getPermissions(roleId);
	}

	
	
	

}

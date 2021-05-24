package ai.tirios.rolePermission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import ai.tirios.rolePermission.dto.Permission;
import ai.tirios.rolePermission.dto.Role;
import ai.tirios.rolePermission.service.RoleService;

@RestController
public class RoleControllerImpl implements RoleController {

	@Autowired
	RoleService roleService;

	@Override
	public Response getRoles() {
		Response res = new Response();
		try {
			List<Role> roles = roleService.getRoles();
			res.setStatus(HttpStatus.OK);
			res.setData(roles);
		} catch (Exception e) {

		}

		return res;
	}

	@Override
	public Response getPermissions(int roleId) {
		Response res = new Response();
		try {
			List<Permission> permissions = roleService.getPermissions(roleId);
			res.setStatus(HttpStatus.OK);
			res.setData(permissions);
		} catch (Exception e) {

		}

		return res;
	}

}

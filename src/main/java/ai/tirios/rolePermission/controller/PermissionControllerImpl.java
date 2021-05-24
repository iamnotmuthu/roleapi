package ai.tirios.rolePermission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import ai.tirios.rolePermission.dto.Permission;
import ai.tirios.rolePermission.service.PermissionService;
@RestController
public class PermissionControllerImpl implements PermissionController{

	@Autowired
	PermissionService permissionService;
	@Override
	public Response<List<Permission>> getPermissions() {

		Response<List<Permission>> res = new Response();
		try {
			List<Permission> permissions = permissionService.getPermissions();
			res.setStatus(HttpStatus.OK);
			res.setData(permissions);
		} catch (Exception e) {

		}

		return res;
	
		//return PermissionService.getPermissions();
	}

	

}

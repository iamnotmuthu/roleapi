package ai.tirios.rolePermission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import ai.tirios.rolePermission.dto.Auth;
import ai.tirios.rolePermission.service.UserService;
@RestController
public class UserControllerImpl implements UserController{

	@Autowired
	UserService userService;
	@Override
	public Response getUserAuth(int id) {
		Response res = new Response();
		try {
			Auth auth=userService.getUserAuth(id);
			res.setData(auth);
			res.setStatus(HttpStatus.ACCEPTED);
		} catch (Exception e) {

		}

		return res;
	}

}

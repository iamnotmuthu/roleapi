package ai.tirios.rolePermission.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/v1/user/{id}")
public interface UserController {
	@RequestMapping(method = RequestMethod.GET)
	Response getUserAuth(@PathVariable int id);
}




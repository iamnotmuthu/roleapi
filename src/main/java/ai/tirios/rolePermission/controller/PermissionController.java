package ai.tirios.rolePermission.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/v1/permission")
public interface PermissionController {
	@RequestMapping(method = RequestMethod.GET)
	Response getPermissions();
}

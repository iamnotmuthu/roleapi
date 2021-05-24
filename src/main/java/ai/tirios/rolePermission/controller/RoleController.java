package ai.tirios.rolePermission.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/v1/role")
public interface RoleController {
	@RequestMapping(method = RequestMethod.GET)
	public Response getRoles();

	@RequestMapping(value = "/{roleId}/permission", method = RequestMethod.GET)
	public Response getPermissions(@PathVariable int roleId);
}

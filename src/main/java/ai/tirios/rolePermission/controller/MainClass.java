package ai.tirios.rolePermission.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ControllerConfig.class)){
			RolePermissionLambdaController rc=ctx.getBean(RolePermissionLambdaController.class);
			//rc.getPermissions(2);
			//rc.getRoles();
			rc.getPermissions();
		};
		
		
	}

}


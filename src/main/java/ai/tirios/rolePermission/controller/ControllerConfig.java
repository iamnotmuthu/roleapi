
package ai.tirios.rolePermission.controller;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("ai.tirios")
public class ControllerConfig {
	@Bean
	public RolePermissionLambdaController roleController() {
		return new RolePermissionLambdaController();
	}
	static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String SERVER = "sp-database.ck78a1izx1i8.us-east-1.rds.amazonaws.com";
	static final String PORT = "1433";
	static final String USER = "admin";
	static final String PASS = "tirios!1234";
	static final String URL="jdbc:sqlserver://"+ SERVER + ":" + PORT+";Database=tirios";

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(URL);
		driverManagerDataSource.setUsername(USER);
		driverManagerDataSource.setPassword(PASS);
		driverManagerDataSource.setDriverClassName(DRIVER);
		return driverManagerDataSource;
	}
}


package ai.tirios.rolePermission.dao;

import ai.tirios.rolePermission.dto.Auth;

public interface UserDao {
	Auth getUserAuth( int id);
}

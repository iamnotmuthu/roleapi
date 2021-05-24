package ai.tirios.rolePermission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.tirios.rolePermission.dao.UserDao;
import ai.tirios.rolePermission.dto.Auth;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	@Override
	public Auth getUserAuth(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserAuth(id);
	}

}

package ai.tirios.rolePermission.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Auth {
	private int user;
	private Map<Integer, List<Permission>> roleMap = new HashMap<>();

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public Map<Integer, List<Permission>> getRoleMap() {
		return roleMap;
	}

	public void setRoleMap(Map<Integer, List<Permission>> roleMap) {
		this.roleMap = roleMap;
	}

	@Override
	public String toString() {
		return "Auth [user=" + user + ", roleMap=" + roleMap + "]";
	}
}

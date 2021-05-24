package ai.tirios.rolePermission.dto;

import java.util.ArrayList;
import java.util.List;

public class UserRole {
	private int id;
	private int roleId;
	private int userId;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private List<Permission> permissionList=new ArrayList<>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Permission> getPermissionList() {
		return permissionList;
	}
	public void setPermissionList(List<Permission> permissionList) {
		this.permissionList = permissionList;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", roleid=" + roleId + ", userid=" + userId + ", permissionList=" + permissionList
				+ "]";
	}
	
	
}

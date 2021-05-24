package ai.tirios.rolePermission.dto;

import java.util.List;

public class Role {

	private int roleId;
	private String roleName;
	private List<Permission> permissions;

	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ roleId: "+this.roleId+", roleName: "+this.roleName+"]   ";
	}
	
}

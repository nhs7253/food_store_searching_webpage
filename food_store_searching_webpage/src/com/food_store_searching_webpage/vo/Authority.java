package com.food_store_searching_webpage.vo;

/**
 * 권한
 * @author hs
 * 권한 정보를 담는 객체
 */
public class Authority {
	
	private int	authority_id; //권한ID
	private String authority_scope; //권한범위
	
	public Authority() {
	}

	public Authority(int authority_id, String authority_scope) {
		this.authority_id = authority_id;
		this.authority_scope = authority_scope;
	}

	public int getAuthority_id() {
		return authority_id;
	}

	public void setAuthority_id(int authority_id) {
		this.authority_id = authority_id;
	}

	public String getAuthority_scope() {
		return authority_scope;
	}

	public void setAuthority_scope(String authority_scope) {
		this.authority_scope = authority_scope;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authority_id;
		result = prime * result + ((authority_scope == null) ? 0 : authority_scope.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Authority other = (Authority) obj;
		if (authority_id != other.authority_id)
			return false;
		if (authority_scope == null) {
			if (other.authority_scope != null)
				return false;
		} else if (!authority_scope.equals(other.authority_scope))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Authority [authority_id=" + authority_id + ", authority_scope=" + authority_scope + "]";
	}
}

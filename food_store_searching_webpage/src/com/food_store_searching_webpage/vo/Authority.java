package com.food_store_searching_webpage.vo;

/**
 * 권한
 * @author hs
 * 권한 정보를 담는 객체
 */
public class Authority {
	
	private int	authorityId; //권한ID
	private String authorityScope; //권한범위
	
	public Authority() {
	}

	public Authority(int authorityId, String authorityScope) {
		this.authorityId = authorityId;
		this.authorityScope = authorityScope;
	}

	public int getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}

	public String getAuthorityScope() {
		return authorityScope;
	}

	public void setAuthorityScope(String authorityScope) {
		this.authorityScope = authorityScope;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authorityId;
		result = prime * result + ((authorityScope == null) ? 0 : authorityScope.hashCode());
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
		if (authorityId != other.authorityId)
			return false;
		if (authorityScope == null) {
			if (other.authorityScope != null)
				return false;
		} else if (!authorityScope.equals(other.authorityScope))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Authority [authorityId=" + authorityId + ", authorityScope=" + authorityScope + "]";
	}
}

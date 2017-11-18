package com.food_store_searching_webpage.vo;
/**
 * 슈퍼 관리자
 * @author chogo
 * 최상위 사이트 관리자 권한 부여 및 관리
 */
public class SuperAdmin {

	private String superAdminId; //슈퍼관리자 아이디
	private String superAdminPw; //슈퍼관리자 패스워드
	private int authorityId;   //권한ID
	
	public SuperAdmin() {
	}

	public SuperAdmin(String superAdminId, String superAdminPw, int authorityId) {
		this.superAdminId = superAdminId;
		this.superAdminPw = superAdminPw;
		this.authorityId = authorityId;
	}

	public String getSuperAdminId() {
		return superAdminId;
	}

	public void setSuperAdminId(String superAdminId) {
		this.superAdminId = superAdminId;
	}

	public String getSuperAdminPw() {
		return superAdminPw;
	}

	public void setSuperAdminPw(String superAdminPw) {
		this.superAdminPw = superAdminPw;
	}

	public int getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authorityId;
		result = prime * result + ((superAdminId == null) ? 0 : superAdminId.hashCode());
		result = prime * result + ((superAdminPw == null) ? 0 : superAdminPw.hashCode());
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
		SuperAdmin other = (SuperAdmin) obj;
		if (authorityId != other.authorityId)
			return false;
		if (superAdminId == null) {
			if (other.superAdminId != null)
				return false;
		} else if (!superAdminId.equals(other.superAdminId))
			return false;
		if (superAdminPw == null) {
			if (other.superAdminPw != null)
				return false;
		} else if (!superAdminPw.equals(other.superAdminPw))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SuperAdmin [superAdminId=" + superAdminId + ", superAdminPw=" + superAdminPw + ", authorityId="
				+ authorityId + "]";
	}

	
}

package com.food_store_searching_webpage.vo;
/**
 * 노멀유저
 * @author hs
 * 노멀유저 정보를 담는 객체
 */
public class NomalUser {
	
	private String userId;  //유저 아이디
	private String userNicname; //유저 닉네임
	private String userEmail; //유저 이메일
	private int authorityId; //권한ID
	
	public NomalUser() {
	}

	public NomalUser(String userId, String userNicname, String userEmail, int authorityId) {
		this.userId = userId;
		this.userNicname = userNicname;
		this.userEmail = userEmail;
		this.authorityId = authorityId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserNicname() {
		return userNicname;
	}

	public void setUserNicname(String userNicname) {
		this.userNicname = userNicname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userNicname == null) ? 0 : userNicname.hashCode());
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
		NomalUser other = (NomalUser) obj;
		if (authorityId != other.authorityId)
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userNicname == null) {
			if (other.userNicname != null)
				return false;
		} else if (!userNicname.equals(other.userNicname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NomalUser [userId=" + userId + ", userNicname=" + userNicname + ", userEmail=" + userEmail
				+ ", authorityId=" + authorityId + "]";
	}
}

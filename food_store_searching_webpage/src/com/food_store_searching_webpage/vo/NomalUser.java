package com.food_store_searching_webpage.vo;
/**
 * 노멀유저
 * @author hs
 * 노멀유저 정보를 담는 객체
 */
public class NomalUser {
	
	private String user_id;  //유저 아이디
	private String user_nicname; //유저 닉네임
	private String user_email; //유저 이메일
	private int authority_id; //권한ID
	
	public NomalUser() {
	}

	public NomalUser(String user_id, String user_nicname, String user_email, int authority_id) {
		this.user_id = user_id;
		this.user_nicname = user_nicname;
		this.user_email = user_email;
		this.authority_id = authority_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_nicname() {
		return user_nicname;
	}

	public void setUser_nicname(String user_nicname) {
		this.user_nicname = user_nicname;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public int getAuthority_id() {
		return authority_id;
	}

	public void setAuthority_id(int authority_id) {
		this.authority_id = authority_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authority_id;
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + ((user_nicname == null) ? 0 : user_nicname.hashCode());
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
		if (authority_id != other.authority_id)
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (user_nicname == null) {
			if (other.user_nicname != null)
				return false;
		} else if (!user_nicname.equals(other.user_nicname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NomalUser [user_id=" + user_id + ", user_nicname=" + user_nicname + ", user_email=" + user_email
				+ ", authority_id=" + authority_id + "]";
	}
}

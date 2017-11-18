package com.food_store_searching_webpage.vo;

import java.sql.Date;

/**
 * 가게 정보
 * @author hs
 * 가게 정보를 담는 객체
 */
public class StoreInfo {
	
	private int admin_store_num; //가게 번호
	private String admin_store_info; //가게 정보
	private String admin_store_adress; //가게 주소
	private Date admin_store_img; //가게 이미지
	private int store_definision; //작성자 구분
	
	public StoreInfo() {
	}

	public StoreInfo(int admin_store_num, String admin_store_info, String admin_store_adress, Date admin_store_img,
			int store_definision) {
		this.admin_store_num = admin_store_num;
		this.admin_store_info = admin_store_info;
		this.admin_store_adress = admin_store_adress;
		this.admin_store_img = admin_store_img;
		this.store_definision = store_definision;
	}

	public int getAdmin_store_num() {
		return admin_store_num;
	}

	public void setAdmin_store_num(int admin_store_num) {
		this.admin_store_num = admin_store_num;
	}

	public String getAdmin_store_info() {
		return admin_store_info;
	}

	public void setAdmin_store_info(String admin_store_info) {
		this.admin_store_info = admin_store_info;
	}

	public String getAdmin_store_adress() {
		return admin_store_adress;
	}

	public void setAdmin_store_adress(String admin_store_adress) {
		this.admin_store_adress = admin_store_adress;
	}

	public Date getAdmin_store_img() {
		return admin_store_img;
	}

	public void setAdmin_store_img(Date admin_store_img) {
		this.admin_store_img = admin_store_img;
	}

	public int getStore_definision() {
		return store_definision;
	}

	public void setStore_definision(int store_definision) {
		this.store_definision = store_definision;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admin_store_adress == null) ? 0 : admin_store_adress.hashCode());
		result = prime * result + ((admin_store_img == null) ? 0 : admin_store_img.hashCode());
		result = prime * result + ((admin_store_info == null) ? 0 : admin_store_info.hashCode());
		result = prime * result + admin_store_num;
		result = prime * result + store_definision;
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
		StoreInfo other = (StoreInfo) obj;
		if (admin_store_adress == null) {
			if (other.admin_store_adress != null)
				return false;
		} else if (!admin_store_adress.equals(other.admin_store_adress))
			return false;
		if (admin_store_img == null) {
			if (other.admin_store_img != null)
				return false;
		} else if (!admin_store_img.equals(other.admin_store_img))
			return false;
		if (admin_store_info == null) {
			if (other.admin_store_info != null)
				return false;
		} else if (!admin_store_info.equals(other.admin_store_info))
			return false;
		if (admin_store_num != other.admin_store_num)
			return false;
		if (store_definision != other.store_definision)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StoreInfo [admin_store_num=" + admin_store_num + ", admin_store_info=" + admin_store_info
				+ ", admin_store_adress=" + admin_store_adress + ", admin_store_img=" + admin_store_img
				+ ", store_definision=" + store_definision + "]";
	}
}

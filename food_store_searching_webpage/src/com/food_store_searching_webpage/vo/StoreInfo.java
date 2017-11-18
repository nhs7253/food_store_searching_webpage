package com.food_store_searching_webpage.vo;

import java.sql.Date;

/**
 * 
 * @author chogo
 *
 */
public class StoreInfo {

	private int adminStoreNum; //    가게 번호
	private String adminStoreInfo;   //가게 정보
	private String adminStoreAdress; //가게 주소
	private Date adminStoreImg ;   //가게 이미지
	private int storeDefinision;   //작성자 구분
	
	public StoreInfo() {
	}

	public StoreInfo(int adminStoreNum, String adminStoreInfo, String adminStoreAdress, Date adminStoreImg,
			int storeDefinision) {
		this.adminStoreNum = adminStoreNum;
		this.adminStoreInfo = adminStoreInfo;
		this.adminStoreAdress = adminStoreAdress;
		this.adminStoreImg = adminStoreImg;
		this.storeDefinision = storeDefinision;
	}

	public int getAdminStoreNum() {
		return adminStoreNum;
	}

	public void setAdminStoreNum(int adminStoreNum) {
		this.adminStoreNum = adminStoreNum;
	}

	public String getAdminStoreInfo() {
		return adminStoreInfo;
	}

	public void setAdminStoreInfo(String adminStoreInfo) {
		this.adminStoreInfo = adminStoreInfo;
	}

	public String getAdminStoreAdress() {
		return adminStoreAdress;
	}

	public void setAdminStoreAdress(String adminStoreAdress) {
		this.adminStoreAdress = adminStoreAdress;
	}

	public Date getAdminStoreImg() {
		return adminStoreImg;
	}

	public void setAdminStoreImg(Date adminStoreImg) {
		this.adminStoreImg = adminStoreImg;
	}

	public int getStoreDefinision() {
		return storeDefinision;
	}

	public void setStoreDefinision(int storeDefinision) {
		this.storeDefinision = storeDefinision;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminStoreAdress == null) ? 0 : adminStoreAdress.hashCode());
		result = prime * result + ((adminStoreImg == null) ? 0 : adminStoreImg.hashCode());
		result = prime * result + ((adminStoreInfo == null) ? 0 : adminStoreInfo.hashCode());
		result = prime * result + adminStoreNum;
		result = prime * result + storeDefinision;
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
		if (adminStoreAdress == null) {
			if (other.adminStoreAdress != null)
				return false;
		} else if (!adminStoreAdress.equals(other.adminStoreAdress))
			return false;
		if (adminStoreImg == null) {
			if (other.adminStoreImg != null)
				return false;
		} else if (!adminStoreImg.equals(other.adminStoreImg))
			return false;
		if (adminStoreInfo == null) {
			if (other.adminStoreInfo != null)
				return false;
		} else if (!adminStoreInfo.equals(other.adminStoreInfo))
			return false;
		if (adminStoreNum != other.adminStoreNum)
			return false;
		if (storeDefinision != other.storeDefinision)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StoreInfo [adminStoreNum=" + adminStoreNum + ", adminStoreInfo=" + adminStoreInfo
				+ ", adminStoreAdress=" + adminStoreAdress + ", adminStoreImg=" + adminStoreImg + ", storeDefinision="
				+ storeDefinision + "]";
	}
	
	
	
}

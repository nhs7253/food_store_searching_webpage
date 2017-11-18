package com.food_store_searching_webpage.vo;

import java.sql.Date;

/**
 * 가게정보 덧글 관리
 * @author hs
 * 가게정보에 대한 뎃글을 담는 객체
 */
public class AdminStoreReple {
	
	private int repleNum; //덧글 번호
	private int adminStoreNum; //가게 번호
	private String repleText; //덧글 내용
	private String repleWriter; //덧글 작성자
	private Date repleDate;  //덧글 작성일자
	
	public AdminStoreReple() {
	}

	public AdminStoreReple(int repleNum, int adminStoreNum, String repleText, String repleWriter, Date repleDate) {
		this.repleNum = repleNum;
		this.adminStoreNum = adminStoreNum;
		this.repleText = repleText;
		this.repleWriter = repleWriter;
		this.repleDate = repleDate;
	}

	public int getRepleNum() {
		return repleNum;
	}

	public void setRepleNum(int repleNum) {
		this.repleNum = repleNum;
	}

	public int getAdminStoreNum() {
		return adminStoreNum;
	}

	public void setAdminStoreNum(int adminStoreNum) {
		this.adminStoreNum = adminStoreNum;
	}

	public String getRepleText() {
		return repleText;
	}

	public void setRepleText(String repleText) {
		this.repleText = repleText;
	}

	public String getRepleWriter() {
		return repleWriter;
	}

	public void setRepleWriter(String repleWriter) {
		this.repleWriter = repleWriter;
	}

	public Date getRepleDate() {
		return repleDate;
	}

	public void setRepleDate(Date repleDate) {
		this.repleDate = repleDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adminStoreNum;
		result = prime * result + ((repleDate == null) ? 0 : repleDate.hashCode());
		result = prime * result + repleNum;
		result = prime * result + ((repleText == null) ? 0 : repleText.hashCode());
		result = prime * result + ((repleWriter == null) ? 0 : repleWriter.hashCode());
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
		AdminStoreReple other = (AdminStoreReple) obj;
		if (adminStoreNum != other.adminStoreNum)
			return false;
		if (repleDate == null) {
			if (other.repleDate != null)
				return false;
		} else if (!repleDate.equals(other.repleDate))
			return false;
		if (repleNum != other.repleNum)
			return false;
		if (repleText == null) {
			if (other.repleText != null)
				return false;
		} else if (!repleText.equals(other.repleText))
			return false;
		if (repleWriter == null) {
			if (other.repleWriter != null)
				return false;
		} else if (!repleWriter.equals(other.repleWriter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AdminStoreReple [repleNum=" + repleNum + ", adminStoreNum=" + adminStoreNum + ", repleText=" + repleText
				+ ", repleWriter=" + repleWriter + ", repleDate=" + repleDate + "]";
	}
}

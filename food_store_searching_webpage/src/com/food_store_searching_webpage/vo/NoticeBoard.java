package com.food_store_searching_webpage.vo;

import java.sql.Date;
/**
 *공지사항 게시판
 * @author chogo
 *공지사항을 저장 하는 곳
 */
public class NoticeBoard {

	
	private int noticeNum;   //글번호        
	private String noticeTitle; //글제목
	private String noticeText;  //글내용          
	private Date noticeDate; // 작성일         
	private int noticeHit;   //조회수
	
	public NoticeBoard() {
	}

	public NoticeBoard(int noticeNum, String noticeTitle, String noticeText, Date noticeDate, int noticeHit) {
		this.noticeNum = noticeNum;
		this.noticeTitle = noticeTitle;
		this.noticeText = noticeText;
		this.noticeDate = noticeDate;
		this.noticeHit = noticeHit;
	}

	public int getNoticeNum() {
		return noticeNum;
	}

	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeText() {
		return noticeText;
	}

	public void setNoticeText(String noticeText) {
		this.noticeText = noticeText;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public int getNoticeHit() {
		return noticeHit;
	}

	public void setNoticeHit(int noticeHit) {
		this.noticeHit = noticeHit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((noticeDate == null) ? 0 : noticeDate.hashCode());
		result = prime * result + noticeHit;
		result = prime * result + noticeNum;
		result = prime * result + ((noticeText == null) ? 0 : noticeText.hashCode());
		result = prime * result + ((noticeTitle == null) ? 0 : noticeTitle.hashCode());
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
		NoticeBoard other = (NoticeBoard) obj;
		if (noticeDate == null) {
			if (other.noticeDate != null)
				return false;
		} else if (!noticeDate.equals(other.noticeDate))
			return false;
		if (noticeHit != other.noticeHit)
			return false;
		if (noticeNum != other.noticeNum)
			return false;
		if (noticeText == null) {
			if (other.noticeText != null)
				return false;
		} else if (!noticeText.equals(other.noticeText))
			return false;
		if (noticeTitle == null) {
			if (other.noticeTitle != null)
				return false;
		} else if (!noticeTitle.equals(other.noticeTitle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NoticeBoard [noticeNum=" + noticeNum + ", noticeTitle=" + noticeTitle + ", noticeText=" + noticeText
				+ ", noticeDate=" + noticeDate + ", noticeHit=" + noticeHit + "]";
	}
	
	
	
}

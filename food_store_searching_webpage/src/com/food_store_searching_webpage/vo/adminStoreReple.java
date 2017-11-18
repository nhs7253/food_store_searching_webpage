package com.food_store_searching_webpage.vo;

import java.sql.Date;

/**
 * 가게정보 덧글 관리
 * @author hs
 * 가게정보에 대한 뎃글을 담는 객체
 */
public class adminStoreReple {
	
	private int reple_num; //덧글 번호
	private int admin_store_num; //가게 번호
	private String reple_text; //덧글 내용
	private String reple_writer; //덧글 작성자
	private Date reple_date;  //덧글 작성일자
	
	public adminStoreReple() {
	}

	public adminStoreReple(int reple_num, int admin_store_num, String reple_text, String reple_writer,
			Date reple_date) {
		this.reple_num = reple_num;
		this.admin_store_num = admin_store_num;
		this.reple_text = reple_text;
		this.reple_writer = reple_writer;
		this.reple_date = reple_date;
	}

	public int getReple_num() {
		return reple_num;
	}

	public void setReple_num(int reple_num) {
		this.reple_num = reple_num;
	}

	public int getAdmin_store_num() {
		return admin_store_num;
	}

	public void setAdmin_store_num(int admin_store_num) {
		this.admin_store_num = admin_store_num;
	}

	public String getReple_text() {
		return reple_text;
	}

	public void setReple_text(String reple_text) {
		this.reple_text = reple_text;
	}

	public String getReple_writer() {
		return reple_writer;
	}

	public void setReple_writer(String reple_writer) {
		this.reple_writer = reple_writer;
	}

	public Date getReple_date() {
		return reple_date;
	}

	public void setReple_date(Date reple_date) {
		this.reple_date = reple_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + admin_store_num;
		result = prime * result + ((reple_date == null) ? 0 : reple_date.hashCode());
		result = prime * result + reple_num;
		result = prime * result + ((reple_text == null) ? 0 : reple_text.hashCode());
		result = prime * result + ((reple_writer == null) ? 0 : reple_writer.hashCode());
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
		adminStoreReple other = (adminStoreReple) obj;
		if (admin_store_num != other.admin_store_num)
			return false;
		if (reple_date == null) {
			if (other.reple_date != null)
				return false;
		} else if (!reple_date.equals(other.reple_date))
			return false;
		if (reple_num != other.reple_num)
			return false;
		if (reple_text == null) {
			if (other.reple_text != null)
				return false;
		} else if (!reple_text.equals(other.reple_text))
			return false;
		if (reple_writer == null) {
			if (other.reple_writer != null)
				return false;
		} else if (!reple_writer.equals(other.reple_writer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "adminStoreReple [reple_num=" + reple_num + ", admin_store_num=" + admin_store_num + ", reple_text="
				+ reple_text + ", reple_writer=" + reple_writer + ", reple_date=" + reple_date + "]";
	}
}

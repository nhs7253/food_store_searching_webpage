package com.food_store_searching_webpage.vo;

/**
 * 사이트 소개
 * @author hs
 * 사이트 소개글을 담는 객체
 */
public class SightIntro {
	
	private String intro; //사이트 소개글

	public SightIntro() {
	}

	public SightIntro(String intro) {
		this.intro = intro;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intro == null) ? 0 : intro.hashCode());
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
		SightIntro other = (SightIntro) obj;
		if (intro == null) {
			if (other.intro != null)
				return false;
		} else if (!intro.equals(other.intro))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SightIntro [intro=" + intro + "]";
	}
}

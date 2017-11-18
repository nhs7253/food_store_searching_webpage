package com.food_store_searching_webpage.service;

import com.food_store_searching_webpage.vo.SightIntro;

/**
 * 사이트 소개글 관리 Service
 * @author hs
 * 사이트 소개글 관리 Service
 */
public interface SightIntroService {

	/**
	 * 사이트 소개글을 조회
	 * @return SightIntro - 사이트 소개글 내용이 담긴 객체
	 */
	SightIntro viewSightIntro();
	
	/**
	 * 사이트 소개글 작성
	 * @param context String - 사이트 소개글 내용
	 * @return int 반영 개수
	 */
	int writeSightIntro(String context);
	
	/**
	 * 사이트 소개글 삭제
	 * @return int 반영 개수
	 */
	int removeSightIntro();
	
	/**
	 * 사이트 소개글 변경
	 * @param context String 변경할 내용
	 * @return int 반영 개수
	 */
	int editSightIntro(String context);
}

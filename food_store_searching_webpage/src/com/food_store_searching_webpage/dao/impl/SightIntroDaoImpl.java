package com.food_store_searching_webpage.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food_store_searching_webpage.dao.SightIntroDao;
import com.food_store_searching_webpage.vo.SightIntro;

@Repository
/**
 * 사이트 소개글 관리
 * @author hs
 * 사이트 소개글의 CRUD
 */
public class SightIntroDaoImpl implements SightIntroDao{

	@Autowired
	private SqlSessionTemplate session;
	
	private String namespace="com.food_store_searching_webpage.config.mybatis.mapper.SightIntroMapper.";
	
	@Override
	public SightIntro selectSightIntro() {
		return session.selectOne(namespace+"selectSightIntro");
	}

	@Override
	public int insertSightIntro(String context) {
		return session.insert(namespace+"insertSightIntro", context);
	}

	@Override
	public int deleteSightIntro() {
		return session.delete(namespace+"deleteSightIntro");
	}

	@Override
	public int updateSightIntro(String context) {
		return session.update(namespace+"updateSightIntro",context);
	}

}

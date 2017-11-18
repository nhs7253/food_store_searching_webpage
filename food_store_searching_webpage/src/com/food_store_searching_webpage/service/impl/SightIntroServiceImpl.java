package com.food_store_searching_webpage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food_store_searching_webpage.dao.SightIntroDao;
import com.food_store_searching_webpage.service.SightIntroService;
import com.food_store_searching_webpage.vo.SightIntro;

@Service
/**
 * 사이트 소개글 관리 Service
 * @author hs
 * 사이트 소개글 관리 Service
 */
public class SightIntroServiceImpl implements SightIntroService{

	@Autowired
	private SightIntroDao sightIntroDao;
	
	@Override
	public SightIntro viewSightIntro() {
		return sightIntroDao.selectSightIntro();
	}

	@Override
	public int writeSightIntro(String context) {
		return sightIntroDao.insertSightIntro(context);
	}

	@Override
	public int removeSightIntro() {
		return sightIntroDao.deleteSightIntro();
	}

	@Override
	public int editSightIntro(String context) {
		return sightIntroDao.updateSightIntro(context);
	}
	
}

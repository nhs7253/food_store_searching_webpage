package com.food_store_searching_webpage.dao.impl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.food_store_searching_webpage.dao.SightIntroDao;

@Component
public class SightIntroDaoImplTest {
	@Autowired
	private SightIntroDao dao;
	
	public SightIntroDaoImplTest() {
	}

	public SightIntroDaoImplTest(SightIntroDao dao) {
		this.dao = dao;
	}
	
	public void Test() {
		System.out.println("최초 조회");
		
		System.out.println(dao.deleteSightIntro());
		
		System.out.println(dao.insertSightIntro("내용 입니다."));
		
		System.out.println(dao.selectSightIntro());
		
		System.out.println(dao.updateSightIntro("변경 내용 입니다."));
		
		System.out.println(dao.selectSightIntro());

		System.out.println(dao.deleteSightIntro());
		
		System.out.println(dao.selectSightIntro());

		System.out.println("!!!!!!!!!!!!!!!!!!!!!    이상 없음    !!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public static void main(String[] args) {
		SightIntroDaoImplTest daoTest = (SightIntroDaoImplTest) new ClassPathXmlApplicationContext(
				"com/food_store_searching_webpage/config/spring/model-context.xml").getBean("sightIntroDaoImplTest");
		daoTest.Test();

	}
}

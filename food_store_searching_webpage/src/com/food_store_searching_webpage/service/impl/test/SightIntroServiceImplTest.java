package com.food_store_searching_webpage.service.impl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.food_store_searching_webpage.service.SightIntroService;

@Component
public class SightIntroServiceImplTest {
	
	@Autowired
	private SightIntroService service;
	
	public void Test(){
		System.out.println("서비스 테스트 시작");
		
		System.out.println(service.writeSightIntro("서비스 글입니다."));
		
		System.out.println(service.viewSightIntro());
		
		System.out.println(service.editSightIntro("서비스 글 수정입니다."));
		
		System.out.println(service.viewSightIntro());
		
		System.out.println(service.removeSightIntro());
		
		System.out.println(service.viewSightIntro());
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!    이상 없음    !!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public static void main(String[] args) {
		
		SightIntroServiceImplTest serviceTest = 
				(SightIntroServiceImplTest)new ClassPathXmlApplicationContext("com/food_store_searching_webpage/config/spring/model-context.xml").getBean("sightIntroServiceImplTest");
		serviceTest.Test();
		
	}
}

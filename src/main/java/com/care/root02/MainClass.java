package com.care.root02;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationST.xml";
		//우리가 만든 bean을 얻어오기(해당 컨테이너의 정보를 가져옴)
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		
		STBean stBean =ctx.getBean("stb",STBean.class);//STBean.class는 자료형임
				
		//STBean stBean = new STBean();
		//stBean.setName("홍길동2");
		//SstBean.setAge(24);
		
		//stBean.setSt(new Student());
		stBean.namePrint();
		stBean.agePrint();
	}

}

package com.care.di_test;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("아무거나 입력: ");
		String a= input.next();
		String path="classpath:application_test.xml";
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		
		PrintBean pb = ctx.getBean("pb",PrintBean.class);
		//PrintBean pb = new PrintBean();
		//PrintString ps = new PrintString();
		
		pb.setPrint(a);
		//pb.setPs(ps);
		pb.printString();
	}
}

package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("두 수 입력: ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.print("연산자 입력: ");
		String op=input.next();
		
		String path="classpath:application_test02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		SaveClass sc = ctx.getBean("sc",SaveClass.class);
		
		//OperationClass oc=new OperationClass();
		//SaveClass sc = new SaveClass();
		//PrintClass pc= new PrintClass();
		//sc.setOc(oc);
		//sc.setPc(pc);
		sc.setNum1(num1);
		sc.setNum2(num2);
		sc.setOp(op);
		
		sc.operationClass();
		sc.printClass();
		/*
		  int result = oc.operation(num1, num2, op); 
		  PrintClass pc= new PrintClass();
		  pc.printFunc(num1, op, num2, result);
		 */
		
		
	}
}

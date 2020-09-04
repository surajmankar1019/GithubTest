package com.cjc2;

public class Demo2 {

	public Demo2(){
		System.out.println("construcor--A");
	}
	
	static
	{
		System.out.println("Static--Block");
	}
	{
		System.out.println("Non-Static---Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		
		Demo2 d=new Demo2();
		Demo2 d1=new Demo2();
	}
}

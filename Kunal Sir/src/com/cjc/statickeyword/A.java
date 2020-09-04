package com.cjc.statickeyword;

public class A {

	static int a;
	int b;
	
	public static void main(String[] args) {
		
		A s=new A();
		s.a=100;
		s.b=100;
		
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println("------------");
		
		A s1=new A();
		s1.a=200;
		s1.b=200;
		
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s1.a);
		System.out.println(s1.b);
	}
}

package com.cjc.finalkeyword;

public class A {

	int x;
	
	public static void main(String[] args) {
		
		A a=new A();
		a.x=100;
		
		A a1=new A();
		a1.x=200;
		
		System.out.println(a.x);
		System.out.println(a1.x);
		
		a=a1;
		
		System.out.println(a.x);
		System.out.println(a.x);
		
	}
}

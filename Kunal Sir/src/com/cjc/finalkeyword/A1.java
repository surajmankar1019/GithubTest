package com.cjc.finalkeyword;

public class A1 {

	int x;
	
	public static void main(String[] args) {
		
		final A a=new A();
		a.x=100;
		
		A a1=new A();
		a1.x=200;
		
		System.out.println(a.x);
		System.out.println(a1.x);
		
		a1=a;
//		a=a1; -- compiler error because final return cant change
		
		System.out.println(a.x);
		System.out.println(a1.x);
		
	}
}

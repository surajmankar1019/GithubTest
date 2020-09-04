package com.cjc.statickeyword;

public class B {

	static int x;
	int y;
	
	public static void main(String[] args) {
		
		B a=new B();
		a.x=100;
		a.y=100;
		
		B b=new B();
		b.x=50;
		b.y=50;
		
		B b1=new B();
		
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b1.x);
		System.out.println(b1.y);
	}
}

package com.cjc.inheritancecomplilerrule;

public class Test1 {
	
	public static void main(String[] args) {
		
		B b=new C();
		b.m1();
		b.m2();
		b.m3();
		System.out.println(b.a);
		System.out.println(b.b);
	}

}

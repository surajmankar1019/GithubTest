package com.inheritance.object;

public class Test {

	public static void main(String[] args) {
		
		B b=new C();
		b.m1();
		b.m2();
		b.m3();
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.c);
	}
}

package com.returntypeclassname;

public class B {

	int x;
	
	public static void main(String[] args) {
		
		A a=new A();
		a.x=100;
		System.out.println(a.x);
		C c=new C();
		c.m1(a);
	
		System.out.println(a.x);
	}
}

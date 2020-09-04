package com.returntypeclassname;

public class A {
	
	int x;

	public A m1(){
		A a=new A();
		a.x=100;
//		System.out.println(a.x);
		return a;
	}
	
	public static void main(String[] args) {
		
		A a=new A();
		
		A a1=a.m1();
		
		System.out.println(a.x);
		System.out.println(a1.x);
	}
}

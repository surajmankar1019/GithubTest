package com.cjc.oops.inheritance.type1;

public class Test {

	public static void main(String[] args) {
		
		A a=new A();
		a.m1(); 
		a.m2();
		System.out.println(a.a);
		System.out.println(a.b);
		
		System.out.println("-----------------");
		
		A a1=new B();
		a1.m1(); // M1--B
		a1.m2(); // M2--A
//		a1.m3();---- Compiler error
		
		System.out.println(a1.a); // 10
		System.out.println(a1.b); // 20
		
		
	}
}

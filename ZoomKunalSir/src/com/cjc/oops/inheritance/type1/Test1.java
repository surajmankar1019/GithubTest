package com.cjc.oops.inheritance.type1;

public class Test1 {

	public static void main(String[] args) {
		
		A1 a=new A1();
		a.m1(); // M1--A
		a.m2(); // M2--A
		System.out.println(a.a); // 10
		System.out.println(a.b); // 20
		
		System.out.println("--------------");
		
		A1 a1=new B1();
		a1.m1(); // M1--B
		a1.m2(); // M2--A
		System.out.println(a1.a); // 10
		System.out.println(a1.b); // 20
		
		System.out.println("--------------");
		
		B1 b=new C1();
		b.m1(); // M1--B
		b.m2(); // M2--C
		b.m3(); // M3--C
		System.out.println(b.a); // 30
		System.out.println(b.b); // 20
		System.out.println(b.c); // 40
		
		
	}
}

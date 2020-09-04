package com.typecastingusingreturntype;

public class Test {

	public A m1()
	{
		A a=new A();
		B b=new B();
		C c=new C();
		
//		return a;
//		return b;
		return c;
	}
	public static void main(String[] args) {
		Test t=new Test();
		A a=t.m1();
		B b=(B) t.m1();
		C c=(C) t.m1();
		
	}
}

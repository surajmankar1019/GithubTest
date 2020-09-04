package com.oops.polymorphism.overiding;

public class B extends A{

	public void m1()
	{
		System.out.println("M1--B");
	}
	
	public static void main(String[] args) {
		
		B b=new B();
		b.m1();
		
		A a=new B();
		a.m1();
		
		A a1=new A();
		a1.m1();
	}
}

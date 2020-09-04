package com.oops.polymorphism.overloading.narrowing;

public class A1 {

	public void m1(String s)
	{
		System.out.println("M1--String");
	}
	public void m1(A a)
	{
		System.out.println("M1--A");
	}
	public void m1(Object o)
	{
		System.out.println("M1--Object");
	}
}

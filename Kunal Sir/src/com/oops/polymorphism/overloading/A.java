package com.oops.polymorphism.overloading;

public class A {
	
    public void m1()
    {
    	System.out.println("M1--A");
    }
	public void m1(int i)
	{
		System.out.println("M1--Int");
		System.out.println(i);
	}
	public void m1(String s)
	{
		System.out.println("M1--String");
		System.out.println(s);
	}
	public void m1(int i,String s)
	{
		System.out.println("M1--int--String");
		System.out.println(i);
		System.out.println(s);
	}
}

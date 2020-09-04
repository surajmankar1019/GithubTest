package com.oops.polymorphism.overloading.narrowing;

public class Test2 {

	public void m1(Object o)
	{
		System.out.println("M1--Object");
	}
	public void m1(String s)
	{
		System.out.println("M1--String");
	}
	public void m1(A a)
	{
		System.out.println("M1--A");
	}
  public static void main(String[] args) {
		
	   	Test2 t=new Test2();
//		t.m1(null); --compiler Error
	   	t.m1((Object)null);
	   	t.m1((String)null);
	   	t.m1((A)null);
	}
}

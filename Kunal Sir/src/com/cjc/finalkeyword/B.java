package com.cjc.finalkeyword;

public class B {

	public void m1(final int x)
	{
//		x=x+4; -- Compiler error
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		B b=new B();
		b.m1(3);
		
	}
	
}

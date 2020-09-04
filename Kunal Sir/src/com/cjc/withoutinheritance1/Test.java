package com.cjc.withoutinheritance1;

public class Test 
{
   public static void main(String[] args) 
   {
	   B b=new B();
	   b.m2();
	   b.a.m1();
	   System.out.println(b.a.x);
	   
   }
}

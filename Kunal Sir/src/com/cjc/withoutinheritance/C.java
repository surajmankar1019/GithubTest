package com.cjc.withoutinheritance;

public class C extends A
{
   public void m3()
   {
	   m1();
	  System.out.println(x);   
   }
   public static void main(String[] args) {
	 
	   C c=new C();
	   c.m3();
	   
	 A a=new A();
	   a.m1();
   }
   
}

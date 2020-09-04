package com.cjc1;

public class A 
{
   public void m1(){
	   System.out.println("M1--A");
   }
   public static void main(String[] args) {
	 
	   System.out.println("Main Starts");
      
	   A a=new A();
	   a.m1();
	   
	   B b= new B();
	   b.m2();
	   
	   C c=new C();
	   c.m3();
	   
//	   A a=new C();
   }
}

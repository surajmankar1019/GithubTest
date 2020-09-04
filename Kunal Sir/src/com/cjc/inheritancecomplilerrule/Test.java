package com.cjc.inheritancecomplilerrule;

public class Test 
{
    public static void main(String[] args) {
		
    	A a=new A();
    	a.m1();
    	a.m2();
    	System.out.println(a.a);
    	System.out.println(a.b);
	
    	System.out.println();
    	
       A a1=new B();
         a1.m1();
         a1.m2();
         System.out.println(a1.a);
         System.out.println(a1.b);
         
         System.out.println();
         
       B b=new B();
       b.m1();
       b.m2();
       b.m3();
       System.out.println(b.a);
       System.out.println(b.b);
    }
}

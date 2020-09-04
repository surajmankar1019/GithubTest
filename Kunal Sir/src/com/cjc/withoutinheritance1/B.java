package com.cjc.withoutinheritance1;

public class B 
{
	A a=new A();
	
    public void m2()
    {
      a.m1();
      System.out.println(a.x);
      System.out.println("--M2");
    }
    
    
}

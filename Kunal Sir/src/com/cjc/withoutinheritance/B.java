package com.cjc.withoutinheritance;

public class B 
{
    public void m2()
    {
       System.out.println("--M2");	
    }
    public static void main(String[] args) {
	
    	A a=new A();
        a.m1();
        System.out.println(a.x);
	}
    
}

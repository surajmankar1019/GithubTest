package com.core;

public class Demo {
	
     int x;
     
     public Demo m1(){
    	 
    	 Demo a=new Demo();
    	 a.x=100;
    	 return a;
     }
     public static void main(String[] args) {
		
    	 Demo a=new Demo();
    	 Demo a1=a.m1();
    	 System.out.println(a.x);  // 0
    	 System.out.println(a1.x); // 100
	}
}

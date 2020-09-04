package com.inheritance.surajpractice;

public class B extends A{
	
     int a=2000;
     int b=3000;
     
     public void m1(){
    	 System.out.println("M1---B");
     }
     
     public void m2(){
    	 
    	 System.out.println("M2--B");
     }
     
     
     
     public static void main(String[] args) {
		
    	 B b=new B();
    	 System.out.println("Variable is="+b.a);
    	 System.out.println("Variable is="+b.b);
    	 b.m1();
    	 b.m2();
    	 b.m3();
    System.out.println("-------------------------------");
    
        A a=new B();
          System.out.println(a.a);
//        System.out.println(a.b);
        a.m1();
        a.m3();
        a.m2();
        
    System.out.println("-------------------------------");
       
         A a1=new A();
         a1.m1();
         a1.m2();
         a.m3();
         
         System.out.println(a1.a);
	}
       
//        B b1=new A(); C T Error
}


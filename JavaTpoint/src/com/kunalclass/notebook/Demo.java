package com.kunalclass.notebook;

public class Demo {

	public static void main(String[] args) {
		
		C c=new D();
		  c.m1();
		  c.m2();
		  System.out.println(c.a);
		  System.out.println(c.b);
		  
		  System.out.println("-----------------");
		  
		  C c1=new C();
		    c1.m1();
		    c1.m2();
		    System.out.println(c1.a);
		    System.out.println(c1.b);
		    
		    System.out.println("-----------------");
		    
		 D d=new D();
		 d.m1();
		 d.m2();
		 d.m3();
		 System.out.println(d.a);
		 System.out.println(d.b);
	}
	
	   
}

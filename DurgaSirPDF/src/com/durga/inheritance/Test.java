package com.durga.inheritance;

public class Test 
{
     public static void main(String[] args) {
		
    	 Parent p=new Parent();
    	 p.m1();
//    	 p.m2(); --- We can not access child methods using parent class reference
    	 
    	 Child c=new Child();
    	 c.m1();  //---Using child class ref we can access both Parent and child class ref.
    	 c.m2();
    	 
    	 Parent p1=new Child();
    	 p1.m1();
//    	 p1.m2();  ----  cannot find symbol
    	 
//    	 Child c1=new Parent();   ----we cant create object like this 
//    	                              i,e incompatible types;
	}
}

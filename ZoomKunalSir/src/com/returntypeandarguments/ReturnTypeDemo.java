package com.returntypeandarguments;

public class ReturnTypeDemo {

	public int m1(){
		
		System.out.println("M1--A");
		
     return 10;
	}
	
	public String m2(){
		System.out.println("M2--A");
		return "Suraj Mankar";
	}
	
//	 --------- Return Type With Parameters ---------
	public int m3(int i){
		System.out.println("M3--A");
		return i;
		}
	public static void main(String[] args) {
		
		ReturnTypeDemo rt=new ReturnTypeDemo();
		rt.m1();
		System.out.println(rt.m1());
		rt.m2();
		System.out.println(rt.m2());
		rt.m3(40);
		System.out.println(rt.m3(30));
	}
}

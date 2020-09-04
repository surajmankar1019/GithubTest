package com.typecaste.methodreturntype;

public class Test {
	
	public String m1()
	{
		
		return "CJC";
	}

	public Object m2()
	{
		return "Pune";
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		String s=t.m1();
		
		String s1=(String) t.m2();
		
		System.out.println(s);
		System.out.println(s1);
	}
}

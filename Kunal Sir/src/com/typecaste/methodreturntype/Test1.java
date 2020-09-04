package com.typecaste.methodreturntype;

public class Test1 {
    public int m1()
	{
		return 10;
	}
	public Object m2()
	{
		return 20;
//		return 10.2f;
	}
	 public float m3()
	{
	 return 10.2f;
    }
	public static void main(String[] args) {
		Test1 t=new Test1();
		int x=t.m1();
		int i=(int) t.m2();
		float f=t.m3();
		int j=x+i;
		System.out.println(f);
		System.out.println(x);
		System.out.println(i);
		System.out.println("Sum J="+j);
	}
}

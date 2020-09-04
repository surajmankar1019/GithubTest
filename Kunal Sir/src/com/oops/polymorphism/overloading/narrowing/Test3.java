package com.oops.polymorphism.overloading.narrowing;import com.cjc.inheritancecomplilerrule.B;

public class Test3 {

	public void m1(B2 a)
	{
		System.out.println("M1--B--Parameter");
	}
	public void m1(A2 a)
	{
		System.out.println("M1--A--Parameter");
	}
	public void m1(C2 c)
	{
		System.out.println("M1--C--Parameter");
	}
    public static void main(String[] args) {
		
	 	Test3 t=new Test3();
		t.m1(null);
		B2 b=new B2();
		t.m1(null);
		t.m1((A2)b);
		C2 c=new C2();
		t.m1(c);
		
		}
}

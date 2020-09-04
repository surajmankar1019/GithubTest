package com.returntypeclassname;

public class Test1 {

	
	public void m1(Student stu){
		
		System.out.println(stu);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
		
		System.out.println(stu);
	}
	
	public static void main(String[] args) {
			
		
		
		Student s1=new Student();
		
		s1.setRollno(1);
		s1.setName("Suraj");
		s1.setAddr("Amt");
		
		Test1 t=new Test1();
		      t.m1(s1);
		
	}
}

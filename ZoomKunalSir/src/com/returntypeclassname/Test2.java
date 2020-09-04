package com.returntypeclassname;

public class Test2 {

	public Student m1(Student stu){
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
//		System.out.println(stu);
		return stu;
		}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.setRollno(1);
		s.setName("ABC");
		s.setAddr("Pune");
		
		Test2 t=new Test2();
		t.m1(s);
	}
}

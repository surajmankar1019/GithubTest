package com.cjc.collection.sorting;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Student s1=new Student();
		        s1.setRollno(3);;
		        s1.setName("ccc");
	    Student s2=new Student();
		        s2.setRollno(2);;
		        s2.setName("aaa");
		Student s3=new Student();
		        s3.setRollno(1);;
		        s3.setName("bbb");
		        
		Set<Student> s=new TreeSet<>();
		             s.add(s1);
		             s.add(s2);
		             s.add(s3);
		for(Student stu:s)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}
	}
}

package com.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class TestJavaCollection4 {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<>();
		s.add("Suraj");
		s.add("Avi");
		s.add("Ketan");
		s.add("Avi");
		s.add("Achal");
		
		s.pop(); // Removes Achal
		s.push("Suraj");// Suraj
		Iterator<String> itr=s.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}
}

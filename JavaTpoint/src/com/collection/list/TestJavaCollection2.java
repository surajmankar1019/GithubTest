package com.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection2 {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Suraj");
		ll.add("Avi");
		ll.add("Suraj");
		ll.add("Ketan");
		ll.add("Avi");
		
		Iterator<String> itr=ll.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

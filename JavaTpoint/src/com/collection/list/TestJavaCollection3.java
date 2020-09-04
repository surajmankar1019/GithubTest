package com.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class TestJavaCollection3 {
	
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<>();
		v.add("Suraj");
		v.add("Ketan");
		v.add("Suraj");
		v.add("Avi");
		v.add("Shalesh");
		
		Iterator<String> itr=v.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

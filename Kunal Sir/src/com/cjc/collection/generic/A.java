package com.cjc.collection.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList();
		l.add("aaa");
		l.add("bbb");
		l.add("ddd");
		l.add("aaa");
		
		System.out.println(l);
		
		String s=(String) l.get(3);
//		System.out.println(s);
		
//		int x=(int) l.get(0);
		
//		Iterator itr=l.iterator();
		
		for(String s1: l)
		{
			System.out.println(s1);
		}
	}
}

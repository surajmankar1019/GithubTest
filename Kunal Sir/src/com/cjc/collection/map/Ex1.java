package com.cjc.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<>();
		m.put(5,"Java");
		m.put(10, "Python");
		m.put(15, "C++");
		m.put(20, "Spring");
		System.out.println(m);
		m.put(5, "CJC");
		System.out.println(m);
		
		String val=m.get(10);
		System.out.println(val);
		String val1=m.get(20);
		System.out.println(val1);
		System.out.println(m);
		Set<Integer> keys=m.keySet();
		System.out.println(keys);
		System.out.println("-------------");
		
		Iterator<Integer> itr=keys.iterator();
		
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println(key);
//			System.out.println("-------------");
			
			String val2=m.get(key);
			System.out.println(val2);
		}
	}
}

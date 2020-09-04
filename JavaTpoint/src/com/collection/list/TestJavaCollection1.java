package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1 
{
   public static void main(String[] args) {
	
	    ArrayList<String> list=new ArrayList<>();
	     list.add("Suraj");
	     list.add("Ketan");
	     list.add("Shailesh");
	     list.add("Sonal");
	     list.add("Amit");
	     
	     System.out.println(list);
	     
	     System.out.println();
	     
	     Iterator<String> itr=list.iterator();
	     
	     while(itr.hasNext()){
	    	 
	    	 System.out.println(itr.next());
	    	 
	     }
     }
}

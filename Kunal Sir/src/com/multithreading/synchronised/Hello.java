package com.multithreading.synchronised;

public class Hello {

	public synchronized void display(String msg)
	{
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
	}
}

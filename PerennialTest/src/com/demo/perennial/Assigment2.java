package com.demo.perennial;

public class Assigment2 {
public static void main(String[] args) {
	for(int i=1;i<=100;i++)
	{
		
		//System.out.println(1/5);
		if(i%5==0)
		{
			System.out.print("Foo" +" ");
			continue;
		}
		else if(i%7==0)
		{
			System.out.print("Bar"+ " ");
			continue;
		}
		else if(i%5==0 & i%7==0)
		{
			System.out.print("FooBar");
			continue;
		}
		System.out.print(i +" ");
		/*switch (i/5){
		case 1: System.out.print("Foo" +" ");
			break;

		default:
			break;
		}
		System.out.print(i +" ");
*/	}
}
}

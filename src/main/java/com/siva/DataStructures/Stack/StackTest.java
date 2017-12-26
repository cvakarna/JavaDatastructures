package com.siva.DataStructures.Stack;

public class StackTest {
	//main
	public static void doAdd()
	{
		StatckImplementation s = new StatckImplementation(10);
		int i,j;
		
		System.out.println("starting........");
		/*for ( i = 0; i <10 ; i++) {
			j= (int) (Math.random()*10);
			s.push(j);
			System.out.println("push:"+j);
			}
		while(!s.isEmpty())
		{
			System.out.println("pop:"+s.pop());
		}*/
		String[] strings = {"one", "two" , "three"};
		for (int k = 0; k < strings.length; k++) {
			s.push(strings[k]);
			System.out.println("push:"+strings[k]);
		}
		while(!s.isEmpty())
		{
			System.out.println("pop:"+s.pop());
		}
		System.out.println("Done!!");
		
		
	}
	public static void main(String[] args) {
		doAdd();
		
	}

}

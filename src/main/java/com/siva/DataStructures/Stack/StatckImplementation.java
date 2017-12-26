package com.siva.DataStructures.Stack;

public class StatckImplementation {
	protected Object[] head;
	protected int pointer;
	public StatckImplementation(int capacity) {
		head = new Object[capacity];
		pointer = -1;
	}
	public boolean isEmpty()
	{
		return pointer== -1;
	}
   public void push(Object i)
   {
	   if(pointer+1<head.length)
	   {
		   head[++pointer] = i;
	   }
   }
   public Object pop()
   {
	   if(isEmpty())
	   {
		   return  null;
	   }
	   return head[pointer--];
   }
}

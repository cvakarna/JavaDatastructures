package com.siva.DataStructures.Nodes;

public class OneChildNode {
	protected Object data;//declare object
	protected OneChildNode next;//declare object
	public OneChildNode() {//concstructor
	  data = null;
	  next = null;
	  
	}
	public OneChildNode(Object d, OneChildNode n)
	{
		data = d;
		next = n;
	}
	public void setNext(OneChildNode n)
	{
		next =n;
	}
	public void setData(Object d)
	{
		data = d;
		
	}
	public Object getData()
	{
		return data;
	}
	public OneChildNode getNext()
	{
		return next;
	}
  @Override
public String toString() {
	
	return ""+data;
}
}

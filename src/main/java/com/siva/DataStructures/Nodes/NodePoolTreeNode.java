package com.siva.DataStructures.Nodes;

public class NodePoolTreeNode {
	//declare obj and variables
	private Object data;
	private int left;
	private int right;
	//zero parameterized constructor
	public NodePoolTreeNode() {
		left = right
				= -1;
		data = null;
		
	}
	//parametorized constructor
	public NodePoolTreeNode(int left , int right)
	{
		this.left = left;
		this.right = right;
		data = null;
	}
	//setters and getters of data obj
	public Object getData()
	{
		return data;
	}
	public void setData(Object obj)
	{
		data = obj;
	}
	
	//setters and getters of left and right
	public int getLeft()
	{
		return left;
		
	}
	public void setLeft(int left)
	{
		this.left = left;
	}
	public int getRight()
	{
		return right;
	}
	public void setRight(int right)
	{
		this.right=  right;
	}
	@Override
	public String toString() {
		return new String(data.toString());
	}
}
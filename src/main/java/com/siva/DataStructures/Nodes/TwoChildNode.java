package com.siva.DataStructures.Nodes;

public class TwoChildNode {
	protected Object data;
	protected TwoChildNode left,right;
	public TwoChildNode()
	{
		data = null;
		left=null;
		right = null;
	}
 public TwoChildNode(Object d)
 {
	 data = d;
	 left = right = null;
 }
public TwoChildNode getLeft() {
	return left;
}
public void setLeft(TwoChildNode left) {
	this.left = left;
}
public TwoChildNode getRight() {
	return right;
}
public void setRight(TwoChildNode right) {
	this.right = right;
}
public Object getData() {
	return data;
}
public void setData(Object data) {
	this.data = data;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return ""+data;
}
 
}

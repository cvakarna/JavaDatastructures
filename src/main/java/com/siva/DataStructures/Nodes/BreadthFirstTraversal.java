package com.siva.DataStructures.Nodes;

public class BreadthFirstTraversal extends BinarySearchTree{
	public void breadth_first()
	{
		EasyQueue q = new  EasyQueue();
		TwoChildNode tmp;
		q.insert(getRoot());
		while(!q.isEmpty())
		{
			tmp = (TwoChildNode) q.remove();
			if(tmp.getLeft()!=null)
				q.insert(tmp.getLeft());
			if(tmp.getRight()!=null)
				q.insert(tmp.getRight());
			System.out.println(tmp.getData()+" ");
		}
	}

}

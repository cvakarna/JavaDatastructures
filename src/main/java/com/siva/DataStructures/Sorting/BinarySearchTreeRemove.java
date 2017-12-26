package com.siva.DataStructures.Sorting;

public class BinarySearchTreeRemove {
	public BinarySearchTreeRemove left,right;
	public Comparable data;
	
	//method for adding elements into tree
	public static BinarySearchTreeRemove tree_AddNumber(BinarySearchTreeRemove r,Comparable n)
	{
		if(r==null)
		{
			r=  new BinarySearchTreeRemove();
			r.left = r.right = null;
			r.data = n;
			
		}
		else if(r.data.compareTo(n) < 0)
		{
			  r.right = tree_AddNumber(r.right,n);
			  
		}
	    else if(r.data.compareTo(n) > 0)
            r.left = tree_AddNumber(r.left,n);
        return r;
	}
 
	//method for removing elements in the tree
	  public static BinarySearchTreeRemove tree_removeNumber(
			  BinarySearchTreeRemove r,Comparable n)
	  {
		  if(r != null)
		  {
			  if(r.data.compareTo(n) < 0)
			  {
				  r.right = tree_removeNumber(r.right,n);
				  
			  }
			  else if(r.data.compareTo(n) > 0){
	                r.left = tree_removeNumber(r.left,n);
	                
	                	
		  }
			  else
				  if(r.left == null && r.right == null)
					  r=null;
				  else if(r.left != null && r.right == null)
					  r = r.left;
				  else if(r.right != null && r.left == null)
					  r = r.right;
				  else{
	                    if(r.right.left == null){
	                        r.right.left = r.left;
	                        r = r.right;
	                    }
	                    else
	                    {
	                    	BinarySearchTreeRemove   q,p = r.right;
	                         while(p.left.left != null)
	                             p = p.left;
	                         q = p.left;
	                         p.left = q.right;
	                         q.left = r.left;
	                         q.right = r.right;
	                         r = q;
	                     }
	                    }
	  }
		 

	  return r;
	  
}
	  //order method
	  
	  public static void tree_InorderPrint(BinarySearchTreeRemove r )
	  {
		  if(r!=null)
		  {
			  tree_InorderPrint(r.left);
			  System.out.print("  "+r.data);
			  tree_InorderPrint(r.right);
			  
		  }
		  
	  }
	  
	  //input method
	  public static void read()
	  {
		  BinarySearchTreeRemove tree = null;
		  int[] numbers = {56,86,71,97,82,99,65,36,16,10,28,52,46};
		  System.out.println("inserting.....");
		  for (int i = 0; i < numbers.length; i++) {
			  Integer n = new Integer(numbers[i]);
			  System.out.print(" "+n);
			  tree = tree_AddNumber(tree, n);
		
			 }//end for
		  System.out.println("\n tree.");
		  tree_InorderPrint(tree);
		  for (int i = 0; i < numbers.length; i++) {
			  Integer n = new Integer(numbers[i]);
			  System.out.print("\nremove:"+n);
			  tree = tree_removeNumber(tree, n);
			  tree_InorderPrint(tree);
			 }//end for
		  
		  System.out.println("\n Done!....");
	  }//end method
	  
	  //main method start
	 public static void main(String[] args) {
		 //invoke the read method
		 read();
		
	}
	 
	}


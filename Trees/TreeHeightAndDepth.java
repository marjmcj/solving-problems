	/*
    Assuming node is defined as:
     Class Node 
    	int data;
    	Node left;
    	Node right;
	*/
  
  
//The height of a tree is equivalent to its depth.
  
public static int height(Node root)
{

    return depth(root);
}

public static int depth(Node root)
{
    // Write your code here.

    if (root == null)
    {
        return 0;
    }
    return Math.max(depth(root.left), depth(root.right)) + 1; 

}

/*
    PreOrder Traversal: Root, Left, Right
*/

public static void preOrder(Node root)
{
  if(root == null)
  {
      return;
  }
  System.out.print(root.data + " ");  
  preOrder(root.left);
  preOrder(root.right);

}

/*
    InOrder Traversal: Left, Root, Right
*/

public static void inOrder(Node root)
{
  if(root == null)
  {
      return;
  }
  preOrder(root.left);
  System.out.print(root.data + " ");  
  preOrder(root.right);
}

/*
    postOrder Traversal: Left, Right, Root
*/
public static void postOrder(Node root)
{
    if(root == null)
    {
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");

}




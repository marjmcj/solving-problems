/* 
Assuming we have Node defined as:
class Node
    int data;
    Node left;
    Node right;
*/


public static Node insert(Node root,int data)
{
    if(root == null)
    {
       Node newTree = new Node(data);
       return newTree;
    }
    insertRecursively(root, data);
    return root;

}

/*
     Left child must always be smaller than the root(parent).
     Right child must always be bigger than the root(parent).
*/
public static void insertRecursively(Node root,int value)
{
    if(root == null)
    {
        return;
    }
    if(value > root.data)
    {
        if(root.right == null)
        {
            insertChild(root, value, true);
        }
        else 
        {
            insertRecursively(root.right, value);
        }
    }
    else
    {
        if(root.left == null)
        {
            insertChild(root, value, false);
        }
        else
        {
            insertRecursively(root.left, value);
        }
    }
}
public static void insertChild(Node root, int value, boolean isRightChild)
{
    Node newNode = new Node(value);
    if(isRightChild)
    {
        root.right = newNode;
    }
    else
    {
        root.left = newNode;
    }

}

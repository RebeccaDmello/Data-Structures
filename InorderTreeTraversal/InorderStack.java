package InorderTreeTraversal;

import java.util.Stack; 

class Node 
{ 
    int data; 
    Node left, right; 
  
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 

@SuppressWarnings("unchecked")
class InorderStack
{
    Node root;
    public static void inOrderTraversal(Node root)
    {
      StackMethods<Node> stack = new StackMethods();
      Node curr = root;
      while (!stack.isEmpty() || curr != null)
      {
        if (curr != null)
        {
          stack.push(curr);
          curr = curr.left;
        }
        else
        {
          curr = stack.pop();
          System.out.print(curr.data + " ");
          curr = curr.right;
        }
      }
    }

    public static void main( String args[] )
    {
    	InorderStack tree = new InorderStack(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8); 
        tree.root.left.left.right = new Node(9); 
        tree.inOrderTraversal(tree.root); 
    }
}
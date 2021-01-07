package LevelOrderBreathFirstTraversalQueue;

import java.util.LinkedList;

  
class Node { 
    int data; 
    Node left; 
    Node right; 
  
    Node(int data) { 
      this.data = data; 
      left = null; 
      right = null; 
    } 
  } 
public class LevelOrderQueue { 

	static Node root; 
 
  static void levelOrder(Node root) { 
    if (root == null) 
      return; 
  
    QueueMethods<Node> q = new QueueMethods<>(); 
  
    // Pushing root node into the queue. 
    q.enque(root); 
  
    // Pushing delimiter into the queue. 
    q.enque(null); 
  
    // Executing loop till queue becomes 
    // empty 
    while (!q.isEmpty()) { 
  
      Node curr = q.deque(); 
  
      // condition to check the 
      // occurence of next level 
      if (curr == null) { 
        if (!q.isEmpty()) { 
          q.enque(null); 
          System.out.println(); 
        } 
      } else { 
        // Pushing left child current node 
        if (curr.left != null) 
          q.enque(curr.left); 
  
        // Pushing right child current node 
        if (curr.right != null) 
          q.enque(curr.right); 
  
        System.out.print(curr.data + " "); 
      } 
    } 
  } 
  
  // Driver function 
  public static void main(String[] args) { 
	     LevelOrderQueue tree = new LevelOrderQueue(); 
	  	 tree.root = new Node(1); 
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	     tree.root.left.left = new Node(4); 
	     tree.root.left.right = new Node(5); 
	     tree.root.right.left = new Node(6);
	     tree.root.right.right = new Node(7);
	     tree.root.left.left.left = new Node(8); 
	     tree.root.left.left.right = new Node(9); 
	     levelOrder(root); 
  } 
} 
  
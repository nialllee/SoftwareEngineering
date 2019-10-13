import static org.junit.Assert.*;

import org.junit.Test;

public class LowestCommonAncestorTest{

  @Test
  public void testEmptyTree(){
  
    LowestCommonAncestor tree = new LowestCommonAncestor();
    assertNull("Finds the Lowest Common Ancestor when the tree is empty ", tree.findLowestCommonAncestor(1, 2));
    assertEquals("Finds the Lowest Common Ancestor when the tree is empty ", null, tree.findLowestCommonAncestor(1, 2) );
  
  }
  
  @Test
  public void testNodeConstructor(){
    
    Node temp = new Node(1);
    assertNotNull("Tests the Node Constructor ", temp);
    
  }  
  
  @Test
  public void test2Nodes(){
    
    LowestCommonAncestor tree = new LowestCommonAncestor();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    assertEquals("Finds the Lowest Common Ancestor of a one root & one child tree ", 1, tree.findLowestCommonAncestor(1, 2).data);
    
  }
  
  @Test
  public void testNodesNotPresent(){
    
    LowestCommonAncestor tree = new LowestCommonAncestor();
    tree.root = new Node (5);
    tree.root.left = new Node(6);
    tree.root.right = new Node(7);
    tree.root.left.left = new Node(8);
    tree.root.left.right = new Node(9);
    tree.root.right.left = new Node(10);
    tree.root.right.right = new Node(11);
  
    assertEquals("Finds ancestors of nodes not present in populated tree: ", null, tree.findLowestCommonAncestor(15, 16));
    assertEquals("Finds ancestors of nodes not present in populated tree: ", null, tree.findLowestCommonAncestor(52, 87));
  }
  
  @Test
  public void testNodesPresent(){
	  
    LowestCommonAncestor tree = new LowestCommonAncestor();
    tree.root = new Node (5);
    tree.root.left = new Node(6);
    tree.root.right = new Node(7);
    tree.root.left.left = new Node(8);
    tree.root.left.right = new Node(9);
    tree.root.right.left = new Node(10);
    tree.root.right.right = new Node(11);
	  
    assertEquals("LCA of 8 and 9: ", 6, tree.findLCA(8, 9).data);
    assertEquals("LCA of 10 and 11: ", 7, tree.findLCA(10, 11).data);
    assertEquals("LCA of 6 and 7: ", 5, tree.findLCA(6, 7).data);	
    assertEquals("LCA of 8 and 11: ", 5, tree.findLCA(8, 11).data);	  
	  
}  
  
  		//		5
		//	6		7
		//    8   9   	     10   11

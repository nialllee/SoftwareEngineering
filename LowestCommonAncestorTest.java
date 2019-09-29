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
  
  
  

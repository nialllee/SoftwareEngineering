		//		1
		//	2		3
		//    4   5   	     6     7

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;



public class LowestCommonAncestorTest {
	
	@Test
	public void testEmptyTree(){
		
		LowestCommonAncestor<Integer> testDAG = new LowestCommonAncestor<>();
		ArrayList<Node_DAG<Integer>> testDAGList = new ArrayList<>();
		
		for(int i=0; i<7; i++){
			
			testDAGList.add(new Node_DAG<Integer>(i));
		}
		
		assertNull("Checks LowestCommonAncestor of empty tree is null:", testDAG.LowestCommonAncestor(testDAGList.get(5), testDAGList.get(6)));
	}	

	@Test
	public void testConstructor(){
		
		LowestCommonAncestor<Integer> testDAG = new LowestCommonAncestor<>();
		ArrayList<Node_DAG<Integer>> testDAGList = new ArrayList<>();
		
		for(int i=0; i<7; i++){
			
			testDAGList.add(new Node_DAG<Integer>(i));
		}
		
		testDAG.root = testDAGList.get(0); //root = 1
		
		assertNotNull("Checks if DAG is null after adding the root:", testDAG);
	}
	
	@Test // index so add 1
	public void testForCommonAncestor(){
		
		LowestCommonAncestor<Integer> testDAG = new LowestCommonAncestor<>();
		ArrayList<Node_DAG<Integer>> testDAGList = new ArrayList<>();
		
		for(int i=0; i<7; i++){
			
			testDAGList.add(new Node_DAG<Integer>(i));
		}
		testDAG.root = testDAGList.get(0); 
		testDAGList.get(0).addEdge(testDAGList.get(1));
		testDAGList.get(0).addEdge(testDAGList.get(2));
		testDAGList.get(1).addEdge(testDAGList.get(3));
		testDAGList.get(1).addEdge(testDAGList.get(4));
		testDAGList.get(2).addEdge(testDAGList.get(5));
		testDAGList.get(2).addEdge(testDAGList.get(6));
		
		assertEquals("LowestCommonAncestor of 4 and 5 is 2:", testDAGList.get(1), testDAG.LowestCommonAncestor(testDAGList.get(3), testDAGList.get(4)));
		assertEquals("LowestCommonAncestor of 6 and 7 is 3:", testDAGList.get(2), testDAG.LowestCommonAncestor(testDAGList.get(5), testDAGList.get(6)));
		assertEquals("LowestCommonAncestor of 2 and 3 is 1:", testDAGList.get(0), testDAG.LowestCommonAncestor(testDAGList.get(1), testDAGList.get(2)));
	}
		

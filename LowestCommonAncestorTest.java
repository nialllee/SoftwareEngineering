		//		1
		//	2		3
		//    4   5   	     6     7

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;



public class LCATest {
	
	@Test
	public void testEmptyTree(){
		
		LowestCommonAncestor<Integer> testDAG = new LowestCommonAncestor<>();
		ArrayList<Node_DAG<Integer>> testDAGList = new ArrayList<>();
		
		for(int i=0; i<7; i++){
			
			testDAGList.add(new Node_DAG<Integer>(i));
		}
		
		assertNull("Checks LCA of empty tree is null:", testDAG.LowestCommonAncestor(testDAGList.get(5), testDAGList.get(6)));
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
		

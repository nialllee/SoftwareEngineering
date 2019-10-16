import static org.junit.Assert.*;
import org.junit.Test;

public class DAGTest {
	
	@Test
	public void testDAG()
	{
		DAG graph = new DAG(10);
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(2, 5);
		graph.addEdge(4, 6);
		graph.addEdge(4, 7);
		
		assertEquals(1, graph.indegree(4));
		assertEquals(2, graph.outdegree(4));
		assertEquals(5, graph.E());
		assertEquals(10, graph.V());
		String adj = "[6, 7]";
		assertEquals(adj, graph.adj(4).toString());
	}
	
	@Test(expected=Exception.class)
	public void exceptionTest(){
		
		//Directed graph needs to have positive number of vertices
		
		DAG graph = new DAG(-5);
	}
	
	@Test
	public void addEdge()
	{
		DAG graph = new DAG(5);
		
		graph.addEdge(1,2);

		//Negative would not addEdge
		graph.addEdge(-1, -6);
		
		//12 is larger than 5 therefore edge won't be added
		graph.addEdge(3, 12);
		
		assertEquals(1, graph.E());
	}
	
	@Test
	public void testOutdegree()
	{
		DAG graph = new DAG(5);
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(3, 3);
		
		assertEquals(1, graph.outdegree(3));
	
		assertEquals(-1, graph.outdegree(5));
	}
	

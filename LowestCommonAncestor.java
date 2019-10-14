import java.util.*;
  
public class LowestCommonAncestor<T> {
	
	  Node_DAG<T> root;
	  List<Node_DAG<T>> DFS(Node_DAG<T> node, Node_DAG<T> searchNode, List<Node_DAG<T>> list, Stack<Node_DAG<T>> stack){
	           
		  stack.push(node);
		   for(Node_DAG<T> n : node.point){
			  
			  if(n.equals(searchNode)){
				  
				  list.addAll(stack);
				  return list;
			  }	  
			  DFS(node, searchNode, list, stack);
		  }	  
		  stack.pop();
		  return list;
	  }

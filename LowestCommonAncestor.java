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
	
	  public Node_DAG<T> LowestCommonAncestor(Node_DAG<T> node1, Node_DAG<T> node2) {

		  return LowestCommonAncestor_DAG(root, node1, node2);
	  }
          public Node_DAG<T> LCA_DAG(Node_DAG<T> root, Node_DAG<T> node1, Node_DAG<T> node2){
		  
		  List<Node_DAG<T>> list1 = DFS(root, node1, new ArrayList<>(), new Stack<>());
		  List<Node_DAG<T>> list2 = DFS(root, node2, new ArrayList<>(), new Stack<>());
		  List<Node_DAG<T>> minimumList;
		  List<Node_DAG<T>> maximumList;
		  
		  if(list1.size() <= list2.size()){
			  minimumList = list1;
			  maximumList = list2;
		  }
		  else{
			  minimumList = list2;
			  maximumList = list1;
		  }
		  
		  if(root == null || node1 == null || node2 == null){
			  
			  return null;
		  }
		  
		  if(list1 == null || list2 == null){
			  
			  return null;
		  }
		  
		  Set<Node_DAG<T>> set = new HashSet<>();
		  
		  for(Node_DAG<T> n : minimumList){
			  set.add(n);
		  }
		  
		  for(int j = maximumList.size(); j >= 0; j--){
			  
			  if(set.contains(maximumList.get(j))){
				  
				  return maximumList.get(j);
			  }
		  }
		  
		  return null;  
	  }
}

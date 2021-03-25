
//basic node class
public class Node {
	private double value;
	private Node linkedNode;
	
	//constructor takes in a value and linked node
	public Node(double value, Node linkedNode) {
		this.value = value;
		this.linkedNode = linkedNode;
	}
	
	//constructor if no linked node then linked node set to null
	public Node(double value) {
		this.value = value;
		this.linkedNode = null;
	}
	
	//get value of node
	public double getValue() {
		return this.value;
	}
	
	//get linked node
	public Node getLinkedNode() {
		return this.linkedNode;
	}
	
	//set linked node with a node parameter
	public void setLinkedNode(Node linkedNode) {
		this.linkedNode = linkedNode;
	}
	
}


//stack class used to represent barbell
public class Stack {
	private Node top_item = null;
	private int limit;
	private int size = 0;
	private double barWeight = 20.0;
	
	//constructor takes in node count limit
	public Stack(int limit) {
		this.limit = limit;
	}
	
	//function to add a plate to top of stack/ bar
	public void addPlate(double plateWeight) {
		if(this.hasSpace()) {
			Node newNode = new Node(plateWeight);
			newNode.setLinkedNode(top_item);
			top_item = newNode;
			size++;
		}
		else {
			System.out.println("The stack is full!!");
		}
	}
	
	//function to remove plate from top of stack/ bar
	public void removePlate() {
		if(!(this.isEmpty())) {
			Node removeThis = top_item;
			top_item = removeThis.getLinkedNode();
			size--;
		}
	}
	
	//function to clear the stack/ bar
	public void clearBar() {
		while(!(this.isEmpty())) {
			Node removeThis = top_item;
			top_item = removeThis.getLinkedNode();
			size--;
		}
	}
	
	//function that prints the weights on the bar
	public void showBarInfo() {
		System.out.println("_______");
		System.out.print("_______|");
		double[] values = new double[size];
		Node pointer = top_item;
		for(int i=size-1;i>=0;i--) {
			values[i] = pointer.getValue();
			pointer = pointer.getLinkedNode();
		}
		for(double weight: values) {
			System.out.print("  " + weight);
		}
		System.out.println("\n\n");
		System.out.println(getKiloWeight() + " kg.     " + kiloToPound(getKiloWeight()) + "lbs.\n\n");
	}
	
	//function that returns the total weight including the bar
	public double getKiloWeight() {
		double sideWeight = 0;
		Node pointer = top_item;
		for(int i=0; i<size; i++) {
			sideWeight += pointer.getValue();
			pointer = pointer.getLinkedNode();
		}
		return (sideWeight*2) + barWeight;
	}

	//convert kilos to pounds and truncate to two decimals
	public double kiloToPound(double kilo) {
		int num = (int)((2.20462 * kilo)*100.0);
		double longerNum = ((double)num)/100;
		return longerNum; 
	}
	
	//change bar weight
	public void changeWeight(double weight) {
		this.barWeight = weight;
	}
	
	//checks for space in stack
	public boolean hasSpace() {
		return size<limit;
	}
	
	//checks if stack is empty
	public boolean isEmpty() {
		return size == 0;
	}

	public static void main(String[] args) {
		double num = 23;
		num = num * 2.5/2.5;
		System.out.print(num);
	}
}


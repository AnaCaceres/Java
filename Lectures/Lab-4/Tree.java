/**
* This class is used to represent objects as binary search trees.
*
* @author: Botond Kreicz (ID 115335711)
*/

public class Tree<T extends Comparable<T>> {
	/**
	* The class creates a binary search tree.
	*
	* Variables:
	* value: a T used to compare
	* leftChild: a Tree used to hold elements smaller than or equal to value
	* rightChild: a Tree used to hold elements larger than value
	*/
	private T value;
	private Tree<T> leftChild;
	private Tree<T> rightChild;
	
	
	public void Tree() {
		// Initialises the class
	}
	
	public void insert(final T object) {
		// Inserts object into the Tree
		if (isEmpty()) {
			// If the Tree's value is null, its value becomes object
			value = object;
		} else if (object.compareTo(value) <= 0) {
			// If object is less than or equal to the Tree's value...
			if (!(leftChild instanceof Tree)) {
				// ...leftChild is initialised as a Tree, if it's not an instance of Tree already...
				leftChild = new Tree<T>();
			}
			leftChild.insert(object);
			// ...the object is inserted into the leftChild
		} else if (object.compareTo(value) > 0){
			// If object is more than to the Tree's value...
			if (!(rightChild instanceof Tree)) {
				// ...rightChild is initialised as a Tree, if it's not an instance of Tree already...
				rightChild = new Tree<T>();
			}
			rightChild.insert(object);
			// ...the object is inserted into the rightChild
		}
	}
	
	public void showInOrder() {
		// Prints out the Tree in-order by calling a helper function and printing out what it returns
		String result = "";
		result += showInOrder("");
		System.out.println(result);
	}
	
	public String showInOrder(final String indentation) {
		// Creates a string containing the Tree in-order with proper indentation and returns it
		String string = indentation;
		if (!isEmpty()) {
			string += value.toString();
			if (leftChild instanceof Tree) {
				string = "\n" + string;
				string = leftChild.showInOrder(indentation + " ") + string;
			}
			if (rightChild instanceof Tree) {
				string += "\n";
				string += rightChild.showInOrder(indentation + " ");
			}
		}
		return string;
	}
	
	public void showPreOrder() {
		// Prints out the Tree pre-order by calling a helper function and printing out what it returns
		String result = "";
		result += showPreOrder("");
		System.out.println(result);
	}
	
	public String showPreOrder(final String indentation) {
		// Creates a string containing the Tree pre-order with proper indentation and returns it
		String string = indentation;
		if (!isEmpty()) {
			string += value.toString();
			if (leftChild instanceof Tree) {
				string += "\n";
				string += leftChild.showPreOrder(indentation + " ");
			}
			if (rightChild instanceof Tree) {
				string += "\n";
				string += rightChild.showPreOrder(indentation + " ");
			}
		}
		return string;
	}
	
	public void showPostOrder() {
		// Prints out the Tree post-order by calling a helper function and printing out what it returns
		String result = "";
		result += showPostOrder("");
		System.out.println(result);
	}
	
	public String showPostOrder(final String indentation) {
		// Creates a string containing the Tree post-order with proper indentation and returns it
		String string = "";
		if (!isEmpty()) {
			if (leftChild instanceof Tree) {
				string += leftChild.showPostOrder(indentation + " ");
				string += "\n";
			}
			if (rightChild instanceof Tree) {
				string += rightChild.showPostOrder(indentation + " ");
				string += "\n";
			}
			string += indentation + value.toString();
		}
		return string;
	}
	
	public boolean isEmpty() {
		// Return true if the Tree's value is set and false otherwise
		return (value == null)? true:false;
	}
}
/**
* This class is used to test the Tree class.
*
* @author: Botond Kreicz (ID 115335711)
*/

public class Main {
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();
		tree.insert(1);
		tree.insert(2);
		tree.insert(0);
		tree.insert(4);
		tree.insert(3);
		tree.insert(5);
		System.out.println("The tree in in-order:");
		tree.showInOrder();
		System.out.println();
		System.out.println("The tree in pre-order:");
		tree.showPreOrder();
		System.out.println();
		System.out.println("The tree in post-order:");
		tree.showPostOrder();
		System.out.println();
	}
}
//U10416023 Forest

public class TestBST {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = {42, 73, 7, 15, 432, 83, 19, 28};
		BST<Integer> intTree = new BST<Integer>(numbers);
		System.out.print("\nInorder sorted: ");
		intTree.inorder();
	}
}

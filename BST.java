// U10416023 Forest

public class BST<E extends Comparable<E>>  {
	protected TreeNode<E> root;
	protected int size = 0;

	/** Create a default binary tree */
	public BST() {
	}

	/** Create a binary tree from an array of objects */
	public BST(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}
	/** add element o into the binary tree
	 * Return true if the element is added successfully */
	public boolean add(E e) {
		if (root == null)
			root = new TreeNode<E>(e); // Create a new root
		else {
			// Locate the parent node
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null){
				if (e.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				}
				else if (e.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				}
				else
					return false; // Duplicate node not added
			}
			// Create the new node and attach it to the parent node
			if (e.compareTo(parent.element) < 0)
				parent.left = new TreeNode<E>(e);
			else
				parent.right = new TreeNode<E>(e);
		}

		size++;
		return true; // Element added
	}


	/** Inorder traversal from the root*/
	public void inorder() {
		inorder(root);
	}

	/** Inorder traversal from a subtree */
	protected void inorder(TreeNode<E> root) {
		if (root == null) return;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}
	public static class TreeNode<E extends Comparable<E>> {
		public E element;
		public TreeNode<E> left;
		public TreeNode<E> right;

		public TreeNode(E e) {
			element = e;
		}
	}
}

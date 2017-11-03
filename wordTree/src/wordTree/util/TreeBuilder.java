package wordTree.util;

import java.util.ArrayList;

public class TreeBuilder {
	private Node root;
	
	public TreeBuilder() {
		root = null;
	}
	
	/**
	 * insert node into BST
	 * @param wordI - word to be stored in node
	 */
	public void insert (String wordI) {
		root = insertVal(root, wordI);
	}
	
	/**
	 * helper function for inserting
	 * @param rootI - root as incoming parameter
	 * @param val - String to be inserted in Node
	 * @return root node
	 */
	private Node insertVal(Node rootI, String val) {
		if(rootI == null) {
			rootI = new Node(val);
		}
		else {
			if (((rootI.getWord()).compareTo(val)) > 0) {
				rootI.setLeft(insertVal(rootI.getLeft(), val));
			}
			else if (((rootI.getWord()).compareTo(val)) < 0) {
				rootI.setRight(insertVal(rootI.getRight(), val));
			}
			else if (((rootI.getWord()).compareTo(val)) == 0) {
				rootI.increaseCount();
			}
		}
		return rootI;
	}

	/**
	 * method to delete course
	 * @param wordI - word to be deleted
	 */
	public void delete(String wordI) {
		deleteVal(root, wordI);
	}
	
	/**
	 * helper method for deletion
	 * @param r - incoming root node
	 * @param w - word to be deleted
	 */
	private void deleteVal(Node r, String w) {
		if (r == null) {
			return;
		}
		if(((r.getWord()).compareTo(val)) == 0) {
			if(r.getCount > 0) {
				r.decreaseCount();
			}
		}
		else if(((r.getWord()).compareTo(val)) < 0) {
			deleteVal(r.getRight(), w);
		}
		else if(((r.getWord()).compareTo(val)) > 0){
			deleteVal(r.getLeft(), w);
		}
	}
	
	/**
	 * @param r - results instance
	 */
	public void printNodes(Results r) {
		inorderVal(r, root);
	}
	
	/**
	 * helper method to print nodes in ascending order
	 * @param rs - results instance
	 * @param r - Node instance
	 */
	private void inorderVal(Results rs, Node r) {
		if (r != null) {
			inorderVal(rs, r.getLeft());
			toString()
			inorderVal(rs, r.getRight());
		}
	}
	
	private static void toString(String msg) {
		System.out.println(msg);
	}
}

/**Binary Search Tree implementation references:
 *http://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 *http://www.sanfoundry.com/java-program-implement-binary-search-tree/
*/
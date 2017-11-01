package wordTree.util;

public class Node implements {
	
	private String word = null;
	private int count = 0;
	private Node left = null;
	private Node right = null;
		
	/**
	 * constructor for node
	 * @param wordI - incoming word
	 */
	public Node(String wordI) {
		word = wordI;
		count = 1;
		left = null;
		right = null;
	}
	
	/**
	 * @return String - word stored in Node
	 */
	public String getWord() {
		return word;
	}
	
	/** 
	 * @return left Node
	 */
	public Node getLeft() {
		return left;
	}
	
	/**
	 * @return right Node
	 */
	public Node getRight() {
		return right;
	}
	
	public void increaseCount() {
		count++;
	}
	
	public void decreaseCount() {
		count--;
	}
	
	/**
	 * @param n - node to set left node
	 */
	public void setLeft(Node n) {
		left = n;
	}
	
	/**
	 * @param n - node to set right node
	 */
	public void setRight(Node n) {
		right = n;
	}
	
	/**
	 * @return int - character count for that word
	 */
	public int charCount() {
		return (word.length() * count);
	}
}

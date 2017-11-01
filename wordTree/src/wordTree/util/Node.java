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
	 * @return int - bnumber of node
	 */
	public int getBnum() {
		return bnumber;
	}
	
	/**
	 * @return arraylist of courses
	 */
	public ArrayList<String> getCourses(){
		return courses;
	}
	
	/**
	 * 
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
	
	/**
	 * @param n - int to set bnumber
	 */
	public void setBnum(int n) {
		bnumber = n;
	}
	
	/**
	 * @param c - arraylist to set courses
	 */
	public void setCourses(ArrayList<String> c) {
		courses = c;
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
	 * @return cloned node
	 */
	public Node clone() {
		Node copy = new Node(bnumber, courses);
		return copy;
	}
	
	/**
	 * @param o - observer to be added
	 */
	public void registerObserver(ObserverI o) {
		observers.add(o);
	}
	
	/**
	 * @param o - observer to be removed
	 */
	public void removeObserver(ObserverI o) {
		observers.remove(o);
	}
	
	/**
	 * @param c - updated courses
	 */
	public void notifyAll(ArrayList<String> c) {
		Node n;
		for (int index = 0; index < observers.size(); index++) {
			n = (Node)observers.get(index);
			n.update(n, c);
		}
	}
	
	/**
	 * @param n - node to be updated
	 * @param c - updated courses
	 */
	public void update(Node n, ArrayList<String> c) {
		n.setCourses(c);
	}
}

package BreadthFirstSearch.bfs;

import java.util.Arrays;

/**
 * This class represents a Node of a BreadthFirstSearch Algorithm. 
 * A node consists of following items:
 * STATE: the state of the 15 puzzle board game at any given point in time.
 * PARENT: the parent of a particular Node.
 * ACTION: the action associated with the Parent Node which resulted in the state of this Node.
 * PATH_COST: the sum of step costs associated while reaching to this Node the graph. 
 * @author Akhauri Prateek Shekhar
 */
public class Node {
	
	private Tile[][] STATE;
	private Node PARENT;
	private Constant.ACTION ACTION;
	private Integer PATH_COST;

	public Node() {
		super();
	}
	
	public Node(Tile[][] sTATE, Node pARENT, Constant.ACTION ACTION, Integer PATH_COST) {
		super();
		this.STATE = sTATE;
		this.PARENT = pARENT;
		this.ACTION = ACTION;
		this.PATH_COST = PATH_COST;
	}

	public Tile[][] getSTATE() {
		return STATE;
	}

	public void setSTATE(Tile[][] sTATE) {
		STATE = sTATE;
	}

	public Node getPARENT() {
		return PARENT;
	}

	public void setPARENT(Node pARENT) {
		PARENT = pARENT;
	}

	public Constant.ACTION getACTION() {
		return ACTION;
	}

	public void setACTION(Constant.ACTION aCTION) {
		ACTION = aCTION;
	}

	public Integer getPATH_COST() {
		return PATH_COST;
	}

	public void setPATH_COST(Integer pATH_COST) {
		PATH_COST = pATH_COST;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(STATE);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (!Arrays.deepEquals(STATE, other.STATE))
			return false;
		return true;
	}
}
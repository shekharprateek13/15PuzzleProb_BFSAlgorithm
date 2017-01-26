package BreadthFirstSearch.bfs;

/**
 * This class represents a Tile in a 15-puzzle problem. 
 * Each Tile has its own label and set of coordinates using 
 * which it's position in the board could be represented.
 * @author Akhauri Prateek Shekhar
 */
public class Tile {
	
	private String label;
	private Coordinates coOrdinates;
	
	public Tile() {
		super();
	}
	
	public Tile(String label, Coordinates coOrdinates) {
		super();
		this.label = label;
		this.coOrdinates = coOrdinates;
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Coordinates getCoOrdinates() {
		return coOrdinates;
	}

	public void setCoOrdinates(Coordinates coOrdinates) {
		this.coOrdinates = coOrdinates;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coOrdinates == null) ? 0 : coOrdinates.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
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
		Tile other = (Tile) obj;
		if (coOrdinates == null) {
			if (other.coOrdinates != null)
				return false;
		} else if (!coOrdinates.equals(other.coOrdinates))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return label;
	}
}

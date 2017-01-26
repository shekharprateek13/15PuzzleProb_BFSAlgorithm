package BreadthFirstSearch.bfs;

/**
 * Co-ordinates are with respect to a 2-D array. So x co-ordinate means the row and y co-ordinate means the column in a 2-D array
 * @author Akhauri Prateek Shekhar
 */
public class Coordinates {

	private Integer x_coordinate;
	private Integer y_coordinate;
	
	public Coordinates() {
		super();
	}
	
	public Coordinates(Integer x_coordinate, Integer y_coordinate) {
		super();
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
	}

	public Integer getX_coordinate() {
		return x_coordinate;
	}

	public void setX_coordinate(Integer x_coordinate) {
		this.x_coordinate = x_coordinate;
	}

	public Integer getY_coordinate() {
		return y_coordinate;
	}

	public void setY_coordinate(Integer y_coordinate) {
		this.y_coordinate = y_coordinate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x_coordinate == null) ? 0 : x_coordinate.hashCode());
		result = prime * result + ((y_coordinate == null) ? 0 : y_coordinate.hashCode());
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
		Coordinates other = (Coordinates) obj;
		if (x_coordinate == null) {
			if (other.x_coordinate != null)
				return false;
		} else if (!x_coordinate.equals(other.x_coordinate))
			return false;
		if (y_coordinate == null) {
			if (other.y_coordinate != null)
				return false;
		} else if (!y_coordinate.equals(other.y_coordinate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coordinates [x_coordinate=" + x_coordinate + ", y_coordinate=" + y_coordinate + "]";
	}
}

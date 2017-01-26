package BreadthFirstSearch.bfs;

import java.util.ArrayList;
import java.util.List;

/**
 * This class defines the Constants which are to be used in Breadth First Search Algorithm Implementation
 * @author Akhauri Prateek Shekhar
 */
public class Constant {

	/**
	 * The possible set of actions which could be applied to a Tile in 15 puzzle problem.
	 */
	public static enum ACTION  {
		MOVE_LEFT,
		MOVE_RIGHT,
		MOVE_UP,
		MOVE_DOWN;
	};

	
	/**
	 * The possible set of coordinates which could be assumed by a Tile in 15 puzzle problem. 
	 * The possible set of coordinates are: {0,0},{0,1},{0,2},{0,3},{1,0},{1,1},{1,2},{1,3},{2,0},{2,1},{2,2},{2,3},{3,0},{3,1},{3,2},{3,3}
	 */
	public static List<Coordinates> POSSIBLE_COORDINATES;

	static{
		Constant.POSSIBLE_COORDINATES = new ArrayList<Coordinates>();
		for(int x = 0;x < 4;x++){
			for(int y = 0;y < 4;y++){
				Coordinates coOrdinates = new Coordinates(x, y);
				POSSIBLE_COORDINATES.add(coOrdinates);
			}
		}
	}
}
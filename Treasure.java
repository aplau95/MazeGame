/**
 * Class that is used to help construct Treasures.
 * 
 * @author Andrew Lau
 * @version Project 03
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */
public class Treasure extends RandomOccupant{

	//instance variable
	private boolean found = false;
	
	/**constructor passes Maze argument to superclass to create Treasure Object.
	 * @param maze Maze object passed to superclass's constructor.
	 */
	public Treasure(Maze maze) {
		super(maze);
	}
	
	/**constructor passes Maze and long argument to superclass to create Treasure Object.
	 * @param maze Maze object passed to superclass's constructor.
	 * @param seed Long value passed into superclass's constructor.
	 */
	public Treasure(Maze maze, long seed){	
		super(maze, seed);
	}
	
	/**constructor passes Maze and Square argument to superclass to create Treasure Object.
	 * @param maze Maze object passed to superclass's constructor.
	 * @param location Square passed into superclass's constructor.
	 */
	public Treasure(Maze maze, Square location){
		super(maze, location);
	}
	
	/**
	 * method that returns if the Treasure has been found or not (true/false).
	 * @return Boolean value of found.
	 */
	public boolean found(){
		return found;
	}
	
	/**
	 * method that sets the Boolean value of the found instance variable to true.
	 */
	public void setFound(){
		this.found = true;
	}
	
	/**
	 * move method that does nothing when called. The Treasure object should not move.
	 */
	@Override
	public void move(){
		
	}
	
}
/**
 * Class that is used to help construct Monsters.
 * 
 * @author Andrew Lau
 * @version Project 03
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */
public class Monster extends RandomOccupant{

	/**constructor passes Maze argument to superclass to create Monster.
	 * @param maze Maze object passed to superclass's constructor.
	 */
	public Monster(Maze maze) {
		super(maze);
	}
	
	/**constructor passes Maze and long argument to superclass to create Monster.
	 * @param maze Maze object passed to superclass's constructor.
	 * @param seed Long value passed into superclass's constructor.
	 */
	public Monster(Maze maze, long seed){
		super(maze, seed);
	}
	
	/**constructor passes Maze and Square argument to superclass to create Monster.
	 * @param maze Maze object passed to superclass's constructor.
	 * @param location Square passed into superclass's constructor.
	 */
	public Monster(Maze maze, Square location){
		super(maze, location);
	}
	
}
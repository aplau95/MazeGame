/**Square.java
* Square class contains the constructors and methods to create and modify Squares and their properties
* 
* @author Andrew Lau
* @version Project 03
* @version 02-21-17
* @version CPE102-07
* @version Spring 2016
*/

public class Square{

	//Named constants
	
	public static final int SQUARE_SIZE = 50;
	public static final int UP = 0;
	public static final int RIGHT = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	
	//Instance Variables
	
	private boolean[] walls = new boolean[4];
	private boolean seen;
	private boolean inView;
	private int row;
	private int col;
	private Treasure treasure;
	
	/**
	 * constructor that creates the square and its attributes based on the values passed in from the parameters.
	 * @param up Boolean value for whether or not there is a wall in that direction 
	 * @param right Boolean value for whether or not there is a wall in that direction 
	 * @param down Boolean value for whether or not there is a wall in that direction 
	 * @param left Boolean value for whether or not there is a wall in that direction 
	 * @param row Integer value for the row of the square in relation to the maze
	 * @param col Integer value for the column of the square in relation to the maze
	 */
	
	public Square(boolean up, boolean right, boolean down, 
			boolean left, int row, int col){
		this.walls[UP] = up;
		this.walls[RIGHT] = right;
		this.walls[DOWN] = down;
		this.walls[LEFT] = left;
		this.row = row;
		this.col = col;
		this.treasure = null;
		this.seen = false;
		this.inView = false;
	}
	
	/**method used to determine if there is a wall in a given direction based on the parameter value 'direction' passed in.
	 * @param direction Integer parameter (Named Constants) used to determine the direction to check if there is a wall in the way.
	 * @return Returns a boolean value for whether or not there is a wall in the direction the 'direction' parameter asks for.
	 */
	public boolean wall(int direction){
		boolean a;
			if(direction == UP){
				a = walls[UP];
				return a;
			}
			else if(direction == RIGHT){
				a = walls[RIGHT];
				return a;
			}
			else if(direction == DOWN){
				a = walls[DOWN];
				return a;
			}
			else if(direction == LEFT){
				a = walls[LEFT];
				return a;
			}
			else{
				return true;
			}
		}
		
	/** method to determine if the square has been seen or not by the Explorer.
	 * @return Boolean value for the seen instance variable.
	 */
	public boolean seen(){
		return seen;
	}
	
	/** method to determine if the square is in view by the Explorer.
	 * @return Boolean value for the inView instance variable.
	 */
	public boolean inView(){
		return this.inView;
	}
	
	/** method to find the row number of the square.
	 * @return Int value of the row number of the square.
	 */
	public int row(){
		return row;
	}
	
	/** method to find the column number of the square.
	 * @return Int value of the column number of the square.
	 */
	public int col(){
		return col;
	}
	
	/** method to check if there is a treasure in the square (Treasure/null).
	 * @return Whether there is a treasure object in the Square.
	 */
	public Treasure treasure(){
		return treasure;
	}
	
	/**method to calculate the number of pixels that occupy the x direction of a Square.
	 * @return Int value of number of pixels that occupy the x direction of a Square.
	 */
	public int x(){
		return col * SQUARE_SIZE;
	}
	
	/**method to calculate the number of pixels that occupy the y direction of a Square.
	 * @return Int value of number of pixels that occupy the y direction of a Square.
	 */
	public int y(){
		return row * SQUARE_SIZE;
	}
	
	/** method to set a square in view. Also sets the Boolean 'seen' instance variable to true if inView is true.
	 * @param inView Boolean value that sets the Square's Boolean inView instance variable to true.
	 */
	public void setInView(boolean inView){
		this.inView = inView;
		if(inView == true){
			this.seen = true;
		}
	}
	
	/** method to assign a Treasure to the Square.
	 * @param t Treasure object passed in and assigned to the Square.
	 */
	public void setTreasure(Treasure t){
		this.treasure = t;
	}
	
	/**method used to tell the Square that the Explorer has entered it. If the Explorer has entered it and the
	 * Square also contains a Treasure, the setFound() method from the Treasure class is called.
	 */
	public void enter(){
		if (treasure != null){
        treasure.setFound();
		}
		
	
	}
	
	
}
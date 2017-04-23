import java.awt.event.*;

/**Explorer.java
 * Class that contains all the logic to construct an Explorer and move it around.
 * 
 * @author Andrew Lau
 * @version Project 03
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */

public class Explorer extends Occupant{
	
	//instance variables
	private String name;
	private Maze maze;
	
	/**Constructor takes in three Square, Maze and String argument to create the Explorer.
	 * @param location Square argument is passed into the Explorer's moveTo method to set the initial location of the Explorer.
	 * @param maze Maze argument is assigned to the instance variable 'maze'.
	 * @param name String argument is assigned to the instance variable 'name'.
	 */
	public Explorer(Square location, Maze maze, String name){
		this.name = name;
		this.maze = maze;
		moveTo(location);
	}
	
	/**method returns name of Explorer.
	 * @return name - String instance variable that was assigned in the constructor.
	 */
	public String name(){
		return name;
	}
	
	/** move method uses two int variables (col and row) to help determine the current location of the Explorer.
	 * If statements are used to determine the direction in which key is pressed from the KeyEvent and KeyListener. If key corresponding to the direction 
	 * is a valid move (no wall in the way or not out of bounds), the Explorer is moved to a new Square.
	 * @param key int argument corresponding to a KeyEvent from the user keyboard used to determine the direction of the Explorer's move.
	 */
	public void move(int key){
		int col = this.location().col();
		int row = this.location().row();
		Square newSquare;
			if(key == KeyEvent.VK_UP || key == KeyEvent.VK_KP_UP){ 
				if (location().wall(Square.UP) == false && row - 1 >= 0 && maze.getSquare(row - 1, col).wall(Square.DOWN) == false){
						newSquare = maze.getSquare(row - 1, col);
						moveTo(newSquare);
				}		
			}
			else if(key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_KP_RIGHT){ 
				if (location().wall(Square.RIGHT) == false && col + 1 < maze.cols() && maze.getSquare(row, col + 1).wall(Square.LEFT) == false){
						newSquare = maze.getSquare(row, col + 1);
						moveTo(newSquare);
				}					
			}
			else if(key == KeyEvent.VK_DOWN || key == KeyEvent.VK_KP_DOWN){ 
				if (location().wall(Square.DOWN) == false && row + 1 < maze.rows() && maze.getSquare(row + 1, col).wall(Square.UP) == false){
						newSquare = maze.getSquare(row + 1, col);
						moveTo(newSquare);

				}
			}
			else if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_KP_LEFT){ 
				if (location().wall(Square.LEFT) == false && col - 1 >= 0 && maze.getSquare(row, col - 1).wall(Square.RIGHT) == false){
						newSquare = maze.getSquare(row, col - 1);
						moveTo(newSquare);
				}
			}
		}
	
	/** void method that passes Square argument into the moveTo method of the superclass and the Maze class lookAround() method. 
	 * It also calls the Square class enter() method to tell the square that the explorer has entered.
	 * @param s Square argument that is passed into the moveTo method of the superclass and the Maze class lookAround() method.
	 */
    public void moveTo(Square s){
      super.moveTo(s);
      s.enter();
      maze.lookAround(s);
  }
				
		
	}
	
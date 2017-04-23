/**Mave.java
 * Class that contains all the logic to model a Maze with Treasures, Monsters, and an Explorer.
 * 
 * @author Andrew Lau
 * @version Project 03
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */
import java.util.*;
public class Maze
{
   // named constants
   public static final int ACTIVE = 0;
   public static final int EXPLORER_WIN = 1;
   public static final int MONSTER_WIN = 2;
    
    // instance variables
   private Square[][] squares;
   private ArrayList<RandomOccupant> randOccupants;
   private Explorer explorer;
   private int rows;
   private int cols;

   /** Constructor for the Maze. Passes parameters to instance variables and creates an empty ArrayList of RandomOccupants.
    * @param squares Square 2D arrayList of the squares in the maze which is assigned to the 'squares' instance variable.
    * @param rows Int value for the number of rows in the maze, which is assigned to the 'rows' instance variable.
    * @param cols Int value for the number of columns in the maze, which is assigned to the 'cols' instance variable.
    */
   public Maze(Square[][] squares, int rows, int cols)
   {
      // initialize the squares, rows, and cols instance variables to
      //          what is passed in to the constructor
		this.squares = squares;
		this.rows = rows;
		this.cols = cols;
		
      // create the empty ArrayList of RandomOccupants
	   randOccupants = new ArrayList<RandomOccupant>(); 
   }
	
   // QUERIES
   /**
    * method obtains the a specific Square object.
    * @param row Int value used to determine the row of the square.
    * @param col Int value used to determine the column of the square.
    * @return the Square based on row and col
    */
   public Square getSquare(int row, int col) { return squares[row][col]; }
   
   /**method obtains the number of rows in the maze.
    * @return Int value for the number of rows in the maze.
    */
   public int rows() {return rows;}
   
   /**method obtains the number of columns in the maze.
    * @return int value for the number of columns in the maze.
    */
   public int cols() {return cols;}
   
   /**method obtains the explorer's name.
    * @return String for the explorer's name.
    */
   public String explorerName() {return explorer.name();}
   
   /**method to obtain the explorer.
    * @return Explorer object.
    */
   public Explorer getExplorer() {return explorer;}
    
   /**method to obtain the RandomOccupant at a given index.
    * @param index int value used to find the RandomOccupant at the given value index.
    * @return RandomOccupant at a given index.
    */
   public RandomOccupant getRandomOccupant(int index) {
	   return randOccupants.get(index);
   }
   
   /**method to obtain the number of RandomOccupants.
    * @return Int value for the number of RandomOccupants.
    */
   public int getNumRandOccupants() {
	   return randOccupants.size();
   }

   /**method to add a new RandomOccupant to the randOccupants ArrayList.
    * @param ro RandomOccupant Object is added to the randOccupants ArrayList.
    */
   public void addRandomOccupant(RandomOccupant ro) {
	   randOccupants.add(ro);
   }
	
   /**method to assign an Explorer to the Maze.
    * @param e Explorer Object is set in the Maze.
    */
   public void setExplorer(Explorer e) {
	   explorer = e;
   }
	
   /**method to takes in the direction to move the Explorer from the parameter.
    * @param key Int value from parameter passed in to the move() method of the Explorer class.
    */
   public void explorerMove(int key){
      explorer.move(key);
   }
	
   /**method that iterates through the randOccupants ArrayList and calls the move() method for all the occupants.
    */
   public void randMove(){
	   for(int x = 0; x < randOccupants.size(); x++) {
	       randOccupants.get(x).move();
	     }
   }
	
   /**
    * Returns the status of the game.
    *
    * If all treasures have been found, return EXPLORER_WIN.
    * If not, check each maze occupant, if it is a Monster and
    *    it is in the same location as the Explorer, return
    *    MONSTER_WIN.  Note that you can use == to check locations, do you know why?
    * Otherwise, return ACTIVE.
    */
   public int gameStatus()
   {
      int status = ACTIVE;
      if(foundAllTreasures()){
    	  status = EXPLORER_WIN;
      }
      for(int x = 0; x < randOccupants.size(); x++){
    	  if(randOccupants.get(x) instanceof Monster && randOccupants.get(x).location() == explorer.location()){
    		  status = MONSTER_WIN;
    	  }
      }   
      return status;
   }
	
   /**method that returns the Boolean value on whether or not all the Treasures have been found. Iterates through the 
    * randOccupants ArrayList and checks if RandomOccupant is instanceof Treasure and if it has been found.
    * @return the Boolean value on whether or not all the Treasures have been found.
    */
   private boolean foundAllTreasures(){
      boolean foundAll = true;
        
      // CHANGE - search through all the RandomOccupants to see if the Treasures have been found.  Return false if
      //        - there is a Treasure that hasn't been found.  Note:  This should work for subclasses of Treasure, as well.
      for(int x = 0; x < randOccupants.size(); x++){
    	  if(randOccupants.get(x) instanceof Treasure){
    		  if(((Treasure) randOccupants.get(x)).found() == false){
    			  foundAll = false;
    		  }
    	  }
      }
      return foundAll;
   }
   
   /**method used to illuminate Squares around the Explorer location that do not have walls in the way. If no wall
    * is obstructing, the setInView function from the Squares class is classed and set to true.
    * @param s Square in which the Explorer occupies.
    */
   public void lookAround(Square s){
	      int squareRow = s.row();
	      int squareCol = s.col();
	        
	      // Clear what was previously in view
	      resetInView();
	        
	      // Set the current square so that we are viewing it (obviously)
	      
	      squares[squareRow][squareCol].setInView(true);
	       
	      // Check the adjacent squares.  If there isn't a wall in the way, set their inview to true.
	      // Check the diagonal squares.  If there isn't a wall in the way, set their inview to true.
	           
	      for(int i = 0; i <= 4; i++){               
	          if(i == Square.UP){
	            if(squareRow != 0){
	              if(squares[squareRow][squareCol].wall(Square.UP) == false){ 
	                if(squares[squareRow - 1][squareCol].wall(Square.DOWN) == false){
	                  squares[squareRow - 1][squareCol].setInView(true);
	                  //UP left
	                  if(squareCol != 0){
	                    if(squares[squareRow - 1][squareCol -1].wall(Square.RIGHT) == false && squares[squareRow - 1][squareCol].wall(Square.LEFT) == false){
	                      squares[squareRow - 1][squareCol - 1].setInView(true);
	                    }
	                  }
	                  //UP right
	                  if(squareCol !=  cols - 1){
	                    if(squares[squareRow - 1][squareCol + 1].wall(Square.LEFT) == false && squares[squareRow - 1][squareCol].wall(Square.RIGHT) == false){
	                      squares[squareRow - 1][squareCol + 1].setInView(true);
	                    }
	                  }
	                  }
	              }
	            }
	          }//Square UP
	        
	          if(i == Square.RIGHT){
	            if(squareCol != cols - 1){
	              if(squares[squareRow][squareCol].wall(Square.RIGHT) == false){ 
	                if(squares[squareRow][squareCol + 1].wall(Square.LEFT) == false){
	                  squares[squareRow][squareCol + 1].setInView(true);
	                  //RIGHT up
	                  if(squareRow != 0){
	                    if(squares[squareRow - 1][squareCol + 1].wall(Square.DOWN) == false && squares[squareRow][squareCol + 1].wall(Square.UP) == false){
	                      squares[squareRow - 1][squareCol + 1].setInView(true);
	                    }
	                  }
	                  //RIGHT down
	                  if(squareRow !=  rows - 1){
	                    if(squares[squareRow + 1][squareCol + 1].wall(Square.UP) == false && squares[squareRow][squareCol + 1].wall(Square.DOWN) == false){
	                      squares[squareRow + 1][squareCol + 1].setInView(true);
	                    }
	                  }
	                } 
	              }
	            }
	          }//Square RIGHT
	          
	          if(i == Square.DOWN){
	            if(squareRow != rows - 1){
	              if(squares[squareRow][squareCol].wall(Square.DOWN) == false){ 
	                if(squares[squareRow + 1][squareCol].wall(Square.UP) == false){
	                  squares[squareRow + 1][squareCol].setInView(true);
	                  //DOWN right
	                  if(squareCol != cols - 1){
	                    if(squares[squareRow + 1][squareCol + 1].wall(Square.LEFT) == false && squares[squareRow + 1][squareCol].wall(Square.RIGHT) == false){
	                      squares[squareRow + 1][squareCol + 1].setInView(true);
	                    }
	                  }
	                  //DOWN left
	                  if(squareCol !=  0){
	                    if(squares[squareRow + 1][squareCol - 1].wall(Square.RIGHT) == false && squares[squareRow + 1][squareCol].wall(Square.LEFT) == false){
	                      squares[squareRow + 1][squareCol - 1].setInView(true);
	                    }
	                  }
	                  } 
	              }
	            }
	          }//Square DOWN

	          if(i == Square.LEFT){
	            if(squareCol != 0){
	              if(squares[squareRow][squareCol].wall(Square.LEFT) == false){ 
	                if(squares[squareRow][squareCol - 1].wall(Square.RIGHT) == false){
	                  squares[squareRow][squareCol - 1].setInView(true);
	                  //LEFT up
	                  if(squareRow != 0){
	                    if(squares[squareRow - 1][squareCol - 1].wall(Square.DOWN) == false && squares[squareRow][squareCol - 1].wall(Square.UP) == false){
	                      squares[squareRow - 1][squareCol - 1].setInView(true);
	                    }
	                  }
	                  //LEFT down
	                  if(squareRow !=  rows - 1){
	                    if(squares[squareRow + 1][squareCol - 1].wall(Square.UP) == false && squares[squareRow][squareCol - 1].wall(Square.DOWN) == false){
	                      squares[squareRow + 1][squareCol - 1].setInView(true);
	                    }
	                  }
	                } 
	              }
	            }
	          }//Square LEFT
	          
	 
	        }//for loop
	      }//lookAround
      
  
   /**method used to reset inView(") for squares that are no longer in the vicinity of the Explorer. 
    */
   private void resetInView()
   {
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            squares[i][j].setInView(false);
         }
      }
   }
}

import java.util.Random;

/**
 * Class that contains all the logic to initialize a RandomOccupant (Monster or Treasure), assigns its location and move it
 * through superclass's methods' parameters.
 * 
 * @author Andrew Lau
 * @version Project 02
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */

public class RandomOccupant extends Occupant{
  
  //instance variables
  private Random randGen = new Random();
  private Maze maze;
  
  /** initializes a random occupant (Monster or Treasure) and sets a randomly generated location in the maze. If the randomOccupant 
   * is a treasure, it calls the setTreasure method from the Square class to assign the treasure to that location
   * @param maze - takes in maze argument assigns its values to the maze instance variable
   */
  
  public RandomOccupant(Maze maze){
    this.maze = maze;
    int row = maze.rows();
    int col = maze.cols();
    randGen = new Random();
    Square randSquare = maze.getSquare(randGen.nextInt(row), randGen.nextInt(col));
    super.moveTo(randSquare);
    if(this instanceof Treasure){
      randSquare.setTreasure((Treasure)this);
    }
  }
  
  /** initializes a random occupant (Monster or Treasure) and sets a randomly generated location in the maze. If the randomOccupant 
   * is a treasure, it calls the setTreasure method from the Square class to assign the treasure to that location
   * @param maze - takes in maze argument assigns its values to the maze instance variable
   * @param seed - takes in a seed argument to pass into the randGen Random instance variable
   */
  public RandomOccupant(Maze maze, long seed){
     this.maze = maze;
     randGen = new Random(seed);
     int row = maze.rows();
     int col = maze.cols();
     Square randSquare = maze.getSquare(randGen.nextInt(row), randGen.nextInt(col));
     super.moveTo(randSquare);
     if(this instanceof Treasure){
      randSquare.setTreasure((Treasure)this);
     }
  }
  
  /** initializes a random occupant (Monster or Treasure) and sets a location in the maze based on the Square argument passed in. If the randomOccupant 
   * is a treasure, it calls the setTreasure method from the Square class to assign the treasure to that location
   * @param maze - takes in maze argument assigns its values to the maze instance variable
   * @param location - takes in Square argument and passes it the super class constructor where it assigns its start point/square
   */
  public RandomOccupant(Maze maze, Square location){
    super(location); 
    this.maze = maze;
    if(this instanceof Treasure){
      location.setTreasure((Treasure)this);
    }
  }
  
  /** move method that moves the RandomOccupant in a valid random direction (where there is no wall in the way). Method 
   * loops through a do while loop until a valid direction is generated and checks through if statements to determine direction to retrieve the 
   * appropriate square and then calls the moveTo method of the superclass Occupant to assign a new square location for the RandomOccupant
   */
  public void move(){
    int row = location().row();
    int col = location().col();
    Square newSquare;
    int x;
    boolean moved = false;
    
    do{
      x = randGen.nextInt(4);
        if (x == Square.UP && row - 1 >= 0){
          if(maze.getSquare(row - 1, col).wall(Square.DOWN) == false){
          row -= 1;
          newSquare = maze.getSquare(row, col);
          moveTo(newSquare);
          moved = true;
          }
        }//if statement for move UP
    
        if (x == Square.RIGHT && col + 1 < maze.cols()){
          if(maze.getSquare(row, col + 1).wall(Square.LEFT) == false){
          col += 1;  
          newSquare = maze.getSquare(row, col);
          moveTo(newSquare);
          moved = true;
          }
        }//if statement for move RIGHT
            
        if (x == Square.DOWN && row + 1 < maze.rows()){
          if(maze.getSquare(row + 1, col).wall(Square.UP) == false){
          row += 1;
          newSquare = maze.getSquare(row, col);
          moveTo(newSquare);
          moved = true;
          }
        }//if statement for move DOWN
            
        if (x == Square.LEFT && col - 1 >= 0){
          if(maze.getSquare(row, col - 1).wall(Square.RIGHT) == false){
          col -= 1;
          newSquare = maze.getSquare(row, col);
          moveTo(newSquare);
          moved = true;
          }
        }//if statement for move LEFT  
    }while(moved == false);
        
        
      
  }//move method
}//randomOccupant Class
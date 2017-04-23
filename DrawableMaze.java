/**DrawableMaze.java
 * Class that contains all the logic to draw a Maze and all the objects contained in it.
 * 
 * @author Andrew Lau
 * @version Project 03
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */
import java.util.Arrays;

public class DrawableMaze extends Maze implements Drawable{
  
  /**
   * Constructor that takes a 2D DrawableSquare Array, and two integer arguements for row and column
   * and passes them to the superclass(Maze) to construct them.
   * @param maze Maze argument casted as a Square 2D array class then passed to the superclass(Maze) constructor. 
   * @param rows Int value passed to the superclass(Maze) constructor. 
   * @param cols Int value passed to the superclass(Maze) constructor. 
   */
  public DrawableMaze (DrawableSquare[][] maze, int rows, int cols){
    super(Arrays.copyOf(maze, maze.length, Square[][].class), rows, cols);
  }
  
  /**
   * method used to draw the Maze and the objects it contains in the Processing program.
   */
  public void draw() {
    
//    for(int x = 0; x < super.rows(); x++){
//          for(int y = 0; y < super.cols(); y++){
//            ((DrawableSquare) getSquare(x, y)).draw();
//            //opted for a different way than what is suggested in prompt. You can cast (Drawable) to random occupant and move 
//            //if seen statements to inside the DrawableTreasure draw method.
//            if(getSquare(x, y).treasure() != null){
//              if(getSquare(x, y).seen()){ 
//                for(int z = 0; z < super.getNumRandOccupants(); z++){
//                    if(getRandomOccupant(z) instanceof Treasure && getRandomOccupant(z).location().equals(getSquare(x, y))){
//                       if(((DrawableTreasure) getRandomOccupant(z)).found() == false){
//                        ((DrawableTreasure) getRandomOccupant(z)).draw();
//                       }
//                    }
//                  }
//              } 
//            }
//            //opted for a different way than what is suggested in prompt. You can cast (Drawable) to random occupant and move 
//            //if inView statements to inside the DrawableMonster draw method.
//            for(int i = 0; i < super.getNumRandOccupants(); i++){
//                if(getRandomOccupant(i) instanceof Monster && getSquare(x, y).inView() == true && getRandomOccupant(i).location().equals(getSquare(x,y))){
//                ((DrawableMonster) getRandomOccupant(i)).draw();
//                }
//            }   
//          }
//        }  
//        ((DrawableExplorer) getExplorer()).draw();    
  }
}
/**DrawableSquare.java
 * Class that is used to help construct Squares and illustrate them in the Processing program.
 * 
 * @author Andrew Lau
 * @version Project 03
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */
import java.awt.*;
import javax.swing.*;
public class DrawableSquare extends Square implements Drawable{
	

	/**
	 * constructor that passes arguments to superclass (Square) to create the square and its attributes 
	 * based on the values passed in from the parameters.
	 * @param up Boolean value for whether or not there is a wall in that direction passed to superclass (Square).
	 * @param right Boolean value for whether or not there is a wall in that direction passed to superclass (Square). 
	 * @param down Boolean value for whether or not there is a wall in that direction passed to superclass (Square). 
	 * @param left Boolean value for whether or not there is a wall in that direction passed to superclass (Square). 
	 * @param row Integer value for the row of the square in relation to the maze passed to superclass (Square).
	 * @param col Integer value for the column of the square in relation to the maze passed to superclass (Square).
	 */
	public DrawableSquare(boolean up, boolean right, boolean down, boolean left, int row, int col){
		super(up, right, down, left, row, col);
	}
	
	/**
	 * method used to draw the Square in the Processing program.
	 */
	public void draw(){
//		if(inView()){
//			stroke(160, 160, 160);
//			strokeWeight(1);
//			fill(186, 186, 186);
//			Random rand = new Random();
//			rect(x(),y(),50,50);
//			noStroke();
//			fill(220, 220, 220);
//			ellipse(x() + 5 + rand.nextInt(40), y() + 5 + rand.nextInt(40), 3, 3);
//			ellipse(x() + 5 + rand.nextInt(40), y() + 5 + rand.nextInt(40), 3, 3);
//			ellipse(x() + 5 + rand.nextInt(40), y() + 5 + rand.nextInt(40), 3, 3);
//			ellipse(x() + 5 + rand.nextInt(40), y() + 5 + rand.nextInt(40), 3, 3);
//			fill(255, 160, 160);
//			ellipse(x() + 15 , y() + 15, 5, 5);
//			ellipse(x() + 15 , y() + 12, 5, 7);
//			ellipse(x() + 13 , y() + 12, 3, 3);
//			fill(71, 57, 55);
//			ellipse(x() + 35 , y() + 35, 5, 5);
//			ellipse(x() + 35 , y() + 33, 5, 7);
//			ellipse(x() + 33 , y() + 33, 3, 3);
//
//			if(wall(Square.UP) == true){
//				stroke(170, 85, 83);
//				strokeWeight(3);
//				line(x(), y(), x() + 50, y());
//			}
//			if(wall(Square.RIGHT) == true){
//				stroke(170, 85, 83);
//				strokeWeight(3);
//				line(x()+50, y(), x()+50, y()+50);
//			}
//			if(wall(Square.DOWN) == true){
//				stroke(170, 85, 83);
//				strokeWeight(3);
//				line(x(), y()+50, x()+50, y()+50);
//			}
//			if(wall(Square.LEFT) == true){
//				stroke(170, 85, 83);
//				strokeWeight(3);
//				line(x(), y(), x(), y()+50);
//			}
//		} 
//		else if(seen()){
//			stroke(90, 90, 90);
//			strokeWeight(1);
//			fill(70, 70, 70);
//			rect(x(),y(),50,50);
//			noStroke();
//			if(wall(Square.UP) == true){
//				stroke(0);
//				strokeWeight(3);
//				line(x(), y(), x() + 50, y());
//			}
//			if(wall(Square.RIGHT) == true){
//				stroke(0);
//				strokeWeight(3);
//				line(x()+50, y(), x()+50, y()+50);
//			}
//			if(wall(Square.DOWN) == true){
//				stroke(0);
//				strokeWeight(3);
//				line(x(), y()+50, x()+50, y()+50);
//			}
//			if(wall(Square.LEFT) == true){
//				stroke(0);
//				strokeWeight(3);
//				line(x(), y(), x(), y()+50);
//			}
//		}else{
//			noStroke();
//			fill(0, 0, 0);
//			rect(x(), y(), 50, 50);
//		}
	}
}



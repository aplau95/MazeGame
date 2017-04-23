/**DrawableMonster.java
 * Class that is used to help construct DrawableMonsters and illustrate them in the Processing program.
 * 
 * @author Andrew Lau
 * @version Project 03
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */

public class DrawableMonster extends Monster implements Drawable{

	/**constructor takes in a Maze argument and passes it to the superclass (Monster) constructor.
	 * @param maze Maze argument passed to the superclass (Monster) constructor.
	 */
	public DrawableMonster(Maze maze) {
		super(maze);
	}

	/**constructor takes in a Maze argument and passes it to the superclass (Monster) constructor.
	 * @param maze Maze argument passed to the superclass (Monster) constructor.
	 * @param seed Long value argument passed to the superclass (Monster) constructor.
	 */
	public DrawableMonster(Maze maze, long seed){
		super(maze, seed);
	}
	
	/**constructor takes in a Maze argument and passes it to the superclass (Monster) constructor.
	 * @param maze Maze argument passed to the superclass (Monster) constructor.
	 * @param location Square argument passed to the superclass (Monster) constructor.
	 */
	public DrawableMonster(Maze maze, Square location){
		super(maze, location);
	}
	
	/**
	 * method used to draw the Monster in the Processing program.
	 */
	public void draw() {
//		pushMatrix();
//		translate((int)this.location().x(), (int)this.location().y());
//
//		// body
//		noStroke();
//		fill(140, 140, 140);
//		rect(10, 6, 30, 38);
//		ellipse(25, 44, 30, 8);
//		stroke(120, 120, 120);
//		strokeWeight(1);
//		line(15, 6, 15, 46);
//		line(20.5, 6, 20.5, 47);
//		line(25, 6, 25, 47);
//		line(29.5, 6, 29.5, 47);
//		line(35, 6, 35, 46);
//		fill(120, 120, 120);
//		ellipse(25, 6, 31, 8);
//		fill(35, 35, 35);
//		ellipse(25, 6, 29, 7);
//
//		//eyes and mouth
//		fill(0);
//		strokeWeight(2);
//		stroke(0);
//		line(17, 13, 23, 16);
//		line(33, 13, 27, 16);
//		noStroke();
//		ellipse(20, 18, 3, 3);
//		ellipse(30, 18, 3, 3);
//		noStroke();
//		rect(16, 25, 18, 10);
//		fill(200, 200, 200);
//		triangle(16, 25, 19, 29, 22, 25);
//		triangle(22, 25, 25, 29, 28, 25);
//		triangle(28, 25, 31, 29, 34, 25);
//		triangle(16, 35, 19, 31, 22, 35);
//		triangle(22, 35, 25, 31, 28, 35);
//		triangle(28, 35, 31, 31, 34, 35);
//		popMatrix();

	}

}
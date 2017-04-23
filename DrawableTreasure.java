/**DrawableTreasure.java
 * Class that is used to help construct Treasures and illustrate them in the Processing program.
 * 
 * @author Andrew Lau
 * @version Project 03
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */
public class DrawableTreasure extends Treasure implements Drawable{

	/**constructor takes in a Maze argument and passes it to the superclass (Treasure) constructor.
	 * @param maze Maze argument passed to the superclass (Treasure) constructor.
	 */
	public DrawableTreasure(Maze maze) {
		super(maze);
	}

	/**constructor takes in a Maze argument and passes it to the superclass (Treasure) constructor.
	 * @param maze Maze argument passed to the superclass (Treasure) constructor.
	 * @param seed Long value argument passed to the superclass (Treasure) constructor.
	 */
	public DrawableTreasure(Maze maze, long seed){
		super(maze, seed);
	}

	/**constructor takes in a Maze argument and passes it to the superclass (Treasure) constructor.
	 * @param maze Maze argument passed to the superclass (Treasure) constructor.
	 * @param location Square argument passed to the superclass (Treasure) constructor.
	 */
	public DrawableTreasure(Maze maze, Square location){
		super(maze, location);
	}

	/**
	 * method used to draw the Treasure in the Processing program.
	 */
	public void draw() {
//		if(this.found() == false && location().seen() == true){
//			pushMatrix();
//			translate((int)location().x(), (int)location().y());
//			noStroke();
//
//			//Ticket Stub
//			Random rand = new Random();
//			fill(229, 229, 129);
//			rect(5, 15, 40, 20);
//			fill(229, 286, 129);
//			ellipse(6 + rand.nextInt(36), 16 + rand.nextInt(16), 1, 1);
//			ellipse(6 + rand.nextInt(36), 16 + rand.nextInt(16), 1, 1);
//			ellipse(6 + rand.nextInt(36), 16 + rand.nextInt(16), 1, 1);
//			ellipse(6 + rand.nextInt(36), 16 + rand.nextInt(16), 1, 1);
//			fill(0);
//			textFont(createFont("LucidaBrightRegular", 8));
//			text("Broadway", 6, 23);
//			text("Show", 6, 30);
//			popMatrix();
//		}
	}
}
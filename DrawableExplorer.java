public class DrawableExplorer extends Explorer implements Drawable{
	
	/**method that takes a Square, Maze and String argument and passes them to the superclass(Explorer) 
	 * to construct the object.
	 * @param location Square argument of the Explorer's location that is 
	 * passed into the superclass (Explorer) constructor.
	 * @param maze Maze argument that is passed into the superclass (Explorer) constructor.
	 * @param name String argument of the Explorer's name that is passed into the superclass (Explorer) constructor.
	 */
	public DrawableExplorer(Square location, Maze maze, String name) {
		super(location, maze, name);
	}

	/**
	 * method used to draw the Explorer in the Processing program.
	 */
	public void draw() {
//		pushMatrix();
//		translate((int)location().x(), (int)location().y());
//
//
//		noStroke();
//
//		// body
//
//		fill(173, 120, 47);
//		triangle(10, 10, 40, 10, 25, 45);
//		fill(255, 180, 0);
//		triangle(12, 10, 38, 10, 25, 43);
//
//		fill(173, 62, 47);
//		ellipse(30, 25, 4, 4);
//		ellipse(15, 13, 4, 4);
//		ellipse(25, 35, 4, 4);
//		ellipse(36, 14, 4, 4);
//
//
//		//eyes and mouth
//		fill(0);
//		noStroke();
//		ellipse(20, 15, 3, 3);
//		ellipse(30, 15, 3, 3);
//		stroke(0);
//		ellipse(25, 23, 5, 3);
//
//		//crust
//		fill(179,117,33);
//		noStroke();
//		rect(8, 6, 34, 4);
//		ellipse(8, 8, 4, 4);
//		ellipse(42, 8, 4, 4);
//
//		popMatrix();
	}

}
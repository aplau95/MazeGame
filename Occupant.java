/**Occupant.java
 * Class that contains methods to initialize the initial location of an Occupant and move it 
 * around the maze.
 * 
 * @author Andrew Lau
 * @version Project 03
 * @version 02-21-17
 * @version CPE102-07
 * @version Spring 2016
 */
public class Occupant {
	
	//instance variables
	private Square square;
	
	/**
	 * Default constructor that does nothing.
	 */
	public Occupant(){
	}
	
	/**
	 * constructor that accepts a Square argument to initialize the Occupant's location.
	 * @param start Square for the initial location of Occupant.
	 */
	public Occupant(Square start){
		this.square = start;
	}
	
	/**
	 * method to return the current square in which the Occupant is in.
	 * @return Square for the current square in which the Occupant is in.
	 */
	public Square location(){
		return square;
	}
	
	/**
	 * method to move the Occupant to the new location from the Square argument.
	 * @param newLoc Square for the new location for the Occupant.
	 */
	public void moveTo(Square newLoc){
		square = newLoc;
	}
}
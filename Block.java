import java.awt.*;

public class Block extends Piece{
	 /** Constructor: a new Block at position (x, y) on Map m
	 * @param x = x position
	 * @param y = y position
	 * @param m map of the game
	 */
	public Block(int x, int y, Map m){
		super(Piece.BLOCK, m);
		this.setX(x);
		this.setY(y);
		this.setColor(Color.WHITE);
	}
	/**
	 * Block should do nothing and struck on the map be an obstacle
	 */
	public void act(){
		this.setActed(true);
	}
	/** = representation of this piece */
	public String toString() {
        return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
    }
}

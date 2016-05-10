import java.awt.*;
public class Pillar extends Piece{
	 /** Constructor: a new Pillar at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. 
	 * @param x = x position
	 * @param y = y position
	 * @param c color of the pillar
	 * @param m map of the game
	 */
	public Pillar(int x, int y,int c, Map m){
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		if(c == 0) this.setColor(Color.RED);
		else if(c == 1) this.setColor(Color.GREEN);
		else this.setColor(Color.YELLOW);
	}
	/** Constructor: a new Pillar at position (x, y) on Map m
    with color c. Precondition: c is one of
    Color.RED, Color.GREEN, and Color.YELLOW.*/
	public Pillar(int x, int y, Color c, Map m){
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		this.setColor(c);
	}
	/**
	 * Pillar shounldn't move it only can't change color
	 * so 2/3 it should does nothing and struck on the map
	 * and 1/3 it will change the color randomly with color RED, GREEN, YELLOW
	 */
	public void act(){
		int randomLength = rand(1,3);
		if(!this.hasActed() && randomLength == 1){
			int randomColor = rand(1, 3);
			if(randomColor == 1) this.setColor(Color.RED);
			else if(randomColor == 2) this.setColor(Color.GREEN);
			else this.setColor(Color.YELLOW);
		}
		this.setActed(true);
	}
	/** = representation of this piece */
	public String toString() {
        return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
    }
}

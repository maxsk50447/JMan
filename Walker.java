import java.awt.Color;

public class Walker extends Piece{
	 /** Constructor: a new Walker at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. 
	 * @param x = x position
	 * @param y = y position
	 * @param c color of the Walker
	 * @param m map of the game
	 */
	public Walker(int x, int y, int c, Map m){
		super(Piece.WALKER, m);
		this.setX(x);
		this.setY(y);
		if(c == 0)this.setColor(Color.RED);
		else if(c == 1)this.setColor(Color.GREEN);
		else this.setColor(Color.YELLOW);
	}
	/** Constructor: a new Walker at position (x, y) on Map m
    with color c. Precondition: c is one of
    Color.RED, Color.GREEN, and Color.YELLOW.*/
	public Walker(int x, int y, Color c, Map m){
		super(Piece.WALKER, m);
		this.setX(x);
		this.setY(y);
		this.setColor(c);
	}
	/**
	 * Walker will move only in a random direction (4 direction: up, down, left, right)
	 * and it wll not change color
	 * so 2/3 it should does nothing and struck on the map
	 * and 1/3 it will move random direction
	 */
	public void act(){
		int randomLength = rand(1,3);
		if(!hasActed() && randomLength == 1){
			int randomMove = rand(1,4);
			if(randomMove == 1){
				if(getMap().isEmpty(getX() - 1, getY())){
					getMap().move(getX(), getY(), getX() - 1, getY());
				}
			} else if(randomMove == 2){
				if(getMap().isEmpty(getX() + 1, getY())){
					getMap().move(getX(), getY(), getX() + 1, getY());
				}
			} else if(randomMove == 3){
				if(getMap().isEmpty(getX(), getY() + 1)){
					getMap().move(getX(), getY(), getX() , getY() + 1);
				}
			} else {
				if(getMap().isEmpty(getX(), getY() - 1)){
				getMap().move(getX(), getY(), getX(), getY() - 1);
				}
			}
		}
		this.setActed(true);
	}
	/** = representation of this piece */
	public String toString() {
        return getColorWord() + " Walker at (" + getX() + ", " + getY() + ")";
    }
}

/*
 *    ===============================================================================
 *    MY NAME: STEVEN PHAM
 *    MY UPI: 515333180
 *    MovingSquare.java : The subclass of the MovingRectangle class.

 *    A Square shape that overrides the setHeight() and setWidth() methods of the MovingRectangle/MovingShape superclass.
 *    ===============================================================================
 */
import java.awt.*;
public class MovingSquare extends MovingRectangle{
	
	public MovingSquare() {
		super(50);
	}
	public MovingSquare(int x) {
		super(x);
	}
	public MovingSquare(int x, int y, int wh, int mw, int mh, Color bc, Color fc, String m, int pathType) {
		super(x, y, wh, wh, mw, mh, bc, fc, m, pathType);
	}
	/** Set the height of the shape.
     * @param h     the height value */
    public void setHeight(int h) { 
    	height = h;
    	width =h;
    }
    /** Set the width of the shape.
	 * @param w	 the width */
	public void setWidth(int w) { 
		width = w;
		height = w;
	}

}

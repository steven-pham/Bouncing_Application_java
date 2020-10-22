/*
 *    ===============================================================================
 *    MY NAME: STEVEN PHAM
 *    MY UPI: 515333180
 *    MovingRectangle.java : The subclass of the superclass MovingShape.

 *    A Rectangle shape that overrides the draw(), getArea() and contains() methods of the MovingShape superclass.
 *    ===============================================================================
 */
import java.awt.*;
public class MovingRectangle extends MovingShape{
	
	public MovingRectangle() {
		super();
	}
	public MovingRectangle(int x) {
		super(x);
	}
	public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, String m, int pathType) {
		super(x, y, w, h, mw, mh, bc, fc, m, pathType);
	}
	/** Returns whether the point is in the shape
	 * @param g	 the Graphics control */
    public boolean contains(Point p) {
    	return (p.x>=x) && (p.y>=y) && (p.x<=x+width) && (p.y<=y+height);
    }

    /** draw the shape
     * @param g     the Graphics control */
    public void draw(Graphics g) {
    	g.setColor(fillColor);
    	g.fillRect(x, y, width, height);
    	g.setColor(borderColor);
    	g.drawRect(x, y, width, height);
    	drawMessage(g);
    	drawHandles(g);
    }

	/** abstract getArea method
	 * Returns whether the area of the shape  */
	public double getArea() {
		return width * height;
	}

}

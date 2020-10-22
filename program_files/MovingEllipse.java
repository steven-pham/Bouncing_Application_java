/*
 *    ===============================================================================
 *    MY NAME: STEVEN PHAM
 *    MY UPI: 515333180
 *    MovingEllipse.java : The subclass of the MovingShape class.

 *    A Ellipse shape that overrides the contains(), draw() and getArea() methods of the MovingShape superclass.
 *    ===============================================================================
 */
import java.awt.*;
public class MovingEllipse extends MovingShape{
	public MovingEllipse() {
		super();
	}
	public MovingEllipse(int x) {
		super(x);
	}
	public MovingEllipse(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, String m, int pathType) {
		super(x, y, w, h, mw, mh, bc, fc, m, pathType);
	}
	/** Returns whether the point is in the shape
	 * @param g	 the Graphics control */
    public boolean contains(Point p) {
    	double dx, dy;
    	Point EndPt = new Point(x + width, y + height);
    	dx = (2 * p.x - x - EndPt.x) / (double) width;
    	dy = (2 * p.y - y - EndPt.y) / (double) height;
    	return dx * dx + dy * dy < 1.0; 
    }

    /** draw the shape
     * @param g     the Graphics control */
    public void draw(Graphics g) {
    	g.setColor(fillColor);
    	g.fillOval(x, y, width, height);
    	g.setColor(borderColor);
    	g.drawOval(x, y, width, height);
    	drawMessage(g);
    	drawHandles(g);
    }

	/** abstract getArea method
	 * Returns whether the area of the shape  */
	public double getArea() {
		return Math.PI*width*height/4;
	}

}

/*
 *    ===============================================================================
 *    MY NAME: STEVEN PHAM
 *    MY UPI: 515333180
 *    MovingSpinningCircle.java : The subclass of the MovingEllipse class.

 *    A Spinning Circle that specifies the starting angle and the rotational speed.
 *    It also overrides the setHeight(), setWidth() and draw() methods of the MovingEllipse/MovingShape superclass.
 *    ===============================================================================
 */
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Point;
public class MovingSpinningCircle extends MovingEllipse {
	public static final int ROTATION_SPEED = 20;
	private int startAngle = 0;
	
	public MovingSpinningCircle() {
		super(50);
	}
	public MovingSpinningCircle(int x) {
		super(x);
	}
	public MovingSpinningCircle(int x, int y, int wh, int mw, int mh, Color bc, Color fc, String m, int pathType) {
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
	/** draw the shape
     * @param g     the Graphics control */
    public void draw(Graphics g) {
    	g.setColor(fillColor);
    	g.fillArc(x, y, width, height, startAngle, 90);
    	g.fillArc(x, y, width, height, startAngle +180, 90);
    	g.setColor(Color.white);
    	g.fillArc(x, y, width, height, startAngle+90, 90);
    	g.fillArc(x, y, width, height, startAngle+270, 90);
    	startAngle -= ROTATION_SPEED;
    	g.setColor(borderColor);
    	g.drawOval(x, y, width, height);
    	drawMessage(g);
    	drawHandles(g);	
    }

}

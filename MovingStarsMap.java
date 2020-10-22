/*
 *    ===============================================================================
 *    MY NAME: STEVEN PHAM
 *    MY UPI: 515333180
 *    MovingStarsMap.java : The subclass of the MovingRectangle class.

 *    A StarsMap shape that generates 3 random points within its' rectangular area.
 *    It also overrides the draw(), setHeight(), setWidth() methods of the MovingRectangle/MovingShape superclass.
 *    ===============================================================================
 */
import java.awt.*;
import java.util.*;
import java.security.*;
public class MovingStarsMap extends MovingRectangle{
	private ArrayList<Point> p = new ArrayList<Point>();
	
	public MovingStarsMap() {
		super();
		SecureRandom randomNumbers = new SecureRandom();
		for(int i =0; i<3; i++) {
			int pointx = randomNumbers.nextInt(width);
			int pointy = randomNumbers.nextInt(height);
			p.add(new Point(pointx,pointy));
			
		}
	}
	public MovingStarsMap(int x) {
		super(x);
		SecureRandom randomNumbers = new SecureRandom();
		for(int i =0; i<3; i++) {
			int pointx = randomNumbers.nextInt(width);
			int pointy = randomNumbers.nextInt(height);
			p.add(new Point(pointx,pointy));
		}
	}
	public MovingStarsMap(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, String m, int pathType) {
		super(x, y, w, h, mw, mh, bc, fc, m, pathType);
		SecureRandom randomNumbers = new SecureRandom();
		for(int i =0; i<3; i++) {
			int pointx = randomNumbers.nextInt(width);
			int pointy = randomNumbers.nextInt(height);
			p.add(new Point(pointx,pointy));
		}
	}
	/** draw the shape
     * @param g     the Graphics control */
    public void draw(Graphics g) {
    	g.setColor(fillColor);
    	g.drawLine(x,y,x+p.get(0).x, y+p.get(0).y);
    	g.drawLine(x+p.get(0).x, y+p.get(0).y, x+p.get(1).x, y+p.get(1).y);
    	g.drawLine(x+p.get(1).x, y+p.get(1).y, x+p.get(2).x, y+p.get(2).y);
    	drawMessage(g);
    	drawHandles(g);
    }
    /** Set the height of the shape.
     * @param h     the height value */
    public void setHeight(int h) { 
    	double change = (double)h/ height;
    	for(Point i:p) {
    		i.y = (int) (i.y * change);
    	}
    	height = h;
    	
    }
    /** Set the width of the shape.
	 * @param w	 the width */
	public void setWidth(int w) {
		double change = (double)w/ width;
    	for(Point i:p) {
    		i.x = (int) (i.x * change);
    	}
		width = w;
		
	}

}

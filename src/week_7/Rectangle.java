package week_7;

public class Rectangle {
	
	private Point2DDouble topLeft;
	private Point2DDouble bottomRight;
	
	public Rectangle(Point2DDouble topLeft, Point2DDouble bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	
	public Rectangle() {
		this.topLeft = new Point2DDouble(0, 0);
		this.bottomRight = new Point2DDouble(1, 1);
	}
	
	public boolean isPointInside(Point2DDouble pt) {
		double xTopLeft = this.topLeft.getX();
		double xBottomRight = this.bottomRight.getX();
		double xPt = pt.getX();
		double yTopLeft = this.topLeft.getY();
		double yBottomRight = this.bottomRight.getY();
		double yPt = pt.getY();
		boolean withinX = false;
		boolean withinY = false;
		
		if (xPt > xTopLeft && xPt < xBottomRight) {
			withinX = true;
		}
		if (yPt > yTopLeft && yPt < yBottomRight) {
			withinY = true;
		}
		return withinX && withinY;
	}
}

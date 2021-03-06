package week_7;

public class Circle {
	
	private Point2DDouble centre;
	private double radius;
		
	public Circle(Point2DDouble centre, double radius) {
		this.centre = centre;
		this.radius = radius;
	}
	
	public Circle() {
		this.centre = new Point2DDouble(0, 0);
		this.radius = 1;
	}
	
	public boolean isPointInside(Point2DDouble pt) {
		double distancePTCentre = Point2DDouble.distance(this.centre, pt);
		if (distancePTCentre < this.radius) {
			return true;
		}
		return false;
	}
}

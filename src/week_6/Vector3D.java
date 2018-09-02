package week_6;

public class Vector3D {
	
	private double x;
	private double y;
	private double z;
	
	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getR() {
		double xSquared = x * x;
		double ySquared = y * y;
		double zSquared = z * z;
		double squareSum = xSquared + ySquared + zSquared;
		return Math.sqrt(squareSum);
	}
	
	public double getTheta() {
		return Math.acos(z / getR());
	}
	
	public double getPhi() {
		return Math.atan2(y, x);
	}
	
	public static Vector3D add(Vector3D lhs, Vector3D rhs) {
		double newX = lhs.x + rhs.x;
		double newY = lhs.y + rhs.y;
		double newZ = lhs.z + rhs.z;
		return new Vector3D(newX, newY, newZ);
	}
	
	public static Vector3D subtract(Vector3D lhs, Vector3D rhs) {
		double newX = lhs.x - rhs.x;
		double newY = lhs.y - rhs.y;
		double newZ = lhs.z - rhs.z;
		return new Vector3D(newX, newY, newZ);
	}
	
	public static Vector3D scale(Vector3D v, double scaleFactor) {
		double newX = v.x * scaleFactor;
		double newY = v.y * scaleFactor;
		double newZ = v.z * scaleFactor;
		return new Vector3D(newX, newY, newZ);
	}
	
	
}

package week_2;

public class PolarCoordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double radius = Math.sqrt(x * x + y * y);
		double theta = Math.atan2(y, x);
		System.out.println(radius);
		System.out.println(theta);
	}

}

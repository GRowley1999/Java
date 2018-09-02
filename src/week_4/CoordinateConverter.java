package week_4;

public class CoordinateConverter {

    public static double convertXYtoR(double x, double y) {
        // ADD CODE HERE
    	return Math.sqrt(x * x + y * y);
    }

    public static double convertXYtoT(double x, double y) {
        // ADD CODE HERE
    	return Math.atan2(y, x);
    }

    public static double convertRTtoX(double r, double theta) {
        // ADD CODE HERE
    	return r * Math.cos(theta);
    }

    public static double convertRTtoY(double r, double theta) {
        // ADD CODE HERE
    	return r * Math.sin(theta);
    }

    public static double convertDegToRad(double deg) {
        // ADD CODE HERE
    	return deg * Math.PI / 180;
    }

    public static double convertRadToDeg(double rad) {
        // ADD CODE HERE
    	return rad * 180 / Math.PI;
    }
}
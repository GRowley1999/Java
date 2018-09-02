package week_2;

public class QuadraticSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double discriminant = Math.sqrt((b * b) - (4 * a * c));
		double x1 = (- b + discriminant) / (2 * a);
		double x2 = (- b - discriminant) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);
	}

}

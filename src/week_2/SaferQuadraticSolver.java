package week_2;

public class SaferQuadraticSolver {
	
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double discriminant = b * b - 4 * a * c;
		double x1 = (- b + Math.sqrt(discriminant)) / 2 * a;
		double x2 = (- b - Math.sqrt(discriminant)) / 2 * a;
		if (a == 0) {
			System.out.println("A = 0. Cannot solve equation.");
		} else {
			if (discriminant < 0) {
				System.out.println("Equation is not solvable for real x.");
		} 	else {
				System.out.println(x1);
				System.out.println(x2);
		}
	}
	}
}

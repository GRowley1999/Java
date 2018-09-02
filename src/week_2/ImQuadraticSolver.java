package week_2;

public class ImQuadraticSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Command line arguments are parsed into type double.
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		// Discriminant is calculated and stored in a variable named discriminant.
		double discriminant = b * b - 4 * a * c;
		
		if (a == 0) {
			double x = - c / b;
			System.out.println(x);
		} else {
			if (discriminant >= 0) {
				double x1 = (- b + Math.sqrt(discriminant)) / (2 * a);
				double x2 = (- b - Math.sqrt(discriminant)) / (2 * a);
				System.out.println(x1);
				System.out.println(x2);
			} else {
				double real = (- b) / 2 * a;
				double im = Math.sqrt(Math.abs(discriminant)) / 2 * a;
				System.out.println(real + " + " + im + "i");
				System.out.println(real + " - " + im + "i");
			}
		}
	}
}


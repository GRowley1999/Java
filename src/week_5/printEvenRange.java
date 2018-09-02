package week_5;

public class printEvenRange {
	public static void main(String y[]) {
		int	lowerLimit = Integer.parseInt(y[0]);
		int upperLimit = Integer.parseInt(y[1]);
		if (lowerLimit <= upperLimit) {
			for (int i = lowerLimit; i <= upperLimit; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println(lowerLimit + " cannot be greater than " + upperLimit);
		}
	}
}
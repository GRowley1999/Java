package week_3;

public class ArithmeticSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(args[0]);
		int counter = 0;
		int sum = 0;
		while(counter < N) {
			counter++;
			sum += counter;
		}
		
		System.out.println(sum);
	}

}

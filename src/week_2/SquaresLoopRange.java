package week_2;

public class SquaresLoopRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start_number = Integer.parseInt(args[0]);
		int stop_number = Integer.parseInt(args[1]);
		if (start_number > stop_number) {
			System.out.println("Start-limit greater than stop-limit!");
		} else {
			for (int i = start_number; i < stop_number + 1; i++) {
				System.out.print(i * i + " ");
			}
		}
		}

}

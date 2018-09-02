package week_2;

public class MultiplesLoopRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start_number = Integer.parseInt(args[0]);
		int stop_number = Integer.parseInt(args[1]);
		int number = Integer.parseInt(args[2]);
		if (start_number > stop_number) {
			for (int i = start_number; i > stop_number - 1; i--) {
				if (i % number == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			for (int i = start_number; i < stop_number + 1; i++) {
				if (i % number == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

}

package week_2;

public class Distance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		System.out.print(max - min);
	}

}

package week_4;

public class NMax {
	
	public static int max(int a, int b, int c) {
		int[] nums = {b, c};
		int max = a;
		for (int num : nums) {
			if (num > max) max = num;
		}
		return max;
	}
	
	public static double max(double a, double b, double c) {
		double[] nums = {b, c};
		double max = a;
		for (double num : nums) {
			if (num > max) max = num;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();
		
		System.out.println(max(a, b, c));
	}
}

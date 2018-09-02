package week_3;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = args.length;
		int[] nums = new int[N];
		int[] copy = new int[N];
		
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		
		copy[N-1] = nums[0];
		for (int j = 0; j < N - 1; j++) {
			copy[j] = nums[j + 1];
		}
		
		for (int k = 0; k < N; k++) {
			System.out.print(copy[k] + " ");
		}
		
		System.out.println();
	}

}

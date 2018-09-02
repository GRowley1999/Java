package week_4;

public class Has271 {

	public static boolean has271(int[] nums) {
		int N = nums.length;
		for (int i = 0; i < N - 2; i++) {
			if (nums[i + 1] == nums[i] + 5 && nums[i + 2] == nums[i] - 1) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = args.length;
		int[] nums = new int[N];
		
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		
		System.out.println(has271(nums));
	}

}

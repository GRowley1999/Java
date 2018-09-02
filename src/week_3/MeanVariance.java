package week_3;

public class MeanVariance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = args.length;
		double[] nums = new double[N];

		// Reads in a series of commandline arguments and stores them in the array named nums.
		for (int i = 0; i < N; i++) {
			nums[i] = Double.parseDouble(args[i]);
		}
		
		double sum = 0;
		// Calculates the sum of the command-line arguments.
		for (int j = 0; j < N; j++) {
			sum += nums[j];
		}
		
		// Calculates the mean.
		double mean = sum / N;
		
		double sum_difference_squared = 0;
		// Calculates the sum of the differences of all of the arguments and the mean, squared.
		for (int k = 0; k < N; k++) {
			sum_difference_squared += Math.pow((nums[k] - mean), 2); 
		}
		
		// Calculates the variance.
		double variance = sum_difference_squared / N;
		
		// Prints the mean and variance on seperate lines.
		System.out.println(mean);
		System.out.println(variance);
	}

}

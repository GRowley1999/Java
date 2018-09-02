package week_3;
import java.util.Arrays;

public class TempMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = args.length;
		int[] dataset = new int[N];
		
		// Store the first command line argument in the first position of dataset.
		dataset[0] = Integer.parseInt(args[0]);
		// Read each of the command line arguments and convert into relevant numerical data based on the symbols in the input.
		for (int i = 1; i < N; i++) {
			String c = args[i];
			if (c.equals(".")) {
				dataset[i] = dataset[i - 1];
			}
			if (c.equals("+")) {
				dataset[i] = dataset[i - 1] + 1;
			}
			if (c.equals("-")) {
				dataset[i] = dataset[i - 1] - 1;
			}
		}
		// Print out the contents of dataset. 
		for (int data : dataset) {
			System.out.print(data + " ");
		}
		System.out.println("");
		
		// Sort the array.
		Arrays.sort(dataset);
		
		// Print the sorted array.
		for (int data : dataset) {
			System.out.print(data + " ");
		}
		System.out.println("");
		
		// Calculate the median.
		double median;
		if (N % 2 == 1) {
			median = dataset[(N + 1) / 2 - 1];
			System.out.println(median);
			
		}
		else {
			median = (dataset[(N / 2) - 1] + dataset[N / 2]) / 2.0;
			System.out.println(median);
		}
	}

}

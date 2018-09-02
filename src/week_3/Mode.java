package week_3;

public class Mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = args.length;
		int[] dataset = new int[N];
		int[] count = new int[10];
		
		for (int i = 0; i < N; i++) {
			dataset[i] = Integer.parseInt(args[i]);
		}
		
		for (int j = 0; j < N; j++) {
			count[dataset[j]]++;
		}
	
		 for (int k = 0; k < 10; k++) {
	            System.out.print("[" + k + "s: " + count[k] + "]");
	         if (count[k] > 0) {
	            System.out.print(" ");
	            for (int m = 0; m < count[k]; m++) {
	                System.out.print(".");
	            }
	         }
	            
	         System.out.print("\n");
	    }
		
		int max_index = 0;
		for (int n = 1; n < 10; n++) {
			if (count[n] > count[max_index]) max_index = n;
		}
		System.out.print("Mode: " + max_index);
	}

}

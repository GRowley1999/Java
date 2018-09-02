package week_4;

public class ArrayOps {

    public static double findMax(double[] data) {
        // ADD CODE HERE
    	int N = data.length;
    	double max = data[0];
    	for (int i = 1; i < N; i++) {
    		if (data[i] > max) max = data[i];
    	}
    	return max;
    }

    public static double[] normalise(double data[]) {
        // ADD CODE HERE
    	int N = data.length;
    	double[] newA = new double[N];
    	
    	for (int i = 0; i < N; i++) {
    		newA[i] = data[i];
    	}
    	
    	double sum = 0.0;
    	for (int j = 0; j < N; j++) {
    		sum += newA[j];
    	}
    	
    	for (int k = 0; k < N; k++) {
    		newA[k] /= sum; 
    	}
    	
    	return newA;
    }

    public static void normaliseInPlace(double data[]) {
        // ADD CODE HERE
    	int N = data.length;
    	double sum = 0.0;
    	for (int i = 0; i < N; i++) {
    		sum += data[i];
    	}
    	
    	for (int j = 0; j < N; j++) {
    		data[j] /= sum;
    	}
    	
    }

    public static double[] reverse(double[] data) {
        // ADD CODE HERE
    	int N = data.length;
    	double[] newA = new double[N];
    	
    	for (int i = 0; i < N; i++) {
    		newA[i] = data[N-1-i];
    	}
    	
    	return newA;
    }

    public static void reverseInPlace(double[] data) {
        // ADD CODE HERE
    	int N = data.length;
    	
    	for (int i = 0; i < N / 2; i++) {
    		double temp = data[i];
    		data[i] = data[N-1-i];
    		data[N-1-i] = temp; 
    	}
    }

    public static void swap(double[] data1, double[] data2) {
        // ADD CODE HERE
    	int N = data1.length;
    	
    	for (int i = 0; i < N; i++) {
    		double temp = data1[i];
    		data1[i] = data2[i];
    		data2[i] = temp;
    	}
    }

}
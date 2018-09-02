package week_5;

public class NbyN {
	
	public static int[][] nbyn(int n) {
		int[][] nbynMatrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					nbynMatrix[i][j] = i;
				} else {
					nbynMatrix[i][j] = 0;
				}
			}
		}
		
		return nbynMatrix;
		
	}
	
	public static void main(String[] args) {
		int[][] matrix10by10 = nbyn(10);
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(matrix10by10[i][j] + " ");
			}
			System.out.println("");
		}
	}
}

package week_7;

public class NoughtsAndCrosses {
	
	private int[][] board;
	
	public NoughtsAndCrosses(int[][] board) {
		this.board = board;
	}
	
	public boolean isDraw() {
		for (int i = 0; i < 3; i++) {
				if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != 0) {
					return false;
				}
		}
		for (int j = 0; j < 3; j++) {
				if (board[0][j] == board[1][j] && board[0][j] == board[2][j] && board[0][j] != 0) {
					return false;
			}
		}
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0) {
			return false;
		}
		if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0) {
			return false;
		}
		return true;
	}
	
	public int whoWon() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != 0) {
				return board[i][0];
			}
		}
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == board[1][j] && board[0][j] == board[2][j] && board[0][j] != 0) {
				return board[0][j];
			}
		}
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0) {
			return board[0][0];
		}
		if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0) {
			return board[0][2];
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[][] board = {{ 0, 0, 0},
                		  {0, 0, 0},
                		  {0, 0, 0},};

		NoughtsAndCrosses nc = new NoughtsAndCrosses(board);

		System.out.println(nc.isDraw()); // false
		System.out.println(nc.whoWon()); // NOUGHTS
	}
}

package com.suresh.learnings.twentynineteen.june;

/**
 * 1. Construct a 2 dimensional array
 * 2. Check the following rules and confirm if the array has a winner (or) not
 * 2.1 All columns in a row (N) has the same value (X) - WIN
 * 2.2 A particular column (M) in every row has the same value (X) - WIN
 * 2.3 Diagonal columns has the same value (X) - WIN
 */
public class TicTacToe {

	public static void main(String[] args) {
		TicTacToe player = new TicTacToe();
		player.identifyWinningPlayer(new String[12][2]);
	}

	public void identifyWinningPlayer(String[][] input) {
		
		if (input == null || input.length <= 0) {
			return;
		}
		
		System.out.println(""+input[0].length);
		
		/*String[][] board = new String[5][10];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("board["+i+"]"+"["+j+"]" + "===>" + input[i][j]);
			}
		}*/
	}
}

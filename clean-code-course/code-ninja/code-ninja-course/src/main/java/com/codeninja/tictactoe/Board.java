package com.codeninja.tictactoe;

public class Board {
	private boolean theBoard[][];
	
	public Board() {
		theBoard = new boolean[3][3];
		for (int i=0;i<=2; i++)
			for (int j=0;j<=2; j++)
				theBoard[i][j]=false;

	}
	
	public boolean isOccupied(int row, int column) {
		return (theBoard[row][column]);
	}
	
	public void store(int row, int column) {
		theBoard[row][column] = true;
	}
}

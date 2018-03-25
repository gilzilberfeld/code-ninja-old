package com.codeninja.tictactoe;

public class Player {
	Game theGame;
	
	public PlayerTypes type;
	
		
	public Player (Game game, PlayerTypes type) {
		theGame = (game);
		this.type = type;
	}
	
	public void place(int row, int column) {
		theGame.move(row,column, type);
	}

}

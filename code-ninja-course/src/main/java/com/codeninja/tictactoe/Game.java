package com.codeninja.tictactoe;

public class Game {
	public Boolean isOver;
	Board 	board;
	Player playerX;
	Player playerO;
	Player nextPlayer;

	void switchPlayers() {
		if (nextPlayer == playerX)
			nextPlayer = playerO;
		else
			nextPlayer = playerX;
	}

	public Game() {
		isOver = false;
		playerX = new Player( this , PlayerTypes.X);
		playerO = new Player( this, PlayerTypes.O);
		nextPlayer = playerX;
		board = new Board();
	}

	public Player getPlayerX() {
		return playerX;
	}
	public Player getPlayerO() {
		return playerO;
	}
	
	public Player getNextPlayer() {
		return nextPlayer;
	}
	
	void move(int row, int column, PlayerTypes type) {
		if (board.isOccupied(row,column))
		{
			return;
		}

		board.store(row,column);

		if (nextPlayer.type == type)
			switchPlayers();

	}


}

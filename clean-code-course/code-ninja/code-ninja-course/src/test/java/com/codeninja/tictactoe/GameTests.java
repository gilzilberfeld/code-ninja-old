package com.codeninja.tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTests {

	@Test
	public void gameIsNotOver_inTheBeginning() {
		Game game = new Game();
		assertFalse(game.isOver);
	}

	@Test
	public void aGameHasToPlayers() {
		Game game = new Game();
		Player x = game.getPlayerX();
		Player o = game.getPlayerO();
		assertNotNull(x);
		assertNotNull(o);
	}
		
	@Test
	public void firstPlayerIsX() {
		Game game = new Game();
		Player x = game.getPlayerX();
		Player nextPlayer = game.getNextPlayer();
		assertSame(x, nextPlayer);
	}

	@Test
	public void whenPlayerXMarksAnEmptySpace_thenItIsPlayerOTurn() {
		Game game = new Game();
		Player x = game.getPlayerX();
		Player o = game.getPlayerO();
		x.mark(2, 2);
		assertSame(o, game.getNextPlayer());
	}
		
	@Test
	public void whenPlayerOMarksAnEmptySpace_thenItIsPlayerXTurn() {
		Game game = new Game();
		Player x = game.getPlayerX();
		Player o = game.getPlayerO();
		x.mark(2,2);
		o.mark(1,0);
		assertSame(x, game.getNextPlayer());
	}

	@Test
	public void aPlayerCannotMarkTwiceInARow() {
		Game game = new Game();
		Player x = game.getPlayerX();
		Player o = game.getPlayerO();
		x.mark(2,2);
		x.mark(1,0);
		assertSame(o, game.getNextPlayer());
	}
	
	@Test
	public void aPlayerCannotMarkAnOccupiedSpace() {
		Game game = new Game();
		Player x = game.getPlayerX();
		Player o = game.getPlayerO();
		x.mark(2,2);
		o.mark(2,2);
		assertSame(o, game.getNextPlayer() );
	}
	
	@Test
	public void aGameIsWon_whenARowOfThreeOfTheSameMark() {}

	@Test
	public void aGameIsWon_whenAColumnOfThreeOfTheSameMark() {}

	@Test
	public void aGameIsWon_whenADiagonalOfThreeOfTheSameMark() {}

	@Test
	public void whenAGameIsTied_ThereIsNoWinner() {}

	@Test
	public void whenAGameIsTied_allSpacesAreOccupied() {}

	@Test
	public void whenAGameIsWon_thenThereIsOneWinner() {}

	@Test
	public void whenThereIsAWinner_thenTheGameIsOver() {}

	@Test
	public void whenThereIsATie_thenTheGameIsOver() {}
}

package org.psnbtech;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.psnbtech.BoardPanel;
import org.psnbtech.SnakeGame;
import org.psnbtech.TileType;

class BoardPanelTest {

	private BoardPanel board;
	private SnakeGame game;

	@BeforeEach
	void setUp() {
		game = new SnakeGame();
		board = new BoardPanel(game);
	}

	@Test
	void testBoardInitializedWithNullTiles() {
		for (int x = 0; x < BoardPanel.COL_COUNT; x++) {
			for (int y = 0; y < BoardPanel.ROW_COUNT; y++) {
				assertNull(board.getTile(x, y), "Tile should initialize as null");
			}
		}
	}

	@Test
	void testSetAndGetTile() {
		board.setTile(3, 3, TileType.SnakeBody);
		assertEquals(TileType.SnakeBody, board.getTile(3, 3), "Tile should contain SnakeBody");
	}

	@Test
	void testClearBoard() {
		board.setTile(3, 3, TileType.SnakeBody);
		board.clearBoard();
		assertNull(board.getTile(3, 3), "Tile should be null after clearBoard");
	}

}

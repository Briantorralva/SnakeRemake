package org.psnbtech;

import static org.junit.Assert.*;
import java.awt.Point;
import org.junit.Before;
import org.junit.Test;

public class BoardPanelTest {

    private BoardPanel boardPanel;
    private SnakeGame mockGame;

    @Before
    public void setUp() {
        // Create a mock SnakeGame instance
        mockGame = new SnakeGame();
        boardPanel = new BoardPanel(mockGame);
    }

    @Test
    public void testClearBoard() {
        // Set a tile to a non-null value
        Point point = new Point(0, 0);
        boardPanel.setTile(point, TileType.SnakeBody);

        // Assert the tile is set
        assertNotNull("Tile should not be null before clearing.", boardPanel.getTile(0, 0));

        // Clear the board
        boardPanel.clearBoard();

        // Assert the tile is null after clearing
        assertNull("Tile should be null after clearing the board.", boardPanel.getTile(0, 0));
    }
}


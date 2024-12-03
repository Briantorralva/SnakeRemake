package test.java.org.psnbtech;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Color;
import java.awt.Dimension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.psnbtech.BoardPanel;
import org.psnbtech.SidePanel;
import org.psnbtech.SnakeGame;

public class SidePanelTest {

    private SidePanel sidePanel;
    private SnakeGame game;

    @BeforeEach
    void setUp() {
        game = new SnakeGame();
        sidePanel = new SidePanel(game);
    }

    @Test
    void testPanelProperties() {
        assertNotNull(sidePanel, "SidePanel should not be null");
        assertEquals(new Dimension(300, BoardPanel.ROW_COUNT * BoardPanel.TILE_SIZE), 
                     sidePanel.getPreferredSize(), 
                     "Dimensions should match expected");
        assertEquals(Color.BLACK, sidePanel.getBackground(), "Background color should be black");
    }
}

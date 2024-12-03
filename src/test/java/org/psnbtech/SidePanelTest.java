package org.psnbtech;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Dimension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SidePanelTest {

    private SidePanel sidePanel;
    private SnakeGame mockGame; // Assuming you have a way to mock or instantiate SnakeGame.

    @BeforeEach
    void setUp() {
        mockGame = new SnakeGame(); // This needs to be adapted based on how SnakeGame can be constructed.
        sidePanel = new SidePanel(mockGame);
    }

    @Test
    void testSidePanelInitialization() {
        assertNotNull(sidePanel, "SidePanel should be successfully instantiated.");
    }

    @Test
    void testPreferredDimensions() {
        Dimension expected = new Dimension(300, BoardPanel.ROW_COUNT * BoardPanel.TILE_SIZE);
        assertEquals(expected, sidePanel.getPreferredSize(), "SidePanel should have correct preferred dimensions.");
    }

    @Test
    void testBackgroundColor() {
        assertEquals(java.awt.Color.BLACK, sidePanel.getBackground(), "SidePanel should have a black background.");
    }
}

package com.agiletraining.base;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BowlingGameTest {

    private BowlingGame game;
    
    @Before
    public void setup() {
        game = new BowlingGame();
    }
    
    @Test
    public void doTest() {
        assertTrue(true);
        assertEquals(game.getClass().getName(),"com.agiletraining.base.BowlingGame");
    }
}

package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class AdventureTest {
    @Test
    public void newAdventure_InstantiateCorrectly() throws Exception {
        Adventure testAdventure = new Adventure();
        assertEquals(true, testAdventure instanceof Adventure);
    }

    @Test
    public void passBack_passBackUserInput_true() throws Exception {
        Adventure testAdventure = new Adventure();
        assertEquals(true, testAdventure.passBack("1"));

    }
    @Test
    public void passBack_passBackUserInput_false() throws Exception {
        Adventure testAdventure = new Adventure();
        assertEquals(false, testAdventure.passBack("2"));

    }
}

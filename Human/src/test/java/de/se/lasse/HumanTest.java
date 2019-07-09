package de.se.lasse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Human.
 */
public class HumanTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCheck()
    {
       Human myHumanBeing = new Human();
        assertTrue(myHumanBeing.check(179));
    }
}

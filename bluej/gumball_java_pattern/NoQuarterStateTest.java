

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NoQuarterStateTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NoQuarterStateTest
{
    /**
     * Default constructor for test class NoQuarterStateTest
     */
    public NoQuarterStateTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

   

    @Test
    public void insert()
    {
        GumballMachine g1 = new GumballMachine(20);
        NoQuarterState noQuarte1 = new NoQuarterState(g1);
        assertEquals(noQuarte1, g1.getState());
        noQuarte1.insertQuarter();
        assertEquals(g1.getHasQuarterState(), g1.getState());
        noQuarte1.insertNickel();
        noQuarte1.insertQuarter();
        assertEquals(g1.getHasQuarterState(), g1.getState());
    }


    @Test
    public void eject()
    {
        GumballMachine g1 = new GumballMachine(5);
        NoQuarterState noQuarte1 = new NoQuarterState(g1);
        assertEquals(noQuarte1, g1.getState());
        noQuarte1.ejectDime();
        assertEquals(noQuarte1, g1.getState());
    }

    @Test
    public void turnCrank()
    {
        GumballMachine g1 = new GumballMachine(10);
        NoQuarterState noQuarte1 = new NoQuarterState(g1);
        noQuarte1.turnCrank();
        assertEquals(noQuarte1, g1.getState());
    }
}







import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    private GumballMachine m1;

    /**
     * Default constructor for test class GumballMachineTest
     */
    public GumballMachineTest()
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
        m1 = new GumballMachine(5);
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
    public void endToEnd()
    {
        m1.insertQuarter();
        m1.insertNickel();
        m1.insertQuarter();
        m1.insertDime();
       
        assertEquals(false, m1.isGumballInSlot());
        m1.releaseBall();
        m1.turnCrank();
        assertEquals(true, m1.isGumballInSlot());
        m1.takeGumballFromSlot();
        assertEquals(false, m1.isGumballInSlot());
    }
}




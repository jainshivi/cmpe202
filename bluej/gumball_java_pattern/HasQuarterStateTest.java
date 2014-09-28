import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HasQuarterStateTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HasQuarterStateTest
{
    private GumballMachine m1;
    private HasQuarterState hasQuart1;

    /**
     * Default constructor for test class HasQuarterStateTest
     */
    public HasQuarterStateTest()
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
        hasQuart1 = new HasQuarterState(m1);
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
        assertEquals(0, hasQuart1.getTotalValue());
        hasQuart1.insertDime();
        assertEquals(10, hasQuart1.getTotalValue());
        hasQuart1.insertNickel();
        assertEquals(15, hasQuart1.getTotalValue());
        hasQuart1.insertQuarter();
        assertEquals(40, hasQuart1.getTotalValue());
        hasQuart1.insertQuarter();
        assertEquals(65, hasQuart1.getTotalValue());
        hasQuart1.insertQuarter();
        assertEquals(65, hasQuart1.getTotalValue());
    }

    @Test
    public void eject()
    {
        
        m1.setState(hasQuart1);
        hasQuart1.insertQuarter();
        hasQuart1.ejectNickel();
        assertEquals(20, hasQuart1.getTotalValue());
        hasQuart1.ejectQuarter();
        assertEquals(20, hasQuart1.getTotalValue());
        hasQuart1.ejectDime();
        assertEquals(10, hasQuart1.getTotalValue());
        hasQuart1.insertNickel();
        hasQuart1.insertDime();
        assertEquals(25, hasQuart1.getTotalValue());
        hasQuart1.ejectQuarter();
        assertEquals(0, hasQuart1.getTotalValue());
    }

    @Test
    public void turnCrank()
    {
        m1.setState(hasQuart1);
        assertEquals(hasQuart1, m1.getState());
        hasQuart1.insertQuarter();
        hasQuart1.insertDime();
        hasQuart1.insertQuarter();
        hasQuart1.turnCrank();
        assertEquals(m1.getSoldState(), m1.getState());
        m1.setState(hasQuart1);
        hasQuart1.insertQuarter();
        hasQuart1.turnCrank();
        assertEquals(hasQuart1, m1.getState());
        hasQuart1.insertDime();
        hasQuart1.insertQuarter();
        hasQuart1.turnCrank();
        assertEquals(0, hasQuart1.getTotalValue());
    }
}












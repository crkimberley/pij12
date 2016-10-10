import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 11/10/2016.
 */
public class IntSetTest {
    private IntSet set;

    @Before
    public void setUp() throws Exception {
        //set = new ListIntSet();
        set = new TreeIntSet(5);
    }

    @Test
    public void testAddNumberThenCheckContains() {
        set.add(19);
        assertTrue(set.contains(19));
        assertTrue(set.containsVerbose(19));
    }

    @Test
    public void testAddNumbersThenCheckToString() {
        set.add(17);
        set.add(31);
        set.add(94);
        assertEquals("5,17,31,94",set.toString());
    }

    @Test
    public void testAdd2IdenticalNumbers() {
        set.add(43);
        set.add(43);
        set.contains(43);
        set.containsVerbose(43);
    }
}
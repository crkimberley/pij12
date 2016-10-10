import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 10/10/2016.
 */
public class PersonTest {
    private Person p;

    @Before
    public void setUp() {
        p = new Person();
    }

    @Test
    public void testsNormalName() {
        String input = "Dereck Robert Yssirt";
        String output = p.getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);
    }

    @Test
    public void testsNameWith2SpacesInMiddle() {
        String input = "Dereck  Robert Yssirt";
        String output = p.getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);
    }

    @Test
    public void testsNameWithSpaceAtStart() {
        String input = " Dereck Robert Yssirt";
        String output = p.getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);
    }

    @Test
    public void testsNameWithSpaceAtEnd() {
        String input = " Dereck Robert Yssirt ";
        String output = p.getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);
    }
}
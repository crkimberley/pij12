import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 10/10/2016.
 */
public class HashUtilitiesTest {
    Random random = new Random();

    @Test
    public void testsShortHashOutputRange() throws Exception {
        for (int i=0; i<1000000; i++) {
            int input = random.nextInt();
            int output = HashUtilities.shortHash(input);
            int expectedLow = 0;
            int expectedHigh = 999;
            boolean expected = (output >= expectedLow && output <= expectedHigh);
            assertTrue("Output out of range", expected);
        }
    }

    @Test
    public void testsZeroInput() {
        int input = 0;
        int output = HashUtilities.shortHash(input);
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void tests999Input() {
        int input = 999;
        int output = HashUtilities.shortHash(input);
        int expected = 999;
        assertEquals(expected, output);
    }

    @Test
    public void tests1000Input() {
        int input = 1000;
        int output = HashUtilities.shortHash(input);
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void tests1999Input() {
        int input = 1999;
        int output = HashUtilities.shortHash(input);
        int expected = 999;
        assertEquals(expected, output);
    }

    @Test
    public void testsParticularNumberInput() {
        int input = 213765;
        int output = HashUtilities.shortHash(input);
        int expected = 765;
        assertEquals(expected, output);
    }
}
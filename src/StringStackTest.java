import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 10/10/2016.
 */
public class StringStackTest {
    private StringStack stack;

    @Before
    public void setUp() throws Exception {
        //stack = new ArrayStringStack();
        stack = new PointerStringStack();
    }

    @Test
    public void testPushThenPop() throws Exception {
        stack.push("Amy");
        assertEquals("Amy", stack.pop());
    }

    @Test
    public void testPush3ThenPop3() throws Exception {
        stack.push("Amy");
        stack.push("Beyonce");
        stack.push("Claire");
        assertEquals("Claire", stack.pop());
        assertEquals("Beyonce", stack.pop());
        assertEquals("Amy", stack.pop());
    }

    @Test
    public void testPush3ThenPeek() throws Exception {
        stack.push("Amy");
        stack.push("Beyonce");
        stack.push("Claire");
        assertEquals("Claire", stack.peek());
    }

    @Test
    public void testPushThenPopThenIsEmpty() throws Exception {
        stack.push("Amy");
        assertEquals("Amy", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testEmptyStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeekEmptyStack() {
        assertNull(stack.peek());
    }

    @Test
    public void testPopEmptyStack() {
        assertNull(stack.pop());
    }
}
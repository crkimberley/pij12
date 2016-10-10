import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crkimberley on 10/10/2016.
 */
public class PersonQueueTest {
    private PersonQueue queue;
    private Person a,b,c;

    @Before
    public void setUp() throws Exception {
        //queue = new PersonQueueArrayImpl();
        //queue = new PersonQueueImpl();
        queue = new PersonQueueImpl2();
        a = new Person("Amy");
        b = new Person("Belinda");
        c = new Person("Claire");
    }

    @Test
    public void testInsert2NamesThenRetrieve1() throws Exception {
        queue.insert(a);
        queue.insert(b);
        assertEquals(a, queue.retrieve());
    }

    @Test
    public void testInsert3NamesThenGetSize() throws Exception {
        queue.insert(a);
        queue.insert(b);
        queue.insert(c);
        assertEquals(3, queue.getSize());
    }

    @Test
    public void testInsert3NamesThenRetrieve3Names() throws Exception {
        queue.insert(a);
        queue.insert(b);
        queue.insert(c);
        assertEquals(a, queue.retrieve());
        assertEquals(b, queue.retrieve());
        assertEquals(c, queue.retrieve());
    }

    @Test
    public void testGetSizeOfEmptyQueue() {
        assertEquals(0, queue.getSize());
    }

    @Test
    public void testRetrievefromEmptyQueue() {
        assertNull(queue.retrieve());
    }
}
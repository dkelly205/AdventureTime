import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;

    @Before
    public void setUp() throws Exception {
        cleric = new Cleric("Doc", 100);

    }

    @Test
    public void testName() {
        assertEquals("Doc", cleric.getName());
    }

    @Test
    public void testHealth(){
        assertEquals(100, cleric.getHealth());
    }
}

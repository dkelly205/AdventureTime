import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicalBeingTest {

    private MagicalBeing wizard;

    @Before
    public void before() {
        wizard = new MagicalBeing(MagicalBeingType.WIZARD, "Gandolf", 100, WeaponType.WAND);
    }

    @Test
    public void testName() {
        assertEquals("Gandolf", wizard.getName());
    }
}

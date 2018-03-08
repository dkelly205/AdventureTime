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

    @Test
    public void testWeapon() {
        assertEquals(WeaponType.WAND,wizard.getWeapon());
    }

    @Test
    public void testType() {
        assertEquals(MagicalBeingType.WIZARD, wizard.getType());
    }

    @Test
    public void testCanCastSpell(){
        assertEquals(5 ,wizard.attack());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicalBeingTest {

    private MagicalBeing wizard;

    @Before
    public void before() {
        wizard = new MagicalBeing(MagicalBeingType.WIZARD, "Gandolf", 100, WeaponType.WAND, SpellType.FIREBALL);
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
        assertEquals(50 ,wizard.castSpell());
    }

    @Test
    public void testCanChangeSpell() {
        wizard.setSpell(SpellType.LIGHTENING_STRIKE);
        assertEquals(SpellType.LIGHTENING_STRIKE, wizard.getSpell());
    }
}


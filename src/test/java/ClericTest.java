import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private Fighter dwarf;

    @Before
    public void setUp() throws Exception {
        cleric = new Cleric("Doc", 100, HealType.POTION);
        dwarf = new Fighter(FighterType.DWARF, "Mordo", 60, WeaponType.AXE);

    }

    @Test
    public void testName() {
        assertEquals("Doc", cleric.getName());
    }

    @Test
    public void testHealth(){
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void canHealPlayer() {
        cleric.healPlayer(dwarf, HealType.POTION);
        assertEquals(100, dwarf.getHealth());
    }
}

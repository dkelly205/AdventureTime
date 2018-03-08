import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    private Fighter dwarf;
    private Fighter barbarian;
    private Fighter knight;

    @Before
    public void before() {
        dwarf = new Fighter(FighterType.DWARF, "Mordo", 100, WeaponType.AXE);
    }

    @Test
    public void playerHasName() {
        assertEquals("Mordo", dwarf.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canGetType() {
        assertEquals(FighterType.DWARF, dwarf.getType());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(WeaponType.AXE, dwarf.getWeapon());
    }

}

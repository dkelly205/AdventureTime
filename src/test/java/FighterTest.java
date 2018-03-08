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

    @Test
    public void canAttack() {
        assertEquals(40, dwarf.attack());
    }

    @Test
    public void canChangeWeapon() {
        dwarf.setWeapon(WeaponType.CLUB);
        assertEquals(WeaponType.CLUB, dwarf.getWeapon());
    }
}

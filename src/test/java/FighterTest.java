import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    private Fighter dwarf;
    private Fighter barbarian;
    private Fighter knight;

    @Before
    public void before() {
        dwarf = new Fighter(FighterType.DWARF, "Mordo", 100);
        barbarian= new Fighter(FighterType.BARBARIAN, "Conan", 150);
        knight = new Fighter(FighterType.KNIGHT, "Shug", 250);
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
}

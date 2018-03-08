import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy troll;


    @Before
    public void setUp() throws Exception {
        troll = new Enemy(EnemyType.TROLL, 100, WeaponType.CLUB);
    }

    @Test
    public void testType() {
        assertEquals(EnemyType.TROLL, troll.getType());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, troll.getHealth());
    }

    @Test
    public void testWeapon() {
        assertEquals(WeaponType.CLUB, troll.getWeapon());
    }
}

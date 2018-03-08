import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    private TreasureRoom treasureRoom;
    private Enemy troll;
    private Fighter dwarf;
    private Fighter barbarian;
    private MagicalBeing wizard;
    private ArrayList<Player> players;
    private ArrayList<Enemy> enemies;

    @Before
    public void before() {
        treasureRoom = new TreasureRoom("Treasure room", 10,  TreasureType.GOLD);
        troll = new Enemy(EnemyType.TROLL, 100, WeaponType.CLUB);
        dwarf = new Fighter(FighterType.DWARF, "Mordo", 100, WeaponType.AXE);
        barbarian = new Fighter(FighterType.BARBARIAN, "Conan", 100, WeaponType.AXE);
        wizard = new MagicalBeing(MagicalBeingType.WIZARD, "Gandolf", 100, WeaponType.WAND, SpellType.FIREBALL, CreatureType.DRAGON);
        players = new ArrayList<>();
        enemies = new ArrayList<>();
    }

    @Test
    public void testHasName(){
        assertEquals("Treasure room", treasureRoom.getName());
    }

    @Test
    public void testHasTreasure() {
        assertEquals(TreasureType.GOLD, treasureRoom.getTreasure());
    }

    @Test
    public void testRoomStartsWithNoPlayers(){
        assertEquals(0, treasureRoom.numberOfPlayers());
    }

    @Test
    public void testRoomStartsWithNoEnemies(){
        assertEquals(0,treasureRoom.numberOfEnemies() );
    }





//    @Test
//    public void testCanAddPlayersToRoom(){
//        assertEquals(3, treasureRoom.add());
//    }
}

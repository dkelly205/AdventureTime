import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    private TreasureRoom treasureRoom;
    private Enemy troll;
    private Fighter dwarf;

    @Before
    public void before() {
        treasureRoom = new TreasureRoom("Treasure room", TreasureType.GOLD);
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
}

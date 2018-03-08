import org.junit.Before;
import org.junit.Test;

public class TreasureRoomTest {

    private TreasureRoom treasureRoom;

    @Before
    public void before() {
        treasureRoom = new TreasureRoom("Treasure room", TreasureType.GOLD);
    }



}

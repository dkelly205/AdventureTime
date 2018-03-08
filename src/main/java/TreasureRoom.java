public class TreasureRoom extends Room {

    private TreasureType treasure;

    public TreasureRoom(String name, int capacity, TreasureType treasure) {
        super(name, capacity);
        this.treasure = treasure;

    }

    public TreasureType getTreasure() {
        return treasure;
    }
}

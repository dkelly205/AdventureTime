public enum TreasureType {
    GOLD(10),
    GEMS(50);

    private int value;

    TreasureType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}

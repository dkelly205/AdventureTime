public enum EnemyType {
    TROLL(100),
    ORC(120);

    private int health;

    SpellType(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }
}

public enum CreatureType {
    OGRE(100),
    DRAGON(200);

    private int creatureHealth;

    SpellType(int creatureHealth){
        this.creatureHealth = creatureHealth;
    }

    public int getCreatureHealth(){
        return creatureHealth;
    }
}

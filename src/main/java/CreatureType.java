public enum CreatureType {
    OGRE(100),
    DRAGON(200);

    private int creatureHealth;

    CreatureType(int creatureHealth){
        this.creatureHealth = creatureHealth;
    }

    public int getCreatureHealth(){
        return creatureHealth;
    }
}

public enum SpellType {
    FIREBALL(50),
    LIGHTENING_STRIKE(60);

    private int spellDamage;

    SpellType(int spellDamage){
        this.spellDamage = spellDamage;
    }

    public int getDamage(){
        return spellDamage;
    }
}



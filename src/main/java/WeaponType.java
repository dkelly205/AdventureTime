public enum WeaponType {
    SWORD(30),
    AXE(40),
    CLUB(20),
    WAND(5),
    STAFF(15);

    private int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}

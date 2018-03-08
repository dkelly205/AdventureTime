public class Fighter extends Player implements Attackable {

    private FighterType type;
    private WeaponType weapon;

    public Fighter(FighterType type, String name, int health, WeaponType weapon) {
        super(name, health);
        this.type = type;
        this.weapon = weapon;
    }

    public FighterType getType() {
        return type;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public int attack() {
        return this.weapon.getDamage();
    }


    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}

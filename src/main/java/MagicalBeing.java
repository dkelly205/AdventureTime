public class MagicalBeing extends Player implements Attackable{

    private MagicalBeingType type;
    private WeaponType weapon;


    public MagicalBeing(MagicalBeingType type, String name, int health, WeaponType weapon) {
        super(name, health);
        this.type = type;
        this.weapon = weapon;
    }

    public MagicalBeingType getType() {
        return type;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public int attack() {
        return this.weapon.getDamage();
    }
}

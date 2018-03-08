public class MagicalBeing extends Player implements Attackable{

    private MagicalBeingType type;
    private WeaponType weapon;
    private SpellType spell;


    public MagicalBeing(MagicalBeingType type, String name, int health, WeaponType weapon, SpellType spell) {
        super(name, health);
        this.type = type;
        this.weapon = weapon;
        this.spell = spell;
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

public class MagicalBeing extends Player {

    private MagicalBeingType type;
    private WeaponType weapon;


    public MagicalBeing(MagicalBeingType type, String name, int health, WeaponType weapon) {
        super(name, health);
        this.type = type;
        this.weapon = weapon;
    }
}

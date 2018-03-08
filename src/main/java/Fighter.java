public class Fighter extends Player {

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
}

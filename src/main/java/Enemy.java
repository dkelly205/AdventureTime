public class Enemy implements Attackable{

    private EnemyType enemy;
    private WeaponType weapon;
    private int health;

    public Enemy(EnemyType enemy, int health, WeaponType weapon) {
        this.health = health;
        this.enemy = enemy;
        this.weapon = weapon;
    }

    public EnemyType getType() {
        return enemy;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    @Override
    public int attack() {
        return this.weapon.getDamage();
    }

    public int getHealth() {
        return health;
    }
}

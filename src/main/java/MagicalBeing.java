public class MagicalBeing extends Player implements Attackable, Castable{

    private MagicalBeingType type;
    private WeaponType weapon;
    private SpellType spell;
    private CreatureType creature;


    public MagicalBeing(MagicalBeingType type, String name, int health, WeaponType weapon, SpellType spell, CreatureType creature) {
        super(name, health);
        this.type = type;
        this.weapon = weapon;
        this.spell = spell;
        this.creature = creature;
    }

    public MagicalBeingType getType() {
        return type;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public CreatureType getCreature() {
        return creature;
    }

    @Override
    public int attack() {
        return this.weapon.getDamage();
    }

    @Override
    public int castSpell() {
        return this.spell.getDamage();
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void setCreature(CreatureType creature) {
        this.creature = creature;
    }
}

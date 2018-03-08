public class Cleric extends Player {

    private HealType heal;

    public Cleric(String name, int health, HealType heal) {
        super(name, health);
        this.heal = heal;
    }

    public void healPlayer(Player player, HealType heal){
        player.setHealth(heal.healPlayer());
    }

    public void setHeal(HealType heal) {
        this.heal = heal;
    }

    public HealType getHeal() {
        return heal;
    }
}

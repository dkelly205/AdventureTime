public class Fighter extends Player {

    private FighterType type;

    public Fighter(FighterType type, String name, int health) {
        super(name, health);
        this.type = type;
    }

    public FighterType getType() {
        return type;
    }
}

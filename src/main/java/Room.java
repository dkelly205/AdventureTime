import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Player> players;
    private ArrayList<Enemy> enemies;


    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int numberOfPlayers() {
        return players.size();
    }

    public int numberOfEnemies(){
        return enemies.size();
    }
}

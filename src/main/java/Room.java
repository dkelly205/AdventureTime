import java.util.ArrayList;

public abstract class Room {

    private String name;
    private int capacity;
    private ArrayList<Player> players;
    private ArrayList<Enemy> enemies;


    public Room(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
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

    public int getCapacity() {
        return capacity;
    }
}

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Player> players;
    private ArrayList<Enemy> enemiess;


    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

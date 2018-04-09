package tag1;

import java.util.ArrayList;

public class Dungeon {

    private ArrayList<Room> rooms = new ArrayList();

    public Dungeon() {
        rooms.add(new Room("room1", true));
        rooms.add(new Room("room2", true));
    }
}

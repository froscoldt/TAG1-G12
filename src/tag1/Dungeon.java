package tag1;

import java.util.ArrayList;

public class Dungeon {

    
    Room room1 = new Room("");
    Room room2 = new Room("");
    Room room3 = new Room("");
    Room room4 = new Room("");
    Room room5 = new Room("");
    Room room6 = new Room("");
    Room room7 = new Room("");
    Room room8 = new Room("");
    Room room9 = new Room("");
    Room room10 = new Room("");
    Room room11 = new Room("");
    Room room12 = new Room("");
    Room room13 = new Room("");
    Room room14 = new Room("");
    Room room15 = new Room("");
    Room room16 = new Room("");
    Room room17 = new Room("");
    Room room18 = new Room("");
    Room room19 = new Room("");
    Room room20 = new Room("");

    public void setNeighbors() {
        // room 1
        room1.setEast(room2);

        // room 2
        room2.setSouth(room4);

        // room 3
        room3.setSouth(room6);

        // room 4
        room4.setSouth(room7);

        // room 5
        room5.setSouth(room9);

        // room 6
        room6.setNorth(room3);
        room6.setSouth(room10);

        // room 7
        room7.setNorth(room4);
        room7.setEast(room8);

        // room 8
        room8.setWest(room7);
        room8.setEast(room9);

        // room 9
        room9.setEast(room10);
        room9.setNorth(room5);
        room9.setWest(room8);
        room9.setSouth(room13);

        // room 10
        room10.setEast(room11);
        room10.setNorth(room6);
        room10.setWest(room9);
        room10.setSouth(room14);

        // room 11
        room11.setWest(room10);
        room11.setSouth(room15);

        // room 12
        room12.setSouth(room16);

        // room 13
        room13.setEast(room14);
        room13.setNorth(room9);
        room13.setSouth(room17);

        // room 14
        room14.setNorth(room10);
        room14.setSouth(room18);
        room14.setWest(room13);

        // room 15
        room15.setNorth(room11);

        // room 16
        room16.setNorth(room12);
        room16.setEast(room17);
        room16.setSouth(room20);

        // room 17
        room17.setNorth(room13);
        room17.setWest(room16);

        // room 18
        room18.setNorth(room14);
        room18.setEast(room19);

        // room 19
        room19.setWest(room18);

        // room 20
        room20.setNorth(room16);
    }
}

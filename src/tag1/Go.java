package tag1;

import java.util.Scanner;

public class Go {

    Scanner sc = new Scanner(System.in);
    private String input;
    Controller dun = new Controller();

    public Go() {
        dun.setNeighbors();
        dun.createPlayer();
        do {
            input = sc.next();

        } while (true);
    }

}

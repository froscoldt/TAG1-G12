
package tag1;
public class Room {
    
    private String name;
    private char[] directions = {'N', 'E', 'S', 'W'};
    private boolean[] access = new boolean[4];
    
    public Room(String name, char direction){
        this.name = name;
    }
    
}

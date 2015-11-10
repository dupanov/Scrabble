/**
 * Created by Вадик on 09.11.2015.
 */
public class Tile {
    char letter;
    int value;

    public Tile(char ch, int val){
        this.letter = ch;
        this.value = val;
    }

    public static void printTile (Tile tile){
        System.out.println("Letter is: " + tile.letter);
        System.out.println("Value is:" + tile.value );

    }

    public static void testTile(){
        Tile tile = new Tile('Z', 10);
        printTile(tile);
    }
}

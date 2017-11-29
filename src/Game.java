import java.util.Scanner;

public class Game{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map map1 = new Map(30, 10);
        Piece player = new Player(3, 4);
        map1.addPiece(player);
        boolean running = true;

        while(running){
            printMap(map1);
            handleInput(input.next(), map1, player);
        }

    }

    public static void printMap(Map m){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(m);

    }

    public static void handleInput(String key, Map m, Piece p){
        switch(key){
            case "w":
                m.movePiece(p, 0, -1);
                break;

            case "s":
                m.movePiece(p, 0, 1);
                break;

            case "a":
                m.movePiece(p, -1, 0);
                break;

            case "d":
                m.movePiece(p, 1, 0);
                break;

            default:
                System.out.println("Invalid input!");
        }
    }
}

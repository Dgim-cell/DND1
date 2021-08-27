package Logic;

import Logic.ConsoleDialog;
import Logic.Game;
import Rooms.Mainback;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
    mainForGame game = new mainForGame();
    game.startGame();
    }




}

class mainForGame implements Mainback{
    Scanner sc = new Scanner(System.in);

    public  void startGame() {
        String[] items = {"Начать игру", "Покинуть этот мир"};
        int r = ConsoleDialog.show(sc, Strings.MAIN_TEXT, items);
        if (r == 1) {
            Game g = new Game(sc, this);
        } else if (r == 2) {
            System.out.println(Strings.EXIT_TEXT);
            System.exit(0);

        }

    }
}



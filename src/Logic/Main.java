package Logic;

import Logic.ConsoleDialog;
import Logic.Game;

import java.util.Scanner;

public class Main {

   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        String[] items = {"Начать игру" , "Покинуть этот мир"};
        int r = ConsoleDialog.show(sc, Strings.MAIN_TEXT,items);
        if (r == 1) {
            Game g = new Game();
        } else if (r == 2) {
            System.out.println(Strings.EXIT_TEXT);
            System.exit(0);

        }
    }
}

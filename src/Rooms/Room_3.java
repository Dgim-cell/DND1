package Rooms;

import Logic.ConsoleDialog;
import Logic.Player;

import javax.xml.namespace.QName;
import java.util.Scanner;

import static Logic.Strings.*;

public class Room_3 extends Room {

    private static final String NAME = "Большой зал!";
    private static final String DESCRIPTION = " " +
            "Вы видите перед собой пять дверей.";
    private boolean takeOar;

    public Room_3() {
        super(3, NAME, DESCRIPTION);
        takeOar = false;
    }

    private void door1(Scanner sc) {
        System.out.println("Вы открыли первую дверь. За ней оказался комната увешанная картинами. Картинами с разными осуждающими лицами. Видимо надо выбрать другую дверь");
        showVariants(sc);
    }
    private void door2(Scanner sc) {
        if(takeOar)
            System.out.println("Вы пришли в тупик");
        else {
            String[] items = {"Взять весло и вернуться", "Вернуться"};
            int r = ConsoleDialog.show(sc, "Вы пришли в тупик брать весло", items);
            switch (r) {
                case 1:
                    takeOar = true;
                    System.out.println("Вы взяли магический предмет " + OAR + ". Клетки пропали");
                    callBack.getPlayer().addThing(OAR);
                    showVariants(sc);
                    break;
                case 2:

                    break;
            }
        }

        showVariants(sc);
    }
    private void door3(Scanner sc) {
        showVariants(sc);
    }
    private void door4(Scanner sc) {
        System.out.println("«Вы открыли четвертую дверь. За ней оказалась комната, на стене которой весела табличка. На ней написано 'Не открывай пятую смерть, этот сюрприз не для тебя'");
        showVariants(sc);
    }
    private void door5(Scanner sc) {
        System.out.println("Вы мертвы");
        Mainback.startGame();
        showVariants(sc);
    }

    @Override
    public void startRoom(Scanner sc) {

        String[] items ={"Открыть инвентарь", "Вернуться ко входу в зал", "Открыть первую дверь", "Открыть вторую дверь", "Открыть третью дверь", "Открыть четвертую дверь", "Открыть пятую дверь"};

        int r = ConsoleDialog.show(sc, NAME +DESCRIPTION, items);
        switch (r) {
            case 1:
                callBack.showThings();
                break;
            case 2:
                callBack.segueToRoom(2);
                break;
            case 3:
                door1(sc);
                break;
            case 4:
            door2(sc);
                break;
            case 5:
            door3(sc);
                break;
            case 6:
            door4(sc);
                break;
            case 7:
            door5(sc);
                break;

        }

    }

    @Override
    public void showVariants(Scanner sc) {

    }
}



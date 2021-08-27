package Rooms;

import Logic.ConsoleDialog;
import Logic.Player;

import java.util.Scanner;

import static Logic.Strings.KEY_BLACK;
import static Logic.Strings.STON_MITSON;

public class Room_2 extends Room{

    private static final String NAME = "Вход в большой зал";
    private static final String DESCRIPTION = "" +
            "Вы зашли в большую комнату, наполненную тусклым светом от горящих факелов весящих на стене. В комнате есть целых пять дверей, но на всех них весят большие и тяжёлые замки. Но вдруг вы видите две клетки, в одной из них лежит ключ, в другой лежит камень. А в низу есть подпись 'Семейный камень Торрето'. Что вы возьмёте?";
    private boolean takeThing;


    public Room_2() {
        super(2, NAME, DESCRIPTION);
        takeThing = false;
    }

    private void takeThing(String name, Scanner sc){
        takeThing = true;
        System.out.println("Вы взяли магический предмет" + name  + ". Клетки пропали");
        callBack.getPlayer().addThing(name);
        showVariants(sc);
    }

    @Override
    public void startRoom(Scanner sc) {

        String[] items;
        if (takeThing)
                 items = new String[]{"Открыть инвентарь" , "Вернуться к двери", "Пройти дальше по залу"};
        else
                 items = new String[]{"Открыть инвентарь", "Вернуться к двери", "Пройти дальше по залу","Взять камень", "Взять ключ"};
        int r = ConsoleDialog.show(sc,NAME + DESCRIPTION,items);
        switch (r){
            case 1:callBack.showThings(); break;
            case 2:callBack.segueToRoom(1); break;
            case 3:callBack.segueToRoom(3); break;
            case 4:takeThing(STON_MITSON, sc);  break;
            case 5:takeThing(KEY_BLACK, sc);  break;

        }

    }



    @Override
    public void showVariants(Scanner sc) {

    }
}


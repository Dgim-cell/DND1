package Rooms;

import Logic.ConsoleDialog;

import java.util.Scanner;

public class Room_1 extends Room {

    private static final String NAME = "Комната с дверью! ";
    private static final String DESCRIPTION = "" +
            "Решив пойти в левую сторону пещеры, вы дошли до большой и тяжёлой двери. Приложив силы, вы смогли приоткрыть дверь. Из за двери показался яркий, слегка тусклый свет. Стоит зайти, или стоит пойти в другую сторону";

    public Room_1() {
        super(1, NAME, DESCRIPTION);
    }

    @Override
    public void startRoom(Scanner sc) {
        String[] items = {"Открыть инвентарь", "Войти в дверь", "Вернуться в комнату пробуждения"};
        int r = ConsoleDialog.show(sc, NAME + DESCRIPTION, items);
        switch (r) {
            case 1:
                callBack.showThings();
                break;
            case 2:
                callBack.segueToRoom(2);
                break;
            case 3:
                callBack.segueToRoom(0);
                break;

        }

    }

    @Override
    public void showVariants(Scanner sc) {

    }
}


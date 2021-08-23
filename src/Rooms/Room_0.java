package Rooms;

import Logic.ConsoleDialog;
import Logic.Game;
import Logic.Strings;

import java.io.Console;
import java.util.Scanner;

public class Room_0 extends Room{

   private static final String NAME = "Комната пробуждения";
   private static final String DESCRIPTION = "«Вы очнулись в пустой и тёмной пещере. Страх начинает переполнять вас. Шарясь по карманам, вы находите зажигалку. Слабое, но тёплое пламя от зажигалки распространяет свет по пещере. Вы начали видеть очертания пещеры. Куда же пойти, на право или на лево? »";


    public Room_0() {
        super(0, NAME, DESCRIPTION);
    }

    @Override
    public void showText(Scanner sc) {
        String[] items = {"Открыть инвентарь" , "Пойти налево", "Пойти направо"};
        int r = ConsoleDialog.show(sc,TRANSITION + NAME,items);
        switch (r){
            case 1:callBack.showThings(); break;
            case 2:callBack.segueToRoom(1); break;
            case 3:callBack.segueToRoom(6); break;
        }

    }
}

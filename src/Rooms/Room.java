package Rooms;

import java.util.Scanner;

abstract public class Room {
    private int id;
    private String name;
    private String description;
    private boolean firstInt;
    public static final String TRANSITION = "Вы перешли в ";
    protected CallBack callBack;

    public Room(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.firstInt = true;
    }

    public void showDescription(){
        System.out.println(description);
        System.out.println();
        this.firstInt = false;
    }


    public void startRoom(Scanner sc) {
        if (this.firstInt)
            showDescription();
        System.out.println(TRANSITION + name);
        showVariants(sc);
    }


    abstract public void showVariants(Scanner sc);

    public void register(CallBack callBack){
        this.callBack = callBack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFirstInt() {
        return firstInt;
    }

    public void setFirstInt(boolean firstInt) {
        this.firstInt = firstInt;
    }
}

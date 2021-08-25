package Logic;

import Rooms.*;

import java.util.Scanner;

public class Game implements CallBack {

    private Player player;
    private Room[] rooms;
    private Scanner sc;
    private boolean is_show_things;

    public Game(Scanner scan){
        rooms = new  Room[]{new Room_0(), new Room_1()};
        for (Room room: rooms)
            room.register(this);
        player = new Player();
        sc = scan;

        STAR_GAME();

    }

    public void STAR_GAME(){
        while (true){
            Room room = rooms[player.getRoom_id()];
            if (is_show_things){
                is_show_things = false;
                room.showVariants(sc);

            }
            else

            room.startRoom(sc);
        }
    }


    @Override
    public void segueToRoom(int id) {
    player.setRoom_id(id);
    }

    @Override
    public void showThings() {
    player.showThing();
    is_show_things = true;
    }
}

package Rooms;

import Logic.Player;

public interface CallBack {
    public void segueToRoom(int id);
    public void showThings();
    public Player getPlayer();

}


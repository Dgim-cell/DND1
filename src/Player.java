import java.util.ArrayList;

public class Player {
    private ArrayList<Thing> things;
    private int room_id;

    public Player (){
        this.room_id = 0;
        this.things = new ArrayList<>();
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public void addThing(String name){
        things.add(new Thing(name));
    }
    public void removeThing(String name){
        things.remove(getThing(name));
    }

    public Thing getThing(String name) {
        for (Thing thing : things) {
            if (thing.equalsString(name))
                return thing;
        }
        return null;
    }
    public void  showThing(){
        System.out.println("Инвентарь");
        for(int i = 0; i < things.size(); i++)
            System.out.println(i + ")" + things.get(i));
        System.out.println();
    }
}

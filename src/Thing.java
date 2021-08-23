public class Thing {
    private String name;

    public Thing (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
    public boolean equalsString (String name){
        return getName().equals(name);
    }
}

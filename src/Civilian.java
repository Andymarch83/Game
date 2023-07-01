import java.util.Random;
public abstract class Civilian extends Units{

    public String type;
    public String name;
    public  int defence = new Random().nextInt(100);
    public static boolean isDangerous;

    private Civilian(String name, int health){
        if (name != null) this.name = name;
        super.setHealth(health);
    }

    public  Civilian(String name){
        this(name, new Random().nextInt(100));

    }

    public String getName() {
        return "Name: " + name;
    }

    public String setType(String type) {
        this.type = type;
        return type;
    }

    public String getType() {
        return "Class: " + type;
    }
    public String getDefence() {
        return "Armor: " + defence;
    }

    public static boolean isACivilian(){
        return new Random().nextBoolean();
    }
}

import java.util.Random;
public class Magician extends Civilian{
    public  int mana = new Random().nextInt(100);

    public Magician(String name) {
        super(name);
        setType("Magician");
    }

    public String getMana() {
        return "Mana: " + mana;
    }
    public String getInfo() {
        String inf = ("|" + getType() + "| " + getName() + "| " + getHealth() + "| " + getMana() + "| " + getDefence() + "|");
        return inf;
    }
}

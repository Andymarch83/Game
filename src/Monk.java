import java.util.Random;
public class Monk extends Civilian{
    public  int faith = new Random().nextInt(100);

    public Monk(String name) {
        super(name);
        setType("Monk");
    }
    public String getFaith() {
        return "Faith: " + faith;
    }
    public String getInfo() {
        String inf = ("|" + getType() + "| " + getName() + "| " + getHealth() + "| " + getFaith() + "| " + getDefence() + "|");
        return inf;
    }
}

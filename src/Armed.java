import java.util.Random;

public class Armed extends Civilian{
    public  int attack = new Random().nextInt(100);
    public Armed(String name) {
        super(name);
    }

    public String getAttack() {
        return "Damage: " + attack;
    }

}

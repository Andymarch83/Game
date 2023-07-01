import java.util.Random;

public abstract class Armed extends Civilian{
    public  int attack = new Random().nextInt(100);
    public Armed(String name) {
        super(name);
    }

    public String getAttack() {
        return "Damage: " + attack;
    }

}

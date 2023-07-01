import java.util.Random;

public abstract class Units {
    private int health = new Random().nextInt(100);

    public int setHealth(int health) {
        return health;

    }

    public String getHealth() {
        return "Health: " + health;
    }
}


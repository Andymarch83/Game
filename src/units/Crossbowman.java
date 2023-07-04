package units;

import java.util.Arrays;

public class Crossbowman extends Shooter {
    public Crossbowman(String name) {
        super(12, 4, 3, new int[]{-1, -3}, name);
    }
    public void fire(){

    }

    @Override
    public void step() {

    }String type = getType("Crossbowman");


    @Override
    public String getInfo() {

        String inf = ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }
}


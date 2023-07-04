package units;

import units.Civilian;

import java.util.Arrays;

public class Peasant extends Civilian {

    public Peasant(String name) {

        super(5, 2, 1, new int[]{-1, -5}, name);
    }



    @Override
    public void step() {

    }
    String type = getType("Peasant");

    @Override
    public String getInfo() {

        String inf = ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }
}

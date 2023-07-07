package units;

import java.util.Arrays;
import java.util.Random;

public class Peasant extends Civilian {

    public Peasant() {

        super(5, 2, 1, new int[]{-1, -5});
    }



    @Override
    public void step() {

    }
    String type = getType("Peasant");
    String name = this.getName();

    @Override
    public String getInfo() {

        String inf = ("Class: " + type + " | " + "units.Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }

    @Override
    public String getName() {
        String s = String.valueOf(units.Name.values()[new Random().nextInt(units.Name.values().length)]);
        return s;
    }
}

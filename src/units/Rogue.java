package units;

import java.util.Arrays;

public class Rogue extends Spearman {


    public Rogue() {
        super();
    }

    @Override
    public void step() {

    }
    String type = getType("Rogue");

    @Override
    public String getInfo() {
        String inf = ("Class: " + type + " | " + "units.Name :" + name + " | "
            + "Health: " + maxHp + " | " + "Attack: "
            + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }
}


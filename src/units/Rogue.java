package units;

import units.Armed;

import java.util.Arrays;

public class Rogue extends Spearman {


    public Rogue( String name) {
        super(name);
    }

    @Override
    public void step() {

    }
    String type = getType("Rogue");

    @Override
    public String getInfo() {
        String inf = ("Class: " + type + " | " + "Name :" + name + " | "
            + "Health: " + maxHp + " | " + "Attack: "
            + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }
}


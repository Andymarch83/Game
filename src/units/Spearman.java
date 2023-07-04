package units;

import units.Rogue;

import java.util.Arrays;

public class Spearman extends Armed {


    public Spearman(String name) {
        super(15, 7, 10, new int[]{-1, -5}, name);
    }

    @Override
    public void step() {

    }
    String type = getType("Spearman");

    @Override
    public String getInfo() {

        String inf = ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }
}

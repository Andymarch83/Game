package units;

import units.Civilian;

import java.util.Arrays;
import java.util.Random;
public class Magician extends Monk {

    public Magician(String name)
    {
        super(name);
    }

    @Override
    public void step() {

    }String type = getType("Magician");


    @Override
    public String getInfo() {

        String inf = ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }
}


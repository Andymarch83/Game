package units;

import java.util.Arrays;

public class Sniper extends Crossbowman {


    public Sniper(String name) {
        super(name);
    }
    String type = getType("Sniper");



    @Override
    public String getInfo() {

        String inf = ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }

}

package units;

import java.util.ArrayList;
import java.util.Arrays;

public class Rogue extends Spearman {


    public Rogue(int x, int y) {
        super(x, y);
    }

     String type = getType("Rogue");

    @Override
    public String getInfo() {
        String inf = ("Class: " + type + " | " + "units.Name :" + name + " | "
            + "Health: " + maxHp + " | " + "Attack: "
            + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }
    @Override
    public void step(ArrayList<Units> units) {
        Units tmp = nearest(units);
        System.out.println(type + " " +  tmp.getName() + " dist " + coordinates.finedDistance(tmp.coordinates));
    }
}


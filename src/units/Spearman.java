package units;

import java.util.ArrayList;
import java.util.Arrays;

public class Spearman extends Armed {


    public Spearman(int x, int y) {
        super(15, 7, 10, new int[]{-1, -5}, name,x, y);
    }


    String type = getType("Spearman");

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
        System.out.println(type + " " + tmp.getName() + " dist " + coordinates.finedDistance(tmp.coordinates));
    }
}

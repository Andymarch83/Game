package units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Crossbowman extends Shooter {
    public Crossbowman(int x, int y) {

        super(12, 4, 3, new int[]{-1, -3}, x, y);
    }
    public void fire(){

    }

    String type = getType("Crossbowman");
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

    @Override
    public void step(ArrayList<Units> units) {
        Units tmp = nearest(units);
        System.out.println(type + " " + tmp.getName() + " dist " + coordinates.finedDistance(tmp.coordinates));
    }

}


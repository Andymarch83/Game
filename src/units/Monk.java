package units;

import java.util.Arrays;
import java.util.Random;

public class Monk extends Civilian {
    public int mana = 10;

    public Monk() {
        super(12, 4, 3, new int[]{-1, -3});
    }
    public  void  castMana(){}



    @Override
    public void step() {

    }
    String type = getType("Monk");
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



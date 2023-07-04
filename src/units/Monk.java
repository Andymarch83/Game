package units;

import java.util.Arrays;

public class Monk extends Civilian {
    public int mana = 10;

    public Monk(String name) {
        super(12, 4, 3, new int[]{-1, -3}, name);
    }
    public  void  castMana(){}



    @Override
    public void step() {

    }
    String type = getType("Monk");


    @Override
    public String getInfo() {

        String inf = ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + Arrays.toString(damage) + " |");
        return inf;
    }



}



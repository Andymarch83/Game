package units;

import java.util.ArrayList;

public class Magician extends Monk {

    public Magician(int x, int y)
    {
        super(x, y);
    }

    String type = getType("Magician");
    String name = this.getName();
    int cure = 2;


    @Override
    public String getInfo() {

        return ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + damage + " |");
    }

    @Override
    public void step(ArrayList<Units> team1, ArrayList<Units> team2) {
        Units tmp = nearest(team1);
        System.out.println(type + " " + tmp.getName() + " dist " + coordinates.finedDistance(tmp.coordinates));
    }
}


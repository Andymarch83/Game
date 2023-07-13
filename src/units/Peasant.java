package units;

import java.util.ArrayList;

public class Peasant extends Civilian {

    public Peasant(int x, int y) {

        super(5, 2, 1, -5, x, y);
    }

      String type = getType("Peasant");
    String name = this.getName();

    @Override
    public String getInfo() {

        return ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + damage + " |");
    }

    @Override
    public void step(ArrayList<Units> team1, ArrayList<Units> team2) {
        Units tmp = nearest(team1);
        System.out.println(type + " " +  tmp.getName() + " dist " + coordinates.finedDistance(tmp.coordinates));
    }

}

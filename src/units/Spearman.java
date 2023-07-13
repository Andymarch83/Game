package units;

import java.util.ArrayList;

public class Spearman extends Armed {


    public Spearman(int x, int y) {

        super(12, 4, 3, -3, x, y);
    }



    String type = getType("Spearman");
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
        System.out.println(type + " " + tmp.getName() + " dist " + coordinates.finedDistance(tmp.coordinates));
    }
}

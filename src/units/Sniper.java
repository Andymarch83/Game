package units;

import java.util.ArrayList;

public class Sniper extends Crossbowman {


    public Sniper(int x, int y) {
        super(x, y);
    }
    int shots = 5;
    String type = getType("Sniper");
    String name = this.getName();



    @Override
    public String getInfo() {

        return ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + damage + " |");
    }



    @Override
    public int stockOfShots(int shots) {
        return super.stockOfShots(shots);
    }

    @Override
    public void step(ArrayList<Units> team1, ArrayList<Units> team2) {
        if (this.maxHp == 0 || shots == 0) {
            return;}
        Units tmp = nearest(team1);
        System.out.println(type + " " + tmp.getName() + " dist " + coordinates.finedDistance(tmp.coordinates));
    }
}

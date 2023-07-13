package units;

import java.util.ArrayList;

public class Monk extends Civilian {
    public int mana = 10;

    public Monk(int x, int y) {
        super(12, 4, 3, -3, x, y);
    }
    public  void  castMana(){}




    String type = getType("Monk");
    String name = this.getName();
    int cure = 2;

    public void getCure(int cure){
        if (this.curHp != 0 && this.curHp + cure < maxHp) {
            this.curHp += cure;
        }
        else {
            if (this.curHp == 0) {
                this.curHp = 0;
            } else {
                this.curHp = maxHp;
            }
        }
    }

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



package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Civilian extends Units {
    protected int mana, magicDamage, attackRange, actionPriority;
    public Civilian(int x, int y, int initiative, int mana, int magicDamage, int attackRange, int actionPriority, boolean b, String name) {
        super(x, y, 70, 70, 5, 1, initiative, true, name);
        this.mana = mana;
        this.magicDamage = magicDamage;
        this.attackRange = attackRange;
        this.actionPriority = actionPriority;
        this.name = getName();
    }
//    public static String getName(){
//        return String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
//    }


    @Override
    public String getInfo() {
        return super.getInfo() + this.mana;
    }


    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        if (!isAlive) {
            state = "Dead";
            return ;
        }
        Units tmp = nearest(civ);
        if ((int) coordinates.finedDistance(tmp.coordinates) <= attackRange) {
            if (mana > 0) {
                tmp.getDamage((damage));
                mana -= 1;
                state = "Attack";
            } else {
                mana += 1;
                state = "Busy";
            }
        } else {
            move(tmp.coordinates, mag);
            state = "Moving";
        }
    }
}

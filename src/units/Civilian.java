package units;

import java.util.ArrayList;

public abstract class Civilian extends Units {
    protected int mana, magicDamage, attackRange, actionPriority;
    public Civilian(int x, int y, int initiative, int mana, int magicDamage, int attackRange, int actionPriority, boolean b) {
        super(x, y, 70, 70, 5, 1, initiative, true);
        this.mana = mana;
        this.magicDamage = magicDamage;
        this.attackRange = attackRange;
        this.actionPriority = actionPriority;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
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

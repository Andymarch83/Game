package units;

import java.util.ArrayList;

public abstract class Armed extends Civilian {
    protected int attacksAmount, attackRange;
    public Armed(int x, int y, int initiative, int damage, int moveDistance, int attacksAmount, int attackRange) {
        super(x, y, 100, 100, damage, moveDistance, initiative, true);
        this.attacksAmount = attacksAmount;
        this.attackRange = attackRange;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        if (!isAlive) return;

        Units tmp = nearest(civ);

        if (coordinates.finedDistance(tmp.coordinates) <= attackRange) {
            for (int i = 0; i < attacksAmount; i++) {
                tmp.getDamage(damage);
            }
            state = "Attack";
        } else {
            move(tmp.coordinates, mag);
            state = "Moving";
        }
    }

}

package units;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Armed extends Units {
    protected int attacksAmount, attackRange;
    public Armed(int x, int y, int initiative, int damage, int moveDistance, int attacksAmount, int attackRange, String name) {
        super(x, y, 100, 100, damage, moveDistance, initiative, true, name);
        this.attacksAmount = attacksAmount;
        this.attackRange = attackRange;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }


    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        if (!isAlive) {
            state = "Dead";
            return ;
        }

        Units tmp = nearest(civ);

        if (coordinates.finedDistance(tmp.coordinates) <= attackRange) {
            for (int i = 0; i < attacksAmount; i++) {
                tmp.getDamage(damage);
            }
            state = "Attack";
            System.out.println(getInfo() + " " + tmp.getInfo() + " distance " +
                    (int) coordinates.finedDistance(tmp.coordinates));
        } else {
            move(tmp.coordinates, mag);
            state = "Moving";
            System.out.println(getInfo() + " " + tmp.getInfo() + " distance " +
                    (int) coordinates.finedDistance(tmp.coordinates));
        }

    }


}

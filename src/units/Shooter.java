package units;

import java.util.ArrayList;

public abstract class Shooter extends Civilian {protected int arrows, attackRange, timeToLoad;

    public Shooter(int x, int y, int initiative, int attackRange, int arrows, int timeToLoad) {
        super(x, y, 50, 50, 5, 1, initiative, true);
        this.attackRange = attackRange;
        this.arrows = arrows;
        this.timeToLoad = timeToLoad;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        Units tmp = nearest(civ);

        if (isAlive) {
            for (Units unit: civ) {
                if (unit instanceof Peasant && unit.state == "Stand" && arrows < 20 && this instanceof Sniper) {
                    arrows += 1;
                    unit.state = "Busy";
                    return;
                }
            }

            if ((int) coordinates.finedDistance(tmp.coordinates) <= attackRange) {
                if (arrows > 0 && attackRange != 1) {
                    if (attackRange == 1) tmp.getDamage(1);
                    else tmp.getDamage(damage);
                    arrows -= 1;
                    state = "Attack";
                    return;
                } else {
                    attackRange = 1;
                    state = "->Melee";
                }
            } else {
                move(tmp.coordinates, civ);
                state = "Moving";
                return;
            }
        }
        return;
    }


}





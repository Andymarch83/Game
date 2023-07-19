package units;

import java.util.ArrayList;

public abstract class Shooter extends Civilian {protected int shots, attackRange, timeToLoad;

    public Shooter(int x, int y, int initiative, int attackRange, int shots, int timeToLoad, String name) {
        super(x, y, 50, 50, 5, 1, initiative, true, name);
        this.attackRange = attackRange;
        this.shots = shots;
        this.timeToLoad = timeToLoad;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + shots;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {

        if (!isAlive) {
            state = "Dead";
            return ;
        }
        Units tmp = nearest(civ);

        if (isAlive) {
            for (Units unit : civ) {
                if (unit instanceof Peasant && unit.state == "Stand" && shots < 20 && this instanceof Sniper) {
                    shots += 1;
                    unit.state = " Busy ";
                    System.out.println(getInfo() + " get arrows from: " + unit.getInfo() + " distance " +
                            (int) coordinates.finedDistance(unit.coordinates));
                    return;
                }
            }

            if ((int) coordinates.finedDistance(tmp.coordinates) <= attackRange) {
                if (shots > 0 && attackRange != 1) {
                    if (attackRange == 1) tmp.getDamage(1);
                    else tmp.getDamage(damage);
                    shots -= 1;
                    state = " Attack ";
                    System.out.println(getInfo() + "Attacking " + tmp.getInfo() + " distance " +
                            (int) coordinates.finedDistance(tmp.coordinates));
                } else {
                    attackRange = 1;
                    state = " ->Melee ";
                    System.out.println(getInfo() + " " + state + " " + tmp.getInfo() + " distance " +
                            (int) coordinates.finedDistance(tmp.coordinates));
                }
            } else {
                move(tmp.coordinates, civ);
                state = " Moving ";
                System.out.println(getInfo() + " " + state + " " + tmp.getInfo() + " distance " +
                        (int) coordinates.finedDistance(tmp.coordinates));
            }
        }
    }




}





package units;

import java.util.ArrayList;

public abstract class Shooter extends Armed {

    public Shooter(float maxHp, int att, int def, int[] damage, int x, int y) {
        super(maxHp, att, def, damage, name, x, y);
    }
    public int attackDistance;

    public int setDistance(int attackDistance) {
        this.attackDistance = attackDistance;
        return attackDistance;
    }

    public String getDistance() {
        return "Distance: " + attackDistance;
    }

    @Override
    public void step(ArrayList<Units> units) {

    }
}

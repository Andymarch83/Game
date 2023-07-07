package units;

public abstract class Shooter extends Armed {

    public Shooter(float maxHp, int att, int def, int[] damage) {
        super(maxHp, att, def, damage, name);
    }
    public int attackDistance;

    public int setDistance(int attackDistance) {
        this.attackDistance = attackDistance;
        return attackDistance;
    }

    public String getDistance() {
        return "Distance: " + attackDistance;
    }
}

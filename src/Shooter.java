public abstract class Shooter extends Armed{
    public int attackDistance;
    public Shooter(String name) {
        super(name);
    }
    public int setDistance(int attackDistance) {
        this.attackDistance = attackDistance;
        return attackDistance;
    }
    public String getDistance() {
        return "Distance: " + attackDistance;
    }
}

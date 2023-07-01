public class Crossbowman extends Shooter{
    public Crossbowman(String name) {
        super(name);
        setType("Crossbowman");
        setDistance(10);
    }
    public String getInfo() {
        String inf = ("|" + getType() + "| " + getName() + "| " + getHealth() + "| " + getDistance() + "| " + getAttack() + "| " + getDefence() + "|");
        return inf;
    }
}

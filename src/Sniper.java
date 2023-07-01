public class Sniper extends Crossbowman {
    public Sniper(String name) {
        super(name);
        setType("Sniper");
        setDistance(100);
    }
    public String getInfo() {
        String inf = ("|" + getType() + "| " + getName() + "| " + getHealth() + "| " + getDistance() + "| "
                + getAttack() + "| " + getDefence() + "|");
        return inf;
    }
}

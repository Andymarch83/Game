public class Peasant extends Civilian{
    public Peasant(String name) {
        super(name);
        setType("Peasant");
    }
    public String getInfo() {
        String inf = ("|" + getType() + "| " + getName() + "| " + getHealth() + "| " + getDefence() + "|");
        return inf;
    }
}

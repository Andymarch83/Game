public class Spearman extends Rogue{
    public Spearman(String name) {
        super(name);
        setType("Spearman");
    }
    public String getInfo() {
        String inf = ("|" + getType() + "| " + getName() + "| " + getHealth() + "| " + getAttack() + "| " + getDefence() + "|");
        return inf;
    }
}

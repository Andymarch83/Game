public class Rogue extends Armed{
    public Rogue(String name) {
        super(name);
        setType("Rouge");

    }
    public String getInfo(){
        String inf = ("|" + getType() + "| " + getName() + "| " + getHealth() + "| " + getAttack() + "| " + getDefence() + "|");
        return inf;

    }
}

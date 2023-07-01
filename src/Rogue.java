public class Rogue extends Armed{
    public int steal;
    public Rogue(String name) {
        super(name);
        setType("Rouge");

    }
    public String stealHealth(int steal){
        this.setHealth(Integer.parseInt(getHealth() + steal));
        return getHealth();
    }
    public String getInfo(){
        String inf = ("|" + getType() + "| " + getName() + "| " + getHealth() + "| " + getAttack() + "| " + getDefence() + "|");
        return inf;

    }
}

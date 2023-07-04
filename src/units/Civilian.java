package units;

public abstract class Civilian extends Units {

    public String type;

    public Civilian(float maxHp, int att, int def, int[] damage, String name) {
        super(maxHp, att, def, damage, name);
    }
    @Override
    public void getDamage(float damage) {
        curHp -= damage;
        if (curHp >= maxHp) curHp=maxHp;
    }



    public String getType(String type) {
        return type;
    }
}

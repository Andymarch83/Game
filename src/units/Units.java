package units;

import java.util.Random;

public abstract class Units implements InGameInterface{
    protected float maxHp, curHp;
    protected int att, def;
    protected int[] damage;
    protected static String name;


    public Units(float maxHp, int att, int def, int[] damage, String name) {
        this.maxHp = this.curHp = maxHp;
        this.att = att;
        this.def = def;
        this.damage = damage;
        this.name = getName();
            }
    public void getDamage(float damage){
        curHp -= damage;
    }

    public String getName(){
        String s = String.valueOf(units.Name.values()[new Random().nextInt(units.Name.values().length)]);
        return s;
    }


}

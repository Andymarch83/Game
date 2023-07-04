package units;

public abstract class Units implements InGameInterface{
    protected float maxHp, curHp;
    protected int att, def;
    protected int[] damage;
    protected String name;


    public Units(float maxHp, int att, int def, int[] damage, String name) {
        this.maxHp = this.curHp = maxHp;
        this.att = att;
        this.def = def;
        this.damage = damage;
        this.name = name;
            }
    public void getDamage(float damage){
        curHp -= damage;
    }


}

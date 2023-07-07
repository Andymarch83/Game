package units;

public abstract class Armed extends Civilian {


    public Armed(float maxHp, int att, int def, int[] damage, String name) {
        super(maxHp, att, def, damage);
    }

}

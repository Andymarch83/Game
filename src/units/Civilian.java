package units;

import java.util.ArrayList;

public abstract class Civilian extends Units {



    public Civilian(float maxHp, int att, int def, int damage, int x, int y) {
        super(maxHp, att, def, damage, name, x, y);
    }
    @Override
    public void getDamage(float damage) {
        curHp -= damage;
        if (curHp >= maxHp) curHp=maxHp;
    }
    String type;



    public String getType(String type) {
        return type;
    }


}

package units;

import java.util.ArrayList;
import java.util.Objects;

public class Monk extends Civilian {
    public int mana = 10;
    public String klas = "Monk";

    public Monk(int x, int y, int initiative, int actionPriority, String name) {
        super(x, y, initiative + 2, 10, 5, 2, actionPriority, true, name);
    }

    @Override
    public String getInfo() {
        return this.klas + " " + this.name + "  [" + coordinates.x + ", " + coordinates.y + "] mana: " + mana + "/" + 10 + " HP: " + hp + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        super.step(civ, mag);

        Units tmpAlly = mag.get(0);
        double minAllyHealth = 1;

        for (Units unit: mag) {
            if ((double) unit.hp / unit.max_hp < minAllyHealth && unit.isAlive) {
                minAllyHealth = (double) unit.hp / unit.max_hp;
                tmpAlly = unit;
            }
        }
        if (minAllyHealth < 1 && mana > 0) {
            tmpAlly.getDamage(-damage);
            mana -= 1;
            state = "Healing";

            return;
        }

//            if (isAlive) {
//                if (Objects.equals(state, "Busy")) {
//                    state = "Stand";
//                }
//            }

    }
}



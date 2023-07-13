package units;

import java.util.ArrayList;

public class Monk extends Civilian {
    public int mana = 10;

    public Monk(int x, int y, int initiative, int actionPriority) {
        super(x, y, initiative + 2, 10, 5, 2, actionPriority, true);
    }

    @Override
    public String getInfo() {
        return "Monk [" + coordinates.x + ", " + coordinates.y + "] mana: " + mana + "/" + 10 + " HP: " + hp + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        super.step(civ, mag);
        Units tmpAlly = mag.get(0);
        double minAllyHealth = 1;

        if (!isAlive) return;

        for (Units units: mag) {
            if (units.hp / units.max_hp < minAllyHealth && units.isAlive) {
                minAllyHealth = units.hp / units.max_hp;
                tmpAlly = units;
            }
        }
        if (minAllyHealth < 1 && mana > 0) {
            tmpAlly.getDamage(-damage);
            mana -= 1;
            state = "Healing";

            return;
        }
    }
}



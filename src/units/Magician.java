package units;

import java.util.ArrayList;
import java.util.Random;

public class Magician extends Civilian {

    public Magician(int x, int y, int initiative, int actionPriority) {
        super(x ,y, initiative + 2, 100, 10, 3, actionPriority, true);
    }

    @Override
    public String getInfo() {
        return "Magician [" + coordinates.x + ", " + coordinates.y + "] mana: " + mana + "/" + 10 + " HP: " + hp + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        super.step(civ, mag);
        ArrayList<Units> deadTeammates = new ArrayList<>();
        Units tmpAlly = mag.get(0);

        if (!isAlive) return;

        for (Units units: mag) {
            if (!units.isAlive) {
                deadTeammates.add(units);
            }
        }
        if (deadTeammates.size() > mag.size() / 2 - 1 && mana >= 5) {
            int rand = new Random().nextInt(deadTeammates.size() - 1);

            deadTeammates.get(rand).isAlive = true;
            deadTeammates.get(rand).hp = deadTeammates.get(rand).max_hp / 2;
            tmpAlly.state = "Revived";
            state = "Revive";
            mana = 0;
            return;
        }
    }

}


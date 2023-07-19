package units;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Magician extends Civilian {
    public String klas = "Magician";

    public Magician(int x, int y, int initiative, int actionPriority, String name) {
        super(x ,y, initiative + 2, 100, 10, 3, actionPriority, true, name);
    }

    @Override
    public String getInfo() {
        return this.klas + " " + this.name + " [" + coordinates.x + ", " + coordinates.y + "] mana: " + mana + "/" + 100 + " HP: " + hp + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        super.step(civ, mag);
        ArrayList<Units> deadTeammates = new ArrayList<>();
        Units tmpAlly = mag.get(0);

        if (!isAlive)  {
            state = "Dead";
            return ;}

        for (Units unit: mag) {
            if (!unit.isAlive) {
                deadTeammates.add(unit);
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


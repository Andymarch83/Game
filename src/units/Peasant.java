package units;

import java.util.ArrayList;

public class Peasant extends Civilian {

    public Peasant(int x, int y, int initiative, int actionPriority) {
        super(x, y, initiative, 0, 0, 1, actionPriority, true);
    }

    @Override
    public String getInfo() {
        return "Peasant [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        if (isAlive) {
            if (state == "Busy") {
                state = "Stand";
            }
        }
    }


}

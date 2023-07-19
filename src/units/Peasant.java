package units;

import java.util.ArrayList;
import java.util.Objects;

public class Peasant extends Civilian {

    public Peasant(int x, int y, int initiative, int actionPriority, String name) {
        super(x, y, initiative, 0, 0, 1, actionPriority, true, name);
        this.name=getName();

    }

    @Override
    public String getInfo() {
        return "Peasant " + this.name + " [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        if (isAlive) {
            if (Objects.equals(state, "Busy")) {
                state = "Stand";
            }
        }
    }


}

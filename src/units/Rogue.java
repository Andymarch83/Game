package units;

import java.util.ArrayList;

public class Rogue extends Armed {


    public Rogue(int x, int y, int initiative, String name) {
        super (x, y, initiative + 4, 5, 2, 2, 1, name);

    }

    @Override
    public String getInfo() {
        return "Rogue " + this.name + " [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state + " ";
    }
}


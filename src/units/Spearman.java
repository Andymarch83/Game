package units;

import java.util.ArrayList;

public class Spearman extends Armed {


    public Spearman(int x, int y, int initiative, String name) {
        super(x, y, initiative + 4, 10, 1, 1, 2, name);
    }

    @Override
    public String getInfo() {
        return "Spearman " + this.name + " [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state + " ";
    }
}

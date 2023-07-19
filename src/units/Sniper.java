package units;

import java.util.ArrayList;
import java.util.Random;

public class Sniper extends Shooter {


    public Sniper(int x, int y, int initiative, String name) {
        super(x, y, initiative + 3, 7, 100, 1, name);
        this.name=getName();
    }

    @Override
    public String getInfo() {
        return "Sniper"  + " " + this.name + "[" + coordinates.x + ", " + coordinates.y + "] shots: " +
                shots + "  HP: " + hp + "/" + max_hp + " " + state + " ";
    }


}

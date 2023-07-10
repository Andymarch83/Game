package units;

import java.util.ArrayList;

public interface InGameInterface {

    String getInfo();

    void step(ArrayList<Units> units);
}

package units;

import java.util.ArrayList;

public interface InGameInterface {

    String getInfo();

    void step(ArrayList<Units> team1, ArrayList<Units> team2);
}

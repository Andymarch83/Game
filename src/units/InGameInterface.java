package units;

import java.util.ArrayList;

public interface InGameInterface {



    void step(ArrayList<Units> team1, ArrayList<Units> team2);
    String getInfo();
}

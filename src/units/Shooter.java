package units;

import java.util.ArrayList;

public abstract class Shooter extends Armed {

    public Shooter(float maxHp, int att, int def, int damage, int x, int y) {
        super(maxHp, att, def, damage, x, y);
    }
    public int shots;
    String type;
    public int stockOfShots(int shots) {
        return shots -= 1;
    }
    public int attackDistance;


    public int setDistance(int attackDistance) {
        this.attackDistance = attackDistance;
        return attackDistance;
    }

    public String getDistance() {
        return "Distance: " + attackDistance;
    }

    @Override
    public void step(ArrayList<Units> team1, ArrayList<Units> team2) {
        Units tmp = nearest(team1);
        if (isAlive){
            if ((int)coordinates.finedDistance(tmp.coordinates) <= attackDistance){
                if(shots > 0){
                    tmp.getDamage(damage);
                    shots--;

                    System.out.println(getInfo() + "attacking" + tmp.getInfo() +
                            "distance: " + (int)coordinates.finedDistance(tmp.coordinates) +
                            "current enemy health: " + tmp.curHp);
                } else {
                    System.out.println(getInfo() + "attacking" + tmp.getInfo() +
                            "distance: " + (int)coordinates.finedDistance(tmp.coordinates) + "no shots");}
            }else {
                System.out.println(getInfo() + "moving to" + tmp.getInfo() +
                        "distance: " + (int) coordinates.finedDistance(tmp.coordinates));
               // move(tmp.coordinates);
                System.out.println(" new position [" + coordinates.x + ", " + coordinates.y + "]");
            }
        }
        if (this.maxHp == 0 || shots == 0) {
            return;
        }
//        Units tmp = nearest(team1);
//        if (team2.contains(Peasant.class)) {
//            return;
//        }
//        shots--;
    }



}

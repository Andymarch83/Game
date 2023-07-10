package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Units implements InGameInterface{
    protected float maxHp, curHp;
    protected int att, def;
    protected int[] damage;
    protected static String name;
    Coordinates coordinates;


    public Units(float maxHp, int att, int def, int[] damage, String name, int x, int y) {
        this.maxHp = this.curHp = maxHp;
        this.att = att;
        this.def = def;
        this.damage = damage;
        this.name = getName();
        coordinates = new Coordinates(x, y);
            }
    public void getDamage(float damage){
        curHp -= damage;
    }

    public String getName(){
        String s = String.valueOf(units.Name.values()[new Random().nextInt(units.Name.values().length)]);
        return s;
    }

    public Units nearest(ArrayList<Units> units){
        double nearestDistance = Double.MAX_VALUE;
        Units nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if (coordinates.finedDistance(units.get(i).coordinates) < nearestDistance) {
                nearestEnemy = units.get(i);
                nearestDistance = coordinates.finedDistance(units.get(i).coordinates);
            }
        }
        return nearestEnemy;
    }




}

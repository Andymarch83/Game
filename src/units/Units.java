package units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Units implements InGameInterface{
    public int initiative = new Random().nextInt(21);
    protected float maxHp, curHp;
    protected int att, def;
    protected int damage;
    protected static String name;
    Coordinates coordinates;


    public Units(float maxHp, int att, int def, int damage, String name, int x, int y) {
        this.maxHp = this.curHp = maxHp;
        this.att = att;
        this.def = def;
        this.damage = damage;
        this.name = getName();
        coordinates = new Coordinates(x, y);
            }
    String type;
    public boolean isAlive;
    public String state = "Stand";
    public void getDamage(float damage){
        if (this.curHp>damage){
        curHp -= damage;}
        else {
            this.curHp = 0;
        }

    }
//    public void doAttack(Units target) {
//        float damage = (float) (this.damage[0] - this.damage[1]) / 2;
//        target.getDamage(damage);
//    }

    public String getName(){
        return String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
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
    public String getInfo() {

        return ("Class: " + type + " | " + "Name :" + name + " | "
                + "Health: " + maxHp + " | " + "Attack: "
                + att + " | " + "Defence: " + def + " | " + "Damage: " + damage + " |");
    }




}

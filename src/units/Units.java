package units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Units implements InGameInterface {
    protected String name;;
    public int initiative = new Random().nextInt(21);
    public int damage, hp, max_hp, moveDistance;;
    public boolean isAlive;
    public String state;
    Coordinates coordinates;


    public Units(int x, int y, int hp, int max_hp, int damage, int moveDistance, int initiative, boolean isAlive, String name) {
        this.damage = damage;
        this.hp = hp;
        this.max_hp = max_hp;
        this.state = "Stand";
        coordinates = new Coordinates(x, y);
        this.initiative = initiative;
        this.isAlive = isAlive;
        this.moveDistance = moveDistance;
        this.name = getName();
    }

    public ArrayList<Integer> getCoords() {
        return coordinates.xy;
    }

    public void move(Coordinates targetPosition, ArrayList<Units> mag) {
        if (!coordinates.containsByPos(coordinates.newPosition(targetPosition, mag), mag)) {
            for (int i = 0; i < moveDistance; i++) {
                coordinates = coordinates.newPosition(targetPosition, mag);
            }
        }
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }


    public Units nearest(ArrayList<Units> units) {
        double minDistance = Double.MAX_VALUE;
        Units nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if (coordinates.finedDistance(units.get(i).coordinates) < minDistance && units.get(i).isAlive) {
                nearestEnemy = units.get(i);
                minDistance = coordinates.finedDistance(units.get(i).coordinates);
            }
        }
        return nearestEnemy;
    }

    public void getDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
            isAlive = false;
            state = "Dead";
        }
        if (hp > max_hp) hp = max_hp;
    }
    public static String getName(){
        return String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
    }


    @Override
    public String getInfo() {
        return ("Name: " + name + "Class: ");
    }

}

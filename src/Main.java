/*
Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному
экземпляру каждого класса.
 */

import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Units> list = new ArrayList<>();
        list.add(new Magician(getName()));
        list.add(new Monk(getName()));
        list.add(new Rogue(getName()));
        list.add(new Spearman(getName()));
        list.add(new Sniper(getName()));
        list.add(new Crossbowman(getName()));
        list.add(new Peasant(getName()));
        list.add(new Monk(getName()));
        list.add(new Rogue(getName()));
        list.add(new Magician(getName()));

        ArrayList<Units> list1 = new ArrayList<>();
        list1.add(new Magician(getName()));
        list1.add(new Monk(getName()));
        list1.add(new Rogue(getName()));
        list1.add(new Spearman(getName()));
        list1.add(new Sniper(getName()));
        list1.add(new Crossbowman(getName()));
        list1.add(new Peasant(getName()));
        list1.add(new Monk(getName()));
        list1.add(new Rogue(getName()));
        list1.add(new Magician(getName()));

//      if (list.get(0) instanceof Crossbowman) ((Crossbowman)list.get(0)).fire();
//      if (list.get(0) instanceof Monk) ((Monk)list.get(0)).castMana();
        System.out.println("____________________________________________________________________________________________________");

        list.forEach(n-> System.out.println(n.getInfo()));
        System.out.println("____________________________________________________________________________________________________");
        list1.forEach(n-> System.out.println(n.getInfo()));
        System.out.println("____________________________________________________________________________________________________");


    }
        private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
        }
}
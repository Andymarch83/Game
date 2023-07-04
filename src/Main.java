/*
Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному
экземпляру каждого класса.
 */

/*
Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа.
Создать два списка в классе main. В каждый из списков добавить по десять случайных экземнляров
наследников BaseHero. Удалить ненужные методы из абстрактного класса, если такие есть.
В main пройти по спискам и вызвать у всех персонажей getInfo.
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
        System.out.println("______________________________________Список 2___________________________________________");
        list1.forEach(n-> System.out.println(n.getInfo()));
        System.out.println("____________________________________________________________________________________________________");


    }
        private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
        }
}
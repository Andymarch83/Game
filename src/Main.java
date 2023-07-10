/*
Задание 1!
Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному
экземпляру каждого класса.
 */

/*
Задание 2!
Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа.
Создать два списка в классе main. В каждый из списков добавить по десять случайных экземнляров
наследников BaseHero. Удалить ненужные методы из абстрактного класса, если такие есть.
В main пройти по спискам и вызвать у всех персонажей getInfo.
 */

/*
Задание 3! Некоторые стандартные интерфейсы Java и примеры их использования
Создать класс с описанием координат, x и y.
Добавить в абстрактный класс поле с координатами и пробросить его инициализацию до конструкторов персонажей.
Farmer farmer = new Farmer(getName(), x, y);
Найти среди противников ближайшего и вывести расстояние до него и его имя в консоль.
 */

import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Units> list = new ArrayList<>();
//        list.add(new Magician(getName()));
//        list.add(new Monk(getName()));
//        list.add(new Rogue(getName()));
//        list.add(new Spearman(getName()));
//        list.add(new Sniper(getName()));
//        list.add(new Crossbowman(getName()));
//        list.add(new Peasant(getName()));
//        list.add(new Monk(getName()));
//        list.add(new Rogue(getName()));
//        list.add(new Magician(getName()));

    ArrayList<Units> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int per = new Random().nextInt(4);
            switch (per) {
                case 0 -> list1.add(new Monk(2, per+1));
                case 1 -> list1.add(new Rogue(4, per+1));
                case 2 -> list1.add(new Sniper(2, per+1));
                case 3 -> list1.add(new Peasant(0,per+1));
            }
        }
//            System.out.println(list1);
//      if (list.get(0) instanceof Crossbowman) ((Crossbowman)list.get(0)).fire();
//      if (list.get(0) instanceof Monk) ((Monk)list.get(0)).castMana();
    System.out.println("_____________________________________TEAM 1______________________________________________________");

    list1.forEach(n -> System.out.println(n.getInfo()));
    System.out.println("______________________________________TEAM 2___________________________________________");

    ArrayList<Units> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int per = new Random().nextInt(4);
            switch (per) {
                case 0 -> list2.add(new Magician(8,per+1));
                case 1 -> list2.add(new Spearman(6,per+1));
                case 2 -> list2.add(new Crossbowman(8,per+1));
                case 3 -> list2.add(new Peasant(10,per+1));
            }
        }
    list2.forEach(n -> System.out.println(n.getInfo()));
    System.out.println("____________________________________________________________________________________________________");

    System.out.println("______________________________________Distance line to TEAM 2________________________________");
    list1.forEach(n -> n.step(list2));
    System.out.println("______________________________________Distance line to TEAM 1________________________________");
    list2.forEach(n -> n.step(list1));
    }

}
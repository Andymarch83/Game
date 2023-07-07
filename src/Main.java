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
            int per = new Random().nextInt(7);
            switch (per) {
                case 0 -> list1.add(new Magician());
                case 1 -> list1.add(new Monk());
                case 2 -> list1.add(new Rogue());
                case 3 -> list1.add(new Spearman());
                case 4 -> list1.add(new Sniper());
                case 5 -> list1.add(new Crossbowman());
                case 6 -> list1.add(new Peasant());
            }
        }
//            System.out.println(list1);
//      if (list.get(0) instanceof Crossbowman) ((Crossbowman)list.get(0)).fire();
//      if (list.get(0) instanceof Monk) ((Monk)list.get(0)).castMana();
    System.out.println("____________________________________________________________________________________________________");

    list1.forEach(n -> System.out.println(n.getInfo()));
    System.out.println("______________________________________Список 2___________________________________________");

    ArrayList<Units> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int per = new Random().nextInt(7);
            switch (per) {
                case 0 -> list2.add(new Magician());
                case 1 -> list2.add(new Monk());
                case 2 -> list2.add(new Rogue());
                case 3 -> list2.add(new Spearman());
                case 4 -> list2.add(new Sniper());
                case 5 -> list2.add(new Crossbowman());
                case 6 -> list2.add(new Peasant());
            }
        }
    list2.forEach(n -> System.out.println(n.getInfo()));
    System.out.println("____________________________________________________________________________________________________");



    }

}
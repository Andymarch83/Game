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

/*
Задание 4!
1.Если жизни 0 вернуть управление
2.Если стрел 0 вернуть управление
3.Найти ближайшего противника
4.Нанести ему среднее повреждение
5.Если среди своих есть крестьянин вернут ь управление
6.уменьшить кол-во стрел на одну и вернуть управление

Вызывать персонажей из обеих комманд в порядке инициативы.
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
        int teamCount = 10;
        int init1 = 0;
        int init2 = 0;
        boolean sortedInitiative = false;

        ArrayList<Units> team1 = new ArrayList<>();
        ArrayList<Units> team2 = new ArrayList<>();

//        for (int i =0; i< teamCount; i++){
//            int value = new Random().nextInt(7);
//            addRandomUnits(value, team1, 1);
//
//            value = new Random().nextInt(7);
//            addRandomUnits(value,team2,10);
//        }
//        while (!sortedInitiative) {
//            sortedInitiative=true;
//            for (int i = 0; i<team1.size()-1; i++) {
//                if (team1.get(i).initiative < team1.get(i+1).initiative) {
//                    Collections.swap(team1, i, i+1);
//                    sortedInitiative = false;
//                }
//            }
//        }
        for (int i = 0; i < 10; i++) {
            int per = new Random().nextInt(4);
            switch (per) {
                case 0 -> team1.add(new Monk(2, per+1));
                case 1 -> team1.add(new Rogue(4, per+1));
                case 2 -> team1.add(new Sniper(2, per+1));
                case 3 -> team1.add(new Peasant(0,per+1));
            }
        }
//            System.out.println(list1);
//      if (list.get(0) instanceof Crossbowman) ((Crossbowman)list.get(0)).fire();
//      if (list.get(0) instanceof Monk) ((Monk)list.get(0)).castMana();
    System.out.println("_____________________________________TEAM 1______________________________________________________");

        team1.forEach(n -> System.out.println(n.getInfo() + "initiative" + n.initiative));
    System.out.println("______________________________________TEAM 2___________________________________________");


        for (int i = 0; i < 10; i++) {
            int per = new Random().nextInt(4);
            switch (per) {
                case 0 -> team2.add(new Magician(8,per+1));
                case 1 -> team2.add(new Spearman(6,per+1));
                case 2 -> team2.add(new Crossbowman(8,per+1));
                case 3 -> team2.add(new Peasant(10,per+1));
            }
        }


      team2.forEach(n -> System.out.println(n.getInfo() + "initiative" + n.initiative));
    System.out.println("_____________________________________________________________________________________________");
        Units tmpTeam1 = team1.get(init1);
        Units tmpTeam2 = team2.get(init2);
        System.out.println();
//        System.out.println("______________________________________Round 1________________________________");
//        for (int i = 0; i < teamCount * 2; i++) {
//            boolean b1 = tmpTeam1.initiative < tmpTeam2.initiative && init2 < 10;
//            (tmpTeam1.initiative < tmpTeam2.initiative && init2 < 10)
//            if (tmpTeam1.initiative >= tmpTeam2.initiative && init1 < 10) ||(tmpTeam1.initiative < tmpTeam2.initiative && init2 < 10) {
//                tmpTeam1.step(team2, team1);
//                init1++;
//                if (init1 < 10) tmpTeam1 = team1.get(init1);
//            } else {
//                tmpTeam2.step(team1,team2);
//                init2++;
//                if (init2<10) tmpTeam2 = team2.get(init2);
//            }
//        }


    System.out.println("______________________________________Distance line to TEAM 2________________________________");
        team1.forEach(n -> n.step(team2, team1));
    System.out.println("______________________________________Distance line to TEAM 1________________________________");
        team2.forEach(n -> n.step(team1, team2));
    }
//    private static void addRandomUnits(int num, ArrayList<Units> list,int teamPos) {
//        switch (num) {
//            case 0:
//                list.add(new Crossbowman(teamPos, num+1));
//                break;
//            case 1:
//                list.add(new Spearman(teamPos, num+1));
//                break;
//            case 2:
//                list.add(new Magician(teamPos, num+1));
//                break;
//            case 3:
//                list.add(new Monk (teamPos, num+1));
//                break;
//            case 4:
//                list.add(new Peasant(teamPos, num+1));
//                break;
//            case 5:
//                list.add(new Rogue(teamPos, num+1));
//                break;
//            case 6:
//                list.add(new Sniper(teamPos, num+1));
//                break;
//
//        }
//    }





}
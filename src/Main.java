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
Задание 3! Некоторые стандартные интерфейсы Java и примеры их использования.
Создать класс с описанием координат, x и y.
Добавить в абстрактный класс поле с координатами и пробросить его инициализацию до конструкторов персонажей.
Farmer farmer = new Farmer(getName(), x, y);
Найти среди противников ближайшего и вывести расстояние до него и его имя в консоль.
 */

/*
Задание 4!
1. Если жизни 0 вернуть управление.
2. Если стрел 0 вернуть управление.
3. Найти ближайшего противника.
4. Нанести ему среднее повреждение.
5. Если среди своих есть крестьянин вернуть управление
6. уменьшить кол-во стрел на одну и вернуть управление

Вызывать персонажей из обеих команд в порядке инициативы.

Урок 5. От простого к практике.
Реализовать визуализацию своего проекта по примеру семинара
с использованием приложенных классов. Доработать степ крестьян и магов!
 */

import units.*;

import java.util.*;



public class Main {
    public static ArrayList<Units> civ = new ArrayList<>();
    public static ArrayList<Units> mag = new ArrayList<>();
    public static ArrayList<Units> all = new ArrayList<>();

    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();

//        for (int i = 0; i < 10; i++) {
//            int per = new Random().nextInt(8);
//            switch (per) {
//                case 0 -> units.add(new Sniper(10, i + 1, rand.nextInt(21)));
//                case 1 -> units.add(new Rogue(10, i + 1, rand.nextInt(21)));
//                case 2 -> units.add(new Magician(0, i + 1, rand.nextInt(21), 1));
//                case 3 -> units.add(new Monk(10, i + 1, rand.nextInt(21), 1));
//                case 4 -> units.add(new Peasant(10, i + 1, rand.nextInt(21), 1));
//                case 5 -> units.add(new Peasant(0, i + 1, rand.nextInt(21), 1));
//                case 6 -> units.add(new Spearman(10, i + 1, rand.nextInt(21)));
//                case 7 -> units.add(new Crossbowman(10, i + 1, rand.nextInt(21)));
//            }
//        }

//        System.out.println(all);
//        all.forEach(n -> System.out.println(n.getInfo() + " init: " + n.initiative));

//        System.out.println("____________________________________________________________________________________________________");

        for (int i = 0; i < teamCount; i++) {
            switch(new Random().nextInt(1,5)) {
                case 1 -> civ.add(new Monk(2, i+1, rand.nextInt(21), 1, getName()));
                case 2 -> civ.add(new Rogue(4, i+1, rand.nextInt(21), getName()));
                case 3 -> civ.add(new Sniper(2, i+1, rand.nextInt(21), getName()));
                case 4 -> civ.add(new Peasant(1, i+1, rand.nextInt(21), 1, getName()));
            }
        }
        civ.sort(new Comparator<Units>() {
            @Override
            public int compare(Units o1, Units o2) {
                return o2.initiative - o1.initiative;
            }
        });

//        System.out.println("_____________________________________TEAM 1______________________________________________________");
//        civ.forEach(n -> System.out.println(n.getInfo() + " init: " + n.initiative));
//        System.out.println("______________________________________TEAM 2___________________________________________");

        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(1,5))
            {
                case 1 -> mag.add(new Magician(8, i+1, rand.nextInt(21), 1, getName()));
                case 2 -> mag.add(new Spearman(6, i+1, rand.nextInt(21), getName()));
                case 3 -> mag.add(new Crossbowman(8, i+1, rand.nextInt(21), getName()));
                case 4 -> mag.add(new Peasant(10, i+1, rand.nextInt(21), 1, getName()));
            }
        }
        mag.sort(new Comparator<Units>() {
            @Override
            public int compare(Units o1, Units o2) {
                return  o2.initiative - o1.initiative;
            }
        });

        all.addAll(civ);
        all.addAll(mag);
        all.sort(new Comparator<Units>() {
            @Override
            public int compare(Units o1, Units o2) {
                return  o2.initiative - o1.initiative;
            }
        });
//        mag.forEach(n -> System.out.println(n.getInfo() + " init: " + n.initiative));
//        System.out.println("____________________________________________________________________________________________________");
//
//        System.out.println("______________________________________Distance line to TEAM 2________________________________");
//        civ.forEach(n -> n.step(civ, mag));
//        System.out.println("______________________________________Distance line to TEAM 1________________________________");
//        mag.forEach(n -> n.step(mag, civ));
//    }




//      if (list.get(0) instanceof Crossbowman) ((Crossbowman)list.get(0)).fire();
//      if (list.get(0) instanceof Monk) ((Monk)list.get(0)).castMana();

//        for (int i = 0; i < teamCount; i++) {
//            int val = rand.nextInt(7);
//            addRandomUnit(val, i, civ, 1);
//
//            val = rand.nextInt(7);
//            addRandomUnit(val, i, mag, 10);
//        }
//
//        while (!sortedInitiative) {
//            sortedInitiative = true;
//            for (int i = 0; i < civ.size() - 1; i++) {
//                if (civ.get(i).initiative < civ.get(i + 1).initiative) {
//                    Collections.swap(civ, i, i + 1);
//                    sortedInitiative = false;
//                }
//            }
//        }
//
//        sortedInitiative = false;
//
//        while (!sortedInitiative) {
//            sortedInitiative = true;
//            for (int i = 0; i < mag.size() - 1; i++) {
//                if (mag.get(i).initiative < mag.get(i + 1).initiative) {
//                    Collections.swap(mag, i, i + 1);
//                    sortedInitiative = false;
//                }
//            }
//        }
//
//
//View.view();

        Scanner in = new Scanner(System.in);
        while (true) {

            View.view();

            in.nextLine();
            for (Units unit : all){
                if (mag.contains(unit)){
                    unit.step(civ, mag);
                }else unit.step(mag, civ);
            }
            if (isTeamDie(civ)) {
                System.out.println("Team 2(Blue) win!");
                break;
            }
            if (isTeamDie(mag)) {
                System.out.println("Team 1(Green) win!");
                break;
            }
            }



//

        }
     public static String getName(){
         return String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
    }


    public static boolean isTeamDie(ArrayList<Units> units) {
        for (Units unit : units) {
            if (!Objects.equals(unit.state, "Dead")) return false;
        }
        return true;
    }

//        private static void addRandomUnit ( int num, int i, ArrayList<Units> units, int teamPos) {
//            Random r = new Random();
//            switch (num) {
//                case 0 -> units.add(new Sniper(teamPos, i + 1, r.nextInt(21)));
//                case 1 -> units.add(new Rogue(teamPos, i + 1, r.nextInt(21)));
//                case 2 -> units.add(new Magician(teamPos, i + 1, r.nextInt(21), 1));
//                case 3 -> units.add(new Monk(teamPos, i + 1, r.nextInt(21), 1));
//                case 4 -> units.add(new Peasant(teamPos, i + 1, r.nextInt(21), 1));
//                case 5 -> units.add(new Spearman(teamPos, i + 1, r.nextInt(21)));
//                case 6 -> units.add(new Crossbowman(teamPos, i + 1, r.nextInt(21)));
//            }
//        }
//
//    }
}

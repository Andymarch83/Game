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

import java.util.*;

public class Main {


    public static void main(String[] args) {



        ArrayList<Units> civ = new ArrayList<>();
        ArrayList<Units> mag = new ArrayList<>();
        ArrayList<Units> allTeam = new ArrayList<>();

        int teamCount = 10;
        boolean sortedInitiative = false;
        Random rand = new Random();

//        for (int i = 0; i < 10; i++) {
//            int per = new Random().nextInt(8);
//            switch (per) {
//                case 0 -> units.add(new Monk(2, per+1));
//                case 1 -> units.add(new Rogue(4, per+1));
//                case 2 -> units.add(new Sniper(2, per+1));
//                case 3 -> units.add(new Peasant(0,per+1));
//                case 4 -> units.add(new Magician(8,per+1));
//                case 5 -> units.add(new Spearman(6,per+1));
//                case 6 -> units.add(new Crossbowman(8,per+1));
//                case 7 -> units.add(new Peasant(10,per+1));
//
//            }
//        }
//
//
////
//        for (int i = 0; i < 10; i++) {
//            int per = new Random().nextInt(4);
//            switch (per) {
//                case 0 -> civ.add(new Monk(2, per+1));
//                case 1 -> civ.add(new Rogue(4, per+1));
//                case 2 -> civ.add(new Sniper(2, per+1));
//                case 3 -> civ.add(new Peasant(0,per+1));
//            }
//        }
//            System.out.println(list1);
//      if (list.get(0) instanceof Crossbowman) ((Crossbowman)list.get(0)).fire();
//      if (list.get(0) instanceof Monk) ((Monk)list.get(0)).castMana();
//
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(7);
            addRandomUnit(val, i, civ, 1);

            val = rand.nextInt(7);
            addRandomUnit(val, i, mag, 10);
        }

        while (!sortedInitiative) {
            sortedInitiative = true;
            for (int i = 0; i < civ.size() - 1; i++) {
                if (civ.get(i).initiative < civ.get(i + 1).initiative) {
                    Collections.swap(civ, i, i + 1);
                    sortedInitiative = false;
                }
            }
        }

        sortedInitiative = false;

        while (!sortedInitiative) {
            sortedInitiative = true;
            for (int i = 0; i < mag.size() - 1; i++) {
                if (mag.get(i).initiative < mag.get(i + 1).initiative) {
                    Collections.swap(mag, i, i + 1);
                    sortedInitiative = false;
                }
            }
        }

        allTeam.addAll(civ);
        allTeam.addAll(mag);

       // View.view();

        Scanner in = new Scanner(System.in);
        while (true) {
            in.nextLine();
            String message = null;

            int init1 = 0, init2 = 0;
            Units tmpTeam1 = civ.get(init1);
            Units tmpTeam2 = mag.get(init2);

            for (int i = 0; i < teamCount * 2; i++) {
                if ((tmpTeam1.initiative >= tmpTeam2.initiative && init1 < 10)
                        || (tmpTeam1.initiative < tmpTeam2.initiative && init2 == 10)) {
                    tmpTeam1.step(mag, civ);
                    init1++;
                    if (init1 < 10) tmpTeam1 = civ.get(init1);
                } else {
                    tmpTeam2.step(civ, mag);
                    init2++;
                    if (init2 < 10) tmpTeam2 = mag.get(init2);
                }

                if (isTeamDie(civ)) {
                    message = "Team 2 win!";
                    break;
                }
                if (isTeamDie(mag)) {
                    message = "Team 1 win!";
                    break;
                }
            }

            //View.view();

            if (message == "Team 2 win!" || message == "Team 1 win") {
                System.out.println(message);
                break;
            }
        }
    }

    public static boolean isTeamDie(ArrayList<Units> mag) {
        for (Units units : mag) {
            if (units.state != "Dead") return false;
        }
        return true;
    }

    private static void addRandomUnit(int num, int i, ArrayList<Units> units, int teamPos) {
        Random rand = new Random();
        switch (num) {
            case 0 -> units.add(new Sniper(teamPos, i + 1, rand.nextInt(21)));
            case 1 -> units.add(new Rogue(teamPos, i + 1, rand.nextInt(21)));
            case 2 -> units.add(new Magician(teamPos, i + 1, rand.nextInt(21), 1));
            case 3 -> units.add(new Monk(teamPos, i + 1, rand.nextInt(21), 1));
            case 4 -> units.add(new Peasant(teamPos, i + 1, rand.nextInt(21), 1));
            case 5 -> units.add(new Spearman(teamPos, i + 1, rand.nextInt(21)));
            case 6 -> units.add(new Crossbowman(teamPos, i + 1, rand.nextInt(21)));
        }
    }

}
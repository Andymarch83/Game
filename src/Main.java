/*
Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному
экземпляру каждого класса.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("____________________________________________________________________________________");

        Magician magician =new Magician("Victor");
        System.out.println(magician.getInfo());
        System.out.println("____________________________________________________________________________________");

        Monk monk = new Monk("Avraam");
        System.out.println(monk.getInfo());
        System.out.println("____________________________________________________________________________________");

        Rogue rogue = new Rogue("Kosoy");
        System.out.println(rogue.getInfo());
        System.out.println("____________________________________________________________________________________");

        Spearman spearman = new Spearman("Pinochet");
        System.out.println(spearman.getInfo());
        System.out.println("____________________________________________________________________________________");

        Crossbowman crossbowman = new Crossbowman("Finist");
        System.out.println(crossbowman.getInfo());
        System.out.println("____________________________________________________________________________________");

        Sniper sniper = new Sniper("Kliment");
        System.out.println(sniper.getInfo());
        System.out.println("____________________________________________________________________________________");

        Peasant peasant = new Peasant("Gerasim");
        System.out.println(peasant.getInfo());
        System.out.println("____________________________________________________________________________________");
    }
}
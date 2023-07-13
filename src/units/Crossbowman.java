package units;

import java.util.ArrayList;

public class Crossbowman extends Shooter {
    public Crossbowman(int x, int y) {

        super(12, 4, 3, -3, x, y);
    }
    int shots = 5;
    String type = getType("Crossbowman");
    String name = this.getName();

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


    @Override
    public int stockOfShots(int shots) {
        return super.stockOfShots(shots);
    }
    @Override
    public String getInfo() {

        return super.getInfo() + shots;
    }
    @Override
    public void step(ArrayList<Units> team1, ArrayList<Units> team2) {
        if (this.maxHp == 0 || shots == 0) {
            return;
        }
        Units tmp = nearest(team1);
        System.out.println(type + " " + tmp.getName() + " dist " + coordinates.finedDistance(tmp.coordinates));
    }


}






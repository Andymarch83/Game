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
package units;

import java.util.ArrayList;
import java.util.Objects;

public class Crossbowman extends Shooter {
    public int arrows = shots;
    public Crossbowman(int x, int y, int initiative, String name) {
        super(x, y, initiative + 3, 5, 20, 0, name);
    }

    @Override
    public String getInfo() {
        return "Crossbowman" + " " + name +  " [" + coordinates.x + ", " + coordinates.y + "] arrows: " +
                arrows + " HP: " + hp + "/" + max_hp + " " + state + " ";
    }

    @Override
    public void step(ArrayList<Units> civ, ArrayList<Units> mag) {
        Units tmp = nearest(civ);

            if (isAlive) {
                for (Units unit : civ) {
                    if (unit instanceof Peasant && unit.state == "Stand" && arrows < 20) {
                        arrows += 1;
                        unit.state = " Busy ";
                        System.out.println(getInfo() + " get arrows from: " + unit.getInfo() + " distance " +
                                (int) coordinates.finedDistance(unit.coordinates));
//                        return;
                    }
                }

                if ((int) coordinates.finedDistance(tmp.coordinates) <= attackRange) {
                    if (arrows > 0 && attackRange != 1) {
                        if (attackRange == 1) tmp.getDamage(1);
                        else tmp.getDamage(damage);
                        arrows -= 1;
                        state = " Attack ";
                        System.out.println(getInfo() + "Attacking " + tmp.getInfo() + " distance " +
                                (int) coordinates.finedDistance(tmp.coordinates));
                    } else {
                        attackRange = 1;
                        state = " ->Melee ";
                        System.out.println(getInfo() + "->Melee " + tmp.getInfo() + " distance " +
                                (int) coordinates.finedDistance(tmp.coordinates));
                    }
                } else {
                    move(tmp.coordinates, civ);
                    state = " Moving ";
                    System.out.println(getInfo() + "Moving " + tmp.getInfo() + " distance " +
                            (int) coordinates.finedDistance(tmp.coordinates));
                }
            }
    }
}







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
    public Crossbowman(int x, int y, int initiative) {
        super(x, y, initiative + 3, 5, 20, 0);
    }

    @Override
    public String getInfo() {
        return "Archer [" + coordinates.x + ", " + coordinates.y + "] arrows: " + arrows + " HP: " + hp + "/" + max_hp + " " + state;
    }


}






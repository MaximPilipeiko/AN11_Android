// todo packages lowercase
package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot T800 = new Robot(new SamsungHead(2000), new SonyHand(1500), new ToshibaLeg(2100), "T800");
        Robot R2D2 = new Robot(new SonyHead(1510), new SamsungHand(2090), new SamsungLeg(3200), "R2D2");
        Robot Walle = new Robot(new ToshibaHead(1090), new ToshibaHand(1100), new SamsungLeg(4200), "Walle");

        Robot[] robots = {T800, R2D2, Walle};

        // todo utils, varargs, cicle
        Robot mostExpensiveRobot = robots[0]
        for (Robot robot : robots) {
            if (robot.getPrice() > mostExpensiveRobot.getPrice()) {
                mostExpensiveRobot = robot
            }
        }
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}

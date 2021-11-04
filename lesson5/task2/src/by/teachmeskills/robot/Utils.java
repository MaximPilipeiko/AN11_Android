package by.teachmeskills.robot;

public class Utils {
    public static Robot findMostExp(Robot... robots) {
        Robot mostExpensiveRobot = robots[0];
        for (Robot robot : robots) {
            if (robot.getPrice() > mostExpensiveRobot.getPrice()) {
                mostExpensiveRobot = robot;
            }
        }

        return mostExpensiveRobot;
    }
}

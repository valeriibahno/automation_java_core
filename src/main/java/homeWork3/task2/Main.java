package homeWork3.task2;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.work();

        CoffeeRobot coffeeRobot = new CoffeeRobot();
        coffeeRobot.work();

        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();

        RobotCooker robotCooker = new RobotCooker();
        robotCooker.work();
    }
}

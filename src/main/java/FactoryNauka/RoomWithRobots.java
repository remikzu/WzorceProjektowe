package FactoryNauka;

/**
 * @author Remigiusz Zudzin
 */
public class RoomWithRobots {

    Robot robot1 = RobotFactory.createRobot(RobotModel.Robot1);
    Robot robot2 = RobotFactory.createRobot(RobotModel.Robot2);
    Robot robot3 = RobotFactory.createRobot(RobotModel.Robot3);

    void getInfoAboutRobot() {
        System.out.println(robot1.getHeight());
        System.out.println(robot2.getWeight());
        System.out.println(robot3.getEyeColour());
    }

}

package FactoryNauka;

/**
 * @author Remigiusz Zudzin
 */
public class RobotFactory {

   public static Robot createRobot(RobotModel model) {
       if (RobotModel.Robot1.equals(model)) {
           return new Robot1();
       } else if (RobotModel.Robot2.equals(model)) {
           return new Robot2();
       } else if (RobotModel.Robot3.equals(model)) {
           return new Robot3();
       }
       return null;
   }

}

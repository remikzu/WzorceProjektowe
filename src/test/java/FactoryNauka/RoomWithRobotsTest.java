package FactoryNauka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Remigiusz Zudzin
 */
class RoomWithRobotsTest {

    RoomWithRobots roomWithRobots = new RoomWithRobots();

    @Test
    void testRobotsHeight() {
        Assertions.assertEquals(150, roomWithRobots.robot1.getHeight());
        Assertions.assertEquals(160, roomWithRobots.robot2.getHeight());
        Assertions.assertEquals(170, roomWithRobots.robot3.getHeight());
    }

    @Test
    void testRobotsWeight() {
        Assertions.assertEquals(50, roomWithRobots.robot1.getWeight());
        Assertions.assertEquals(60, roomWithRobots.robot2.getWeight());
        Assertions.assertEquals(70, roomWithRobots.robot3.getWeight());
    }

    @Test
    void testRobotsEyeColour() {
        Assertions.assertEquals("blue", roomWithRobots.robot1.getEyeColour());
        Assertions.assertEquals("green", roomWithRobots.robot2.getEyeColour());
        Assertions.assertEquals("brown", roomWithRobots.robot3.getEyeColour());
    }

}
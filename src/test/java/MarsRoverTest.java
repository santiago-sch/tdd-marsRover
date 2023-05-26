import org.example.MarsRover;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MarsRoverTest {

    @Test
    public void position1() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        String[] actualPosition = new String[]{"1", "1", "x"};
        assertEquals(marsRover.getX(), 1);
        assertEquals(marsRover.getY(), 1);
        assertEquals(marsRover.getDirection(), "N");
    }

    @Test
    public void position2() {
        MarsRover marsRover = new MarsRover(2, 1, "N");
        String[] actualPosition = new String[]{"2", "1", "x"};
        assertEquals(marsRover.getX(), 2);
        assertEquals(marsRover.getY(), 1);
        assertEquals(marsRover.getDirection(), "N");
    }

    @Test
    public void checkValidPosition(){
        MarsRover rover = new MarsRover(1,1,"N");
        assertEquals(rover.validatePosition(1,1,"N"), true);
    }

    @Test
    public void checkInvalidPositionRefactor(){
        MarsRover rover = new MarsRover(1,1,"N");
        assertEquals(rover.validatePosition(2,1,"N"), false);
    }

    @Test
    public void moveForward(){
        MarsRover rover = new MarsRover(1,1,"N");
        rover.moveForward("f");
        assertEquals(rover.validatePosition(1,2,"N"), true);
    }

    @Test
    public void moveBackward(){
        MarsRover rover = new MarsRover(1,1,"N");
        rover.moveBackward("b");
        assertEquals(rover.validatePosition(1,0,"N"), true);
    }

    @Test
    public void moveToLeft(){
        MarsRover rover = new MarsRover(1,1,"N");
        rover.turnLeft("l");
        assertEquals(rover.validatePosition(1,1,"W"), true);
    }

    @Test
    public void moveToRight(){
        MarsRover rover = new MarsRover(1,1,"N");
        rover.turnRight("r");
        assertEquals(rover.validatePosition(1,1,"E"), true);
    }

    @Test
    public void moveForwardBackward(){
        MarsRover rover = new MarsRover(1,1,"N");
        rover.moveForward("f");
        rover.moveBackward("b");
        assertEquals(rover.validatePosition(1,1,"N"), true);
    }

    @Test
    public void moveLeftForwardRight(){
        MarsRover rover = new MarsRover(1,1,"N");
        rover.turnLeft("l");
        rover.moveForward("f");
        rover.turnRight("r");
        assertEquals(rover.validatePosition(0,1,"N"), true);
    }

    @Test
    public void moveForwardForwardRightForwardForwardLeftForwardRightForwardForward(){
        MarsRover rover = new MarsRover(1,1,"N");
        rover.moveForward("f");
        rover.moveForward("f");
        rover.turnRight("r");
        rover.moveForward("f");
        rover.moveForward("f");
        rover.turnLeft("l");
        rover.moveForward("f");
        rover.turnRight("r");
        rover.moveForward("f");
        rover.moveForward("f");
        assertEquals(rover.validatePosition(5,4,"E"), true);
    }

    @Test
    public void moveForwardBackwardBackwardLeftRightRight(){
        MarsRover rover = new MarsRover(1,1,"N");
        rover.moveForward("f");
        rover.moveBackward("b");
        rover.moveBackward("b");
        rover.turnLeft("l");
        rover.turnRight("r");
        rover.turnRight("r");
        assertEquals(rover.validatePosition(1,0,"E"), true);
    }

}

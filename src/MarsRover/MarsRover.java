package MarsRover;

import Command.MoveType;
import Position.*;

import java.util.List;

public class MarsRover {
    private Coordination coordination;
    private EnumDirection direction;

    public MarsRover(Coordination coordination, EnumDirection direction) {
        this.coordination = coordination;
        this.direction = direction;
    }

    public MarsRover() {

    }

    public void execute(List<MoveType> command) {
        for (MoveType moveType : command) {
            switch (moveType) {
                case L:
                    direction = direction.getLeftDirection();
                    break;
                case R:
                    direction = direction.getRightDirection();
                    break;
                case M:
                    coordination.add(direction.getMove());
                    break;
            }
        }
    }

    public String getCurrentPosition() {
        return coordination.toString() + " " + direction.getValue();
    }
}

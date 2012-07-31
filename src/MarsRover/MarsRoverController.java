package MarsRover;

import Command.*;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverController {
    private List<MarsRover> marsRoverList;

    public MarsRoverController(){
        marsRoverList = new ArrayList<MarsRover>();
    }
    public void executeCommand(String cmdForDeploy, List<MoveType> cmdForMove) {
        MarsRover marsRover = new MarsRover();
        marsRover = Command.parseMarsRover(cmdForDeploy);
        marsRover.execute(cmdForMove);
        marsRoverList.add(marsRover);
        System.out.println(marsRover.getCurrentPosition());
    }

    public MarsRover getMarsRover(int index) {
        return marsRoverList.get(index);
    }
}

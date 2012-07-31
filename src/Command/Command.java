package Command;

import MarsRover.*;
import Position.Coordination;
import Position.EnumDirection;

import java.util.ArrayList;
import java.util.List;

public class Command {
    public static MarsRover parseMarsRover(String command) {
        Coordination coordination = parseCoordination(command);
        EnumDirection direction = parseDirection(command);
        return new MarsRover(coordination, direction);
    }

    private static EnumDirection parseDirection(String command) {
        char[] input = command.toCharArray();
        switch (input[3]){
            case 'N':
                return EnumDirection.DirectionNorth;
            case 'S':
                return EnumDirection.DirectionSouth;
            case 'W':
                return EnumDirection.DirectionWest;
            default:
                return EnumDirection.DirectionEast;
        }
    }

    private static Coordination parseCoordination(String command) {
        char[] input = command.toCharArray();
        int xPos = Character.getNumericValue(input[0]);
        int yPos = Character.getNumericValue(input[1]);
        return new Coordination(xPos, yPos);
    }

    public static Coordination parsePlateauBorder(String command) {
        char[] input = command.toCharArray();
        return new Coordination(Character.getNumericValue(input[0]), Character.getNumericValue(input[1]));
    }

    public static List<MoveType> parseCommandMoves(String command) {
        char[] input = command.toCharArray();
        ArrayList<MoveType> movements = new ArrayList<MoveType>();
        for (char c : input) {
            switch(c){
                case 'L':
                    movements.add(MoveType.L);
                    break;
                case 'R':
                    movements.add(MoveType.R);
                    break;
                case 'M':
                    movements.add(MoveType.M);
                    break;
                default:
                    break;
            }
        }
        return movements;
    }

    public static void dispatchCommand(String input) {
        String cmdForDeploy = input.substring(0,4);
        String cmdForMove = input.substring(4);
        List<MoveType> moves = parseCommandMoves(cmdForMove);
        MarsRoverController marsRoverController = new MarsRoverController();
        marsRoverController.executeCommand(cmdForDeploy, moves);
    }
}

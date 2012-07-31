import Command.Command;
import Position.Plateau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Executor {

    public void execute() throws IOException {
        System.out.println("Please Input Command:\n");
        String input;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        input = bufferedReader.readLine();
        Plateau plateau = new Plateau(Command.parsePlateauBorder(input));

        while (true) {
            input = bufferedReader.readLine();
            if (input.equals("OVER")) {
                break;
            }
            input += bufferedReader.readLine();
            System.out.println(input);
            Command.dispatchCommand(input);
        }
    }
}

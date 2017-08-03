import models.Adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/3/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Little Red Riding Hood adventure");

        try {
            Adventure newAdventure = new Adventure();
            System.out.println("Choose 1 or 2 to play");
            String userChoice = bufferedReader.readLine();
            boolean userChoice1 = newAdventure.passBack(userChoice);

            if (userChoice1) {
                System.out.println("Great, you've chosen to go to the forest.  Where will you end up?  Make another choice: 3 or 4");
                String userPath = bufferedReader.readLine();
                boolean userPath1 = newAdventure.pathChoice(userPath);
                    if(userPath1) {
                        System.out.println("You got to grandma safely!");
                    } else {
                        System.out.println("Uh, oh.  You end up in the wolf's den!");
                    }
            } else {
                System.out.println("Sorry, gameover!");
            }

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}

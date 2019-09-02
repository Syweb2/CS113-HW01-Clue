package edu.miracosta.cs113;

import model.AssistantJack;
import model.Theory;
import java.util.Random;
import java.util.Scanner;

public class BeckettClue {

    /*
     * ALGORITHM:
     *
     * PROMPT "Which theory to test? (1, 2, 3[random]): "
     * READ answerSet
     * INSTANTIATE jack = new AssistantJack(answerSet)
     * weapon = random int between 1 and 6
     * location = random int between 1 and 10
     * murder = random int between 1 and 6
     * solution = jack.checkAnswer(weapon, location, murder)
     * DO
     *
     *      IF weapon != correct
     *          OUTPUT "weapon is incorrect"
     *          weapon = random int between 1 and 6
     *          solution = jack.checkAnswer(weapon, location, murder)
     *      ELSE IF location != correct
     *          OUTPUT "location is incorrect"
     *          location = random int between 1 and 10
     *          solution = jack.checkAnswer(weapon, location, murder)
     *      ELSE IF murder != correct
     *          OUTPUT "murder is incorrect"
     *          location = random int between 1 and 10
     *          solution = jack.checkAnswer(weapon, location, murder)
     *      ELSE IF weapon != correct && location != correct
     *          CHOOSE RANDOM x = weapon or location
     *          OUTPUT "x is incorrect"
     *      ELSE IF weapon != correct && murder != correct
     *          CHOOSE RANDOM x = weapon or murder
     *          OUTPUT "x is incorrect"
     *      ELSE IF location != correct && murder != correct
     *          CHOOSE RANDOM x = location or murder
     *          OUTPUT "x is incorrect"
     *      ELSE IF weapon != correct && location != correct && murder != correct
     *          CHOOSE RANDOM x = weapon or location or murder
     *          OUTPUT "x is incorrect"
     *      ELSE
     *          solution = 0
     *
     *      END IF
     * WHILE solution != 0
     *
     * OUTPUT "Total checks = " + jack.getTimesAsked()
     * IF jack.getTimesAsked() is greater than 20 THEN
     *      OUTPUT "FAILED"
     * ELSE
     *      OUTPUT "PASSED"
     * END IF
     */

    /**
     * Driver method for random guessing approach
     *
     * @param args not used for driver
     */
    public static void main(String[] args) {
        // DECLARATION + INITIALIZATION
        int answerSet, solution, murder, weapon, location;
        Theory answer;
        AssistantJack jack;
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        // INPUT
        System.out.println("Which theory would like you like to test? (1, 2, 3[random]): ");
        answerSet = keyboard.nextInt();
        keyboard.close();

        // PROCESSING
        jack = new AssistantJack(answerSet);

        do {
            solution = jack.checkAnswer(weapon, location, murder);
            if()
            weapon = random.nextInt(6) + 1;
            location = random.nextInt(10) + 1;
            murder = random.nextInt(6) + 1;
            solution = jack.checkAnswer(weapon, location, murder);
        } while (solution != 0);

        answer = new Theory(weapon, location, murder);

        // OUTPUT
        System.out.println("Total Checks = " + jack.getTimesAsked() + ", Solution " + answer);

        if (jack.getTimesAsked() > 20) {
            System.out.println("FAILED!! You're a horrible Detective...");
        } else {
            System.out.println("WOW! You might as well be called Batman!");
        }

    }

}

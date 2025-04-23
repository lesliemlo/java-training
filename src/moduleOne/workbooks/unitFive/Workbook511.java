package moduleOne.workbooks.unitFive;

import java.util.Scanner;

public class Workbook511 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diceRoll;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

        while(true){
            scan.nextLine();
            diceRoll = rollDice();
            if(diceRoll == 6){
                System.out.println("You rolled a " + diceRoll + ". End of game.");
                break;
            }else if(diceRoll == 4){
                System.out.println("You rolled a " + diceRoll + ". Zero points. Keep rolling.");
            }else {
                System.out.println("You rolled a " + diceRoll + ". One point. Keep rolling.");
                score++;
            }
        }
        System.out.println("Your score is: " + score);
        if(score >= 3){
            System.out.println("Wow, that's lucky. You win!");
        }else {
            System.out.println("Tough luck, you lose :(");
        }
    }
    /**
     * Function name: rollDice
     * @return randomNumber (int)
     *
     * Inside the function:
     *  - return a random number between one and six.
     */
    public static int rollDice(){
        return (int) (Math.random()*6)+1;
    }
}

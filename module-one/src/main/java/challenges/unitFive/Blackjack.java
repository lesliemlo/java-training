package challenges.unitFive;

import java.util.Scanner;

public class Blackjack {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int hitCard = 0;

        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        //player's cards
        int randCardOne = drawRandomCard();
        int randCardTwo = drawRandomCard();
        int playersHandValue = randCardOne + randCardTwo;

        System.out.println("\n You get a \n" + cardString(randCardOne) + "\n and a \n" + cardString(randCardTwo));
        System.out.println("Your total is: " + playersHandValue);

        //dealer's cards
        randCardOne = drawRandomCard();
        randCardTwo = drawRandomCard();
        int dealerHandValue = randCardOne + randCardTwo;

        System.out.println("The dealer shows \n" + cardString(randCardOne) + "\nand has a card facing down \n" + faceDown() );
        System.out.println("\nThe dealer's total is hidden");


        //Player's turn
        while(playersHandValue < 21){
            String playerRespond = hitOrStay();
            if(playerRespond.equals("hit")){
                hitCard = drawRandomCard();
                System.out.println("\n You get a \n" + cardString(hitCard));
                playersHandValue += hitCard;
                System.out.println("Your new total is: " + playersHandValue);
            } else if (playerRespond.equals("stay")) {
                break;
            }else{
                System.out.println("Please write 'hit' or 'stay'");
            }
        }

        if(playersHandValue >= 21) {
            System.out.println("Bust! Player loses");
        }else { // Dealer's turn
            System.out.println("Dealer's turn");
            System.out.println("The dealer's cards are");
            System.out.println(cardString(randCardOne) + "\n");
            System.out.println("and a");
            System.out.println(cardString(randCardTwo) + "\n");
            System.out.println("Dealer's total is: " + dealerHandValue);
            while(dealerHandValue <= 17){
                hitCard = drawRandomCard();
                System.out.println("Dealer gets a");
                System.out.println(cardString(hitCard));
                dealerHandValue += hitCard;
                System.out.println("Dealer's total is: " + dealerHandValue);
            }
            if(dealerHandValue >= 21) {
                System.out.println("Bust! Dealer loses");
            }else{
                if(playersHandValue > dealerHandValue){
                    System.out.println("Player wins!");
                }else {
                    System.out.println("Dealer wins!");
                }
            }
        }
        scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard(){
        return (int)(Math.random()*13)+1;
    }
    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param //cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber){
        switch(cardNumber){
            case 1:
                return  "   _____\n"+
                        "  |A _  |\n"+
                        "  | ( ) |\n"+
                        "  |(_'_)|\n"+
                        "  |  |  |\n"+
                        "  |____V|\n";
            case 2:
                return "   _____\n"+
                        "  |2    |\n"+
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____E|\n";
            case 4:
                return "   _____\n" +
                        "  |4    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  | o o |\n"+
                        "  |____h|\n";
            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return  "   _____\n" +
                        "  |J  ww|\n"+
                        "  | o {)|\n"+
                        "  |o o% |\n"+
                        "  | | % |\n"+
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n"+
                        "  | o {(|\n"+
                        "  |o o%%|\n"+
                        "  | |%%%|\n"+
                        "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n"+
                        "  | o {)|\n"+
                        "  |o o%%|\n"+
                        "  | |%%%|\n"+
                        "  |_%%%>|\n";
        }
        return "That's not a valid card";
    }
    public static String faceDown() {
        return
                "   _____\n"+
                        "  |     |\n"+
                        "  |  J  |\n"+
                        "  | JJJ |\n"+
                        "  |  J  |\n"+
                        "  |_____|\n";
    }

    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option
     */
    public static String hitOrStay(){
        String userOption = "";
        boolean condition = true;

        System.out.println("Would you like to hit or stay?");
        userOption = scan.nextLine();
        if(userOption.equals("hit") || userOption.equals("stay") )
            condition = false;

        while(condition){
            System.out.println("Please write 'hit' or 'stay'");
            userOption = scan.nextLine();
            if(userOption.equals("hit") || userOption.equals("stay") )
                condition = false;
        }
        return userOption;
    }
}

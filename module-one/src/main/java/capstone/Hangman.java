package capstone;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    static Scanner scan = new Scanner(System.in);
    static char guess = ' ';
    static char[] missLetters = new char[7];
    static char[] guessed;
    static int nextIndex = 0;
    static int misses = 0;

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra"};

    public static String[] gallows = {"""
+---+
|   |
    |
    |
    |
    |
=========
""",

            """
+---+
|   |
O   |
    |
    |
    |
=========
""",

            """
+---+
|   |
O   |
|   |
    |
    |
=========
""",

            """
 +---+
 |   |
 O   |
/|   |
     |
     |
 =========
""",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            """
 +---+
 |   |
 O   |
/|\\  |
/    |
     |
 =========
""",

            """
 +---+
 |   |
 O   |
/|\\  |
/ \\  |
     |
 =========
"""};

    public static void main(String[] args) {
        String randWord = pickWord(words);
        guessed = new char[randWord.length()];
        int misses = 0;
        System.out.println("word: " + randWord);

        for(int i= 0; i<7; i++){
            printGallows(gallows, misses);

            if(didIwin(guessed, randWord)){
                printWord(randWord, guess);
                System.out.println("\n\n GOOD WORK!");
                break;
            }else{

                if(misses != 6){
                    printWord(randWord, guess);
                    misses = printMisses(randWord, guess);
                    System.out.print("\n\nGuess: ");
                    guess = scan.nextLine().charAt(0);
                }
            }

        }



    }

    public static String pickWord(String[] words) {
        return words[(int) (Math.random() * words.length) + 1];
    }

    public static void printGallows(String[] gallows, int misses) {
        switch (misses) {
            case 0:
                System.out.println(gallows[0]);
                break;
            case 1:
                System.out.println(gallows[1]);
                break;
            case 2:
                System.out.println(gallows[2]);
                break;
            case 3:
                System.out.println(gallows[3]);
                break;
            case 4:
                System.out.println(gallows[4]);
                break;
            case 5:
                System.out.println(gallows[5]);
                break;
            case 6:
                System.out.println(gallows[6]);
                System.out.println("\n RIP!");
                break;
            default:
                System.out.println("You're already dead");
        }
    }

    public static void printWord(String word, char guess){
        char[] wordToArray = word.toCharArray();

        System.out.print("Word:\t");
        for (int i = 0; i < word.length(); i++){
            if(guess == wordToArray[i])
                guessed[i] = wordToArray[i];
            if(Character.isLetter(guessed[i])){
                System.out.print(guessed[i] + " ");
            }else{
                System.out.print("_ ");
            }
        }

    }

    public static int printMisses(String word, char guess) {
        char[] wordToArray = word.toCharArray();
        boolean isLetterInWord = false;

        //is the letter in the word?
        for(int i=0; i<wordToArray.length; i++){
            if(guess == wordToArray[i]){
                isLetterInWord = true;
                break;
            }
        }

        //if guess is a miss, enter it on the misses array
        if(!isLetterInWord){
            missLetters[nextIndex] = guess;
            ++nextIndex;
            ++misses;
        }

        //print misses
        System.out.print("\n\nMisses: ");
        for(int i=0; i<missLetters.length; i++){
            if(Character.isLetter(missLetters[i])) //only prints if it finds a letter
                System.out.print(missLetters[i]);
        }

        return misses;
    }

    public static boolean didIwin(char[] guesses, String word){
        char[] wordToArray = word.toCharArray();

        if(Arrays.equals(guesses,wordToArray)) {
            return true;
        }else{
            return false;
        }
    }

}

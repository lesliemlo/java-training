package workbooks.unitFive;

public class Workbook510 {
    public static void main(String[] args) {
        int dice1;
        int dice2;

        dice1 = rollDice();
        dice2 = rollDice();

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);

        while(dice1 != dice2){
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
        }

        System.out.println("You rolled doubles!");

    }
    /**
     * Function name: rollDice -- rolls a dice between 1 and 6
     * @return randomNumber (int)
     *
     */
    public static int rollDice(){
        return (int) (Math.random()*6)+1;
    }
}

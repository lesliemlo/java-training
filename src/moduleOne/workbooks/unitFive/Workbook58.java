package moduleOne.workbooks.unitFive;

import java.util.Scanner;

public class Workbook58 {
    public static void main(String[] args) {
        int secretNum = (int) (Math.random()*6)+1;
        int userNum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(secretNum);
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        userNum = scan.nextInt();

        while (userNum != secretNum){
            System.out.print("Guess again: ");
            userNum = scan.nextInt();
        }

        System.out.println("You got it!");

        scan.close();
    }
}

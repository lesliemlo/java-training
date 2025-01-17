package workbooks.unitFive;

import java.util.Scanner;

public class Workbook55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("1. Pick a number to count by: ");
        int numberToCount = scan.nextInt();
        System.out.print("2. Pick a number to start counting fom: ");
        int startNumber = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int stopNumber = scan.nextInt();

        for(int i=startNumber; i<=stopNumber; i++){
            System.out.print(i + " ");
            i += (numberToCount-1);
        }

        scan.close();
    }
}

package workbooks.unitFive;

import java.util.Scanner;

public class Workbook53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hi Timmy! Choose a number to count to: ");
        int userInput = scan.nextInt();

        System.out.println("Great! Here's how it's done");
        for(int i=0; i<=userInput; i++){
            System.out.print(i + " ");
        }

        scan.close();
    }
}

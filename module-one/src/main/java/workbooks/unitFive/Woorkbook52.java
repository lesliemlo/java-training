package workbooks.unitFive;

import java.util.Scanner;

public class Woorkbook52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String bartsLine = scan.nextLine();

        for(int i=0; i<100; i++){
            System.out.println(bartsLine);
        }

    }
}

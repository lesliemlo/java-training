package moduleOne.workbooks.unitFive;

import java.util.Scanner;

public class Workbook59 {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        String usernameEntry ="";
        String passwordEntry="";

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        usernameEntry = scan.nextLine();
        System.out.print("- Password: ");
        passwordEntry = scan.nextLine();

        while(!usernameEntry.equals(username) && !passwordEntry.equals(password)){
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();
        }

        System.out.println("Sign in successful. Welcome!");

        scan.close();

    }
}

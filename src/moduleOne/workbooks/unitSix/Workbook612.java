package moduleOne.workbooks.unitSix;

import java.util.Arrays;

public class Workbook612 {
    public static void main(String[] args) {

        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2;

        ticket2 = Arrays.copyOf(ticket,6);
        ticket2[2] = 54;

        System.out.print("Ticket 1 numbers: ");
        printTicketNumbers(ticket);

        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);

    }
    /**
     * Function name: printTicketNumbers
     * @param ticket ( int[] )
     *
     *inside the function
     *  1. use a loop to print the numbers in one line.
     *  2. after the loop, print two new lines
     *
     */
    public static void printTicketNumbers(int[] ticket){
        for(int i=0; i<ticket.length; i++)
            System.out.print(ticket[i] + " ");
        System.out.println("\n");
    }
}

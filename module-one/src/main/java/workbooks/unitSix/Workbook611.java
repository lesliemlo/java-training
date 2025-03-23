package workbooks.unitSix;

import java.util.Arrays;

public class Workbook611 {
    public static void main(String[] args) {

        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit;

        fahrenheit = celsiusToFahrenheit(celsius);

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");

    }

    /**
     * Function name: celciusToFahrenheit.
     * @param celsius (double[])
     * @var fahrenheit (double[])
     *
     * Inside the function:
     *      1. Create a double[] array called 'fahrenheit'.
     *      2. Copies all the values from celsius to fahrenheit.
     *      3. Updates the fahrenheit values (F = (C/5 * 9) + 32).
     *      4. return fahrenheit.
     */

    public static double[] celsiusToFahrenheit(double[] celsius){
        double[] fahrenheit = celsius.clone();
        for(int i=0; i<fahrenheit.length; i++)
            fahrenheit[i] = (celsius[i]/5*9)+32;

        return fahrenheit;
    }

    /**
     * Function name: printTemperatures
     * @param temp ( double[] )
     * @param tempType ( String ) can be: Celsius or Fahrenheit
     *
     * inside the function:
     * 1. print tempType + " "
     * 2. a loop prints the temperature in ONE line
     *                 print temp[i] + " "
     * 3. print a new line after the loop
     */
    public static void printTemperatures(double[] temp, String tempType){
        System.out.print(tempType + ": ");
        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}

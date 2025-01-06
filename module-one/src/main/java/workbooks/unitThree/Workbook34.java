package workbooks.unitThree;

public class Workbook34 {
    public static void main(String[] args) {
        int temp = -12;

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if(temp <= -1){
            System.out.println("The forecast is FREEZING! Stay home!");
        } else if (temp <= 10) {
            System.out.println("The forecast is Chilly. Wear a coat!");
        }else{
            System.out.println("It's warm. Go outside");
        }


        System.out.println(forecast);
    }
}

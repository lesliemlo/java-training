package moduleOne.workbooks.unitSix;

public class Workbook66 {
    public static void main(String[] args) {

        int highScore = 0;
        int[] scores = new int[10];
        int seat = 0;

        System.out.print("Here are the scores: ");

        for(int i=0; i<scores.length; i++){
            scores[i] = randomNumber();
            System.out.print(scores[i] + " ");
            if(scores[i] > highScore) {
                highScore = scores[i];
                seat = i;
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");

    }
    /**
     * Function name - randomNumber
     * @return (int)
     *
     * Inside the function
     *      - returns a random number between 0 to 49999
     */
    public static int randomNumber(){
        return (int) (Math.random() * 50000);
    }
}

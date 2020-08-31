import java.util.Random;
import java.util.Scanner;


public class Version1 {


    public static void main(String[] args) {

        Random letter1 = new Random();
        Random letter2 = new Random();
        Random letter3 = new Random();
        Random letter4 = new Random();

         String key = "RGBYOP";
         String secretCode = String.valueOf(key.charAt(letter1.nextInt(6))) + String.valueOf(key.charAt(letter2.nextInt(6))) +
                 String.valueOf(key.charAt(letter3.nextInt(6))) + String.valueOf(key.charAt(letter4.nextInt(6)));
         System.out.println(secretCode);

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess the four letter code using only R, G, B, Y, O, P");



        int guesses = 5;


        while(guesses > 0){

            System.out.print("Guess: ");
            String guess = scan.nextLine();

            int partial = 0;
            int exact = 0;


        if(guess.equals(secretCode)){
            System.out.print("You Win!");
        }
        else {
            guesses--;
            for (int i = 0; i < guess.length(); i++) {

                if (guess.charAt(i) == secretCode.charAt(i)) {
                    exact++;
                    secretCode.replace(secretCode.charAt(i), '_');
                }

                else {
                    for (int j = 0; j < guess.length(); j++) {

                        if (guess.charAt(i) == secretCode.charAt(j)) {

                            secretCode.replace(secretCode.charAt(i), '*');
                            partial++;

                        }
                    }
                }

            }
            System.out.println("Exact: " + exact + " Partial: " + partial + " Guesses: " + guesses);

        }
        }

        System.out.println("All out of Guesses. You lose!");

    }


}

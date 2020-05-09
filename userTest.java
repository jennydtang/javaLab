import java.util.Random;
import java.util.Scanner;

public class userTest {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = userInput.nextLine();

        System.out.printf("Hello %s", name);
        String ans;

        System.out.println(" Do you want to continue with this game? (yes or no) ");
        ans = userInput.nextLine();

        String car;
        String pet;
        int petAge;
        int luckyNumber;
        int qtrNumber;
        int carModel;
        String actorFirstName;
        int randomNumber;

        // while loop for when answer is yes
        while (ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("yes")) {// ignore case
            System.out.println("Do you have a red car? (yes, no) ");
            car = userInput.nextLine();

            System.out.println("What is your pet's name? ");
            pet = userInput.nextLine();

            System.out.println("What is your favorite actor/actress's first name? ");
            actorFirstName = userInput.nextLine();

            System.out.println("How old is your pet? ");
            petAge = userInput.nextInt();

            System.out.println("What's your lucky number? ");
            luckyNumber = userInput.nextInt();

            System.out.println("Do they have a favorite quarterback?  If so what is their jersey number? ");
            qtrNumber = userInput.nextInt();

            System.out.println("What is two-digit model year of their car?");
            carModel = userInput.nextInt();

            System.out.println("Enter a random number between 1 and 50 ");
            randomNumber = userInput.nextInt();

            // 3 Random Integers
            Random random = new Random(); // imported random to use
            int rand1 = random.nextInt(75); // random num for magic ball < 75
            int rand2 = random.nextInt(65); // random num for lottery <65
            int rand3 = random.nextInt(20); // Third random integer

            // Magic Ball Number
            int magicball = rand1 * luckyNumber;
            while (magicball > 75) { // magic ball number needs to be less than 75 so put in while loop until it fits
                                     // condition
                magicball = magicball - 75;
            }
            System.out.println("Magic Ball: " + magicball);

            // Get 5 Lottery Numbers
            int lotNum1 = 42;
            int lotNum2 = petAge + carModel;
            while (lotNum2 > 65) {// number needs to be less than 65
                lotNum2 = lotNum2 - 65;
            }
            int lotNum3 = qtrNumber + petAge + luckyNumber;
            while (lotNum3 > 65) {
                lotNum3 = lotNum3 - 65;
            }
            int lotNum4 = pet.charAt(2);
            if (lotNum4 < 1) {
                lotNum4 = lotNum4 + 1;// numbers need to be between 1 and 65
            }
            while (lotNum4 > 65) {
                lotNum4 = lotNum4 - 65;
            }
            int lotNum5 = actorFirstName.charAt(0);// use charAt to get the value of the index
            while (lotNum5 > 65) {
                lotNum5 = lotNum5 - 65;
            }
            // Print the lottery Numbers
            System.out.println(
                    "Lottery numbers: " + lotNum1 + ", " + lotNum2 + ", " + lotNum3 + ", " + lotNum4 + ", " + lotNum5);

            // Ask the user if they want to play again
            System.out.println(" Do you want to play again? ");
            ans = userInput.next();// goes to next token in scanner
        }
        // print a thank you message
        // exit the program
        System.out.println("Thanks for playing! Have a great day!");
        System.exit(0);// 0 indicates successful termination of program
        userInput.close();
    }
}
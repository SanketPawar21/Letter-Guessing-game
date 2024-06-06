import java.util.Scanner;

public class LetterGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "sanket"; 
        int chances = 5; 
        int points = 0; 

        System.out.println("Welcome to the Letter Guessing Game!");
        System.out.println("You have " + chances + " chances to guess the name.");

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            boolean guess = false;

            while (!guess) {
                System.out.print("Guess the " + (i + 1) + " letter: ");
                String input = sc.next();

                if (input.equalsIgnoreCase(String.valueOf(letter))) {
                    System.out.println("Correct! You earn 5 points.");
                    points += 5;
                    guess = true;
                } else {
                    System.out.println("Wrong! You loose 1 chance.");
                    System.out.println("if you want hint type hint");
                    chances--;
                    if (chances == 0) {
                        System.out.println("Game over! You didn't guess the name.");
                        break;
                    }
                }

                if (input.equalsIgnoreCase("hint")) {
                    System.out.println("Hint: The first letter is " + name.charAt(0));
                    points -= 5;
                    guess = true;
                }
            }
        }

        System.out.println("Your total points are: " + points);
    }
}
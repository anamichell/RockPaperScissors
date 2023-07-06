///////////////////////// // CSCI 3326.01
// Spring 2023
// Lab 04
// Ana Garcia
/////////////////////////
import java.util.Scanner;

public class Lab04Part5 {
    public static void main(String[] args)
    {
        char again = ' ';

        int tryAgain = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Starting the game...");

        do {
    
            String you, computer, result = " ";

            System.out.println("1. Rock\n2. Paper\n3. Scissors\nWhat do you want to throw?");
    
            int num = input.nextInt();

            int rand = (int)(Math.random() * (3 + 1 - 1) + 1);

            if(num == 1)
            {
                you = "Rock";
            } else if (num == 2)
            {
                you = "Paper";
            } else 
            {
                you = "Scissors";
            }

            if(rand == 1)
            {
                computer = "Rock";
            } else if (rand == 2)
            {
                computer = "Paper";
            } else 
            {
                computer = "Scissors";
            }

            if(num == rand)
            {
                result = "You tied!";
            } else if (num == 2 && rand == 1 || num == 1 && rand == 3 || num == 3 && rand == 2)
            {
                result = "You won!";
            } else if (num == 1 && rand == 2|| num == 2 && rand == 3 || num == 3 && rand == 1)
            {
                result = "You lost!";
            }
    
            System.out.println("You: " + you + " vs Computer: " + computer + "\n" + result);

            ++tryAgain;

            if(tryAgain < 3)
            {
                System.out.println("Do you want to play again? (Y/N)?");
                again = input.next().charAt(0);
                if (again == 'N' || again == 'n')
                {
                    System.out.println("Thank you for playing, see you later!");
                }
            } else 
            {
                System.out.print("Thank you for playing, see you later!");
            }

        } while(again == 'Y' && tryAgain < 3|| again == 'y' && tryAgain < 3);

        input.close();
    }
}

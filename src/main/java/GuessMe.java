import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        int compChoice = 23;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please pick a number.");
        int playerChoice = sc.nextInt();

        if(playerChoice ==(compChoice)) {
            System.out.println("Wow! That was my number!");
        } else if(playerChoice < compChoice) {
            System.out.println("Not quite. " + playerChoice + "is a little low");
        } else {
            System.out.println("Not quite." + playerChoice +   " is a little high");
        }
    }
}

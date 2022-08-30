import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args) {
        int number;
        String monthAndBirthstone = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a number between 1 through 12.");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                monthAndBirthstone = "January & Garnet";
                break;
            case 2:
                monthAndBirthstone = "February & Amethyst";
                break;
            case 3:
                monthAndBirthstone = "March & Aquamarine";
                break;
            case 4:
                monthAndBirthstone = "April & Diamond";
                break;
            case 5:
                monthAndBirthstone = "May & Emerald";
                break;
            case 6:
                monthAndBirthstone = "June & Pearl";
                break;
            case 7:
                monthAndBirthstone = "July & Ruby";
                break;
            case 8:
                monthAndBirthstone = "August & Peridot";
                break;
            case 9:
                monthAndBirthstone = "September & Sapphire";
                break;
            case 10:
                monthAndBirthstone = "October & Opal";
                break;
            case 11:
                monthAndBirthstone = "November & Topaz";
                break;
            case 12:
                monthAndBirthstone = "December & Turquoise";
                break;
            default:
                monthAndBirthstone = "Oops! Did you pick a number between 1 & 12??";
        }
    System.out.println(monthAndBirthstone);
    }
}

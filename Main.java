import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        allTourStart();
    }

    public static void allTourStart() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Safari Tour, we have 4 different tours \n" +
                    "1. Vehicle Safari Tour\n" +
                    "2. Ocean Safari Tour\n" +
                    "3. Walking Safari Tour\n" +
                    "4. Boat Safari Tour\n" +
                    "Enter the number of the Safari Tour you want to choose: \n" +
                    "To quit enter 5 ");

            int tourChoice = scanner.nextInt();

            switch (tourChoice) {
                case 1:
                    System.out.println("You selected Vehicle Safari Tour.");
                    UserSafari.startTour();
                    break;
                case 2:
                    System.out.println("You selected Ocean Safari Tour.");
                    userOcean.startTour();
                    break;
                case 3:
                    System.out.println("You selected Walking Safari Tour.");
                    userWalkingTour.startTour();
                    break;
                case 4:
                    System.out.println("You selected Boat Safari Tour.");
                    userBoatTour.startTour();
                    break;
                case 5:
                    System.out.println("You have quit the tour");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }
    }
}

import java.util.Scanner;
import javax.swing.JTextArea;

public class userOcean {
    public static void startTour() {
        Scanner scanner = new Scanner(System.in);
        OceanSafariTour oceanTour = new OceanSafariTour("Ocean Safari", 65.2, 3, "N/A", "Kai");

        System.out.println("Welcome to the Ocean Tour! We offer many of the following tours: \n" +
                "1. Snorkeling\n" +
                "2. Whale Watching\n" +
                "3. To quit \n" +
                "Enter the number of the tour you want to choose (1-3): ");
        int tourChoice = scanner.nextInt();

        switch (tourChoice) {
            case 1:
                System.out.println("You selected Snorkeling");
                oceanTour.setTourType("Snorkeling");
                OceanSafariTour snorkeling = new OceanSafariTour(oceanTour.name, oceanTour.price, oceanTour.durationInHours, oceanTour.tourType, oceanTour.guide);
                snorkeling.setPrice(125.99);
                snorkeling.setDurationInHours(2);
                System.out.println(snorkeling.getDescription());
                System.out.println("I'm " + snorkeling.guide +" your snorkeling guide \n");
                System.out.println("This tour will be beautiful as you will explore bunch of corals & animals");
                System.out.println("Lets start!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("As you snorkel, keep an eye out for dolphins and turtles! \nSome fun facts about these animals are: ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(snorkeling.dolphinDescription() + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(snorkeling.turtleDecsription()+ "\n");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Many sea creatures rely on these corals for food, shelter.. \n");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("This tour is coming to an end now, I hope this tour was very informative, and we can't wait to have you back again! \n " +
                        "You will be able to start a new tour soon ");


                break;

            case 2:
                System.out.println("You selected Whale Watching");
                OceanSafariTour whaleWatching = new OceanSafariTour(oceanTour.name, oceanTour.price, oceanTour.durationInHours, oceanTour.tourType, oceanTour.guide);
                whaleWatching.setPrice(145.99);
                whaleWatching.setDurationInHours(4);
                System.out.println(whaleWatching.getDescription());
                System.out.println("Let's go whale watching! I'm " + whaleWatching.getGuide() + " and I will be your guide for this tour, sit back and enjoy the whales!");
                System.out.println("During the tour, you'll have the chance to see majestic whales breaching and playing in the ocean. \n" + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Whales are large marine mammals known for their size and impressive behaviors. ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Krill, tiny shrimp-like creatures, are a staple food for many species of whales.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("As you can see in front of you there are a lot of whales coming out in the ocean \n");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The sun is setting now, so we will be heading back, I hope you guys enjoyed the tour! \n" +
                        "You will  be able to start a new tour soon");
                break;
            case 3:
                System.out.println("You have quit the tour");
                break;



            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                break;
        }


    }
}
import java.util.Scanner;

public class userBoatTour {

    public static void startTour() {
        Scanner scanner = new Scanner(System.in);
        SafariBoatTour boatTour = new SafariBoatTour("Canoe", 0.00, 1,  "N/A",false);
        animals lion = new animals("Lion", "Carnivore", "The king of the jungle", 15);
        animals elephant = new animals("Elephant", "Herbivore", "The largest land animal", 60);
        animals monkey = new animals("Monkey", "Omnivore", "Highly intelligent and social animals, often found in tropical rainforests & has human like features", 20);
        animals giraffe = new animals("Giraffe", "Herbivore", "The tallest mammal on Earth", 25);
        animals kangaroo = new animals("Kangaroo", "Herbivore", "Marsupials found in Australia known for their powerful hind legs", 15);
        animals zebra = new animals("Zebra", "Herbivore", "Equids known for their distinctive black and white stripes", 25);
        animals cheetah = new animals("Cheetah", "Carnivore", "Fastest land animal, known for its incredible speed and spotted coat", 12);
        animals panda = new animals("Panda", "Herbivore", "Large bears native to China known for their black and white fur and bamboo diet", 20);
        animals peacock = new animals("Peacock", "Omnivore", "Pretty unique bird with colorful feathers ", 25);

        System.out.println("Welcome to the Boat tour. We offer various types of boats you can use. Please select from the following: \n" +
                "1. Canoe\n" +
                "2. Traditional Boat\n" +
                "3. Rafts");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected a Canoe.");
                boatTour.setName("Canoe");
                boatTour.setPrice(99.99);
                boatTour.setIncludesWildlifeSpotting(true);
                boatTour.setGuide("Tony");
                System.out.println(boatTour.getDescription());
                System.out.println("Welcome to the Canoe tour my name is " + boatTour.getGuide() + " and I will be your guide");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("This tour does include wildlife spotting so we will be seeing various wildlife here & some unique plants that are native to this place.\n");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Well then lets get started...\n");
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("On your right, you can see some " + panda.getName() + " they are " + panda.getDescription() + "\n these animals have a average lifespan of " + panda.getLifespan() + " & they're diet is " + panda.getDiet());
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("On your left, you can see some " + cheetah.getName() + " they are " + cheetah.getDescription() + "\n these animals have a average lifespan of " + cheetah.getLifespan() + " & they're diet is " + cheetah.getDiet());
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("On your left, you can see some " + giraffe.getName() + " they are " + giraffe.getDescription() + "\n these animals have a average lifespan of " + giraffe.getLifespan() + " & they're diet is " + giraffe.getDiet());
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("In front of, you can see some " + kangaroo.getName() + " they are " + kangaroo.getDescription() + "\n these animals have a average lifespan of " + kangaroo.getLifespan() + " years old & they're diet is " + kangaroo.getDiet() + "\n");

                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ladies and gentlemen our tour is coming to a full stop now. I hoped you enjoyed the tour and can't wait to meet you guys again! \n " +
                        "You will be able to start a new tour soon");
                Main.allTourStart();
                break;

            case 2:
                System.out.println("You have selected a Traditional Boat.");
                boatTour.setName("Traditional Boat");
                boatTour.setIncludesWildlifeSpotting(true);
                boatTour.setPrice(144.99);
                boatTour.setGuide("Kai");
                System.out.println(boatTour.getDescription());
                System.out.println("Welcome to the Traditional boat tour my name is " + boatTour.getGuide() + " and I will be your guide\n");
                System.out.println("Well then lets get started...\n");
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("On your right, you can see some " + peacock.getName() + " they are " + peacock.getDescription() + "\n these animals have a average lifespan of " + peacock.getLifespan() + " & they're diet is " + peacock.getDiet());
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("On your left, you can see some " + monkey.getName() + " they are " + monkey.getDescription() + "\n these animals have a average lifespan of " + monkey.getLifespan() + " & they're diet is " + monkey.getDiet());
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("On your left, you can see some " + giraffe.getName() + " they are " + giraffe.getDescription() + "\n these animals have a average lifespan of " + giraffe.getLifespan() + " & they're diet is " + giraffe.getDiet());
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("In front of, you can see some " + elephant.getName() + " they are " + elephant.getDescription() + "\n these animals have a average lifespan of " + elephant.getLifespan() + " years old & they're diet is " + elephant.getDiet() + "\n");

                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ladies and gentlemen our tour is coming to a full stop now. I hoped you enjoyed the tour and can't wait to see you back again \n " +
                        "You will be able to start a new tour soon");
                Main.allTourStart();

                break;
            case 3:
                System.out.println("You have selected Rafts.");
                boatTour.setName("Rafts");
                boatTour.setPrice(199.99);
                boatTour.setGuide("Rex");
                boatTour.setIncludesWildlifeSpotting(true);
                System.out.println(boatTour.getDescription());
                System.out.println("Welcome to the raft tour my name is " + boatTour.getGuide() + " and I will be your guide");
                System.out.println("Lets begin");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hold tight guys we are approaching some rocky water this may feel like a roller coaster!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Alright we are slowly approaching our first animal guys");

                System.out.println("On your right, you can see some " + peacock.getName() + " they are " + peacock.getDescription() + "\n these animals have a average lifespan of " + peacock.getLifespan() + " & they're diet is " + peacock.getDiet());
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("On your left, you can see some " + lion.getName() + " they are " + lion.getDescription() + "\n these animals have a average lifespan of " + lion.getLifespan() + " & they're diet is " + lion.getDiet());
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("On your left, you can see some " + giraffe.getName() + " they are " + giraffe.getDescription() + "\n these animals have a average lifespan of " + giraffe.getLifespan() + " & they're diet is " + giraffe.getDiet());
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("In front of, you can see some " + zebra.getName() + " they are " + zebra.getDescription() + "\n these animals have a average lifespan of " + zebra.getLifespan() + " years old & they're diet is " + zebra.getDiet());

                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ladies and gentlemen our tour is coming to a full stop now. I hoped you enjoyed the tour and can't wait to meet you guys again next time time! \n" +
                        "You will be able to start a new tour soon. ");
                Main.allTourStart();
                break;



            default:
                System.out.println("Invalid choice. Please select from 1, 2, or 3.");
                break;

        }
    }
}
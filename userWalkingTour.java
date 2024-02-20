import java.util.Scanner;
public class userWalkingTour {
    public static void startTour() {
        Scanner scanner = new Scanner(System.in);
        WalkingTour guidedWalkingTour = new WalkingTour("Guided Walking Tour", 50.0, 2, 5, "Mai", "Waterfall");

        System.out.println("Welcome to the walking tour, one of our most popular tours is the hike to the waterfall.\n\n" +
                "Would you like to choose the scenic walk offering beautiful views along the coast, distance is an extra 4KM & 1 hour extra?\n" +
                "Or would you like to go with the basic tour through the forest, offering sights of many beautiful wildlife?\n \n" +
                "Enter 1 for the scenic tour or enter 2 for the basic tour:");

        int choice = scanner.nextInt();
        scanner.nextLine();

        animals lion = new animals("Lion", "Carnivore", "The king of the jungle", 15);
        animals elephant = new animals("Elephant", "Herbivore", "The largest land animal", 60);
        animals monkey = new animals("Monkey", "Omnivore", "Highly intelligent and social animals, often found in tropical rainforests & has human like features", 20);
        animals giraffe = new animals("Giraffe", "Herbivore", "The tallest mammal on Earth", 25);
        animals kangaroo = new animals("Kangaroo", "Herbivore", "Marsupials found in Australia known for their powerful hind legs", 15);
        animals zebra = new animals("Zebra", "Herbivore", "Equids known for their distinctive black and white stripes", 25);
        animals cheetah = new animals("Cheetah", "Carnivore", "Fastest land animal, known for its incredible speed and spotted coat", 12);
        animals panda = new animals("Panda", "Herbivore", "Large bears native to China known for their black and white fur and bamboo diet", 20);
        animals peacock = new animals("Peacock", "Omnivore", "Pretty unique bird with colorful feathers ", 25);

        switch (choice) {
            case 1:
                guidedWalkingTour.setSight("Scenic Walk");
                guidedWalkingTour.setDistanceInKilometers(guidedWalkingTour.getDistanceInKilometers() + 4);
                guidedWalkingTour.setDurationInHours(guidedWalkingTour.getDurationInHours() + 1);
                System.out.println("You have chosen the " + guidedWalkingTour.getSight() + ".");
                System.out.println("Tour details:\n" + guidedWalkingTour.getDescription());
                System.out.println("Let's start walking now guys! \n");
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("On your right, you can see some " + panda.getName() + " they are " + panda.getDescription() + "\n these animals have a average lifespan of " + panda.getLifespan() + " & they're diet is " + panda.getDiet() );
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("You guys should be able to get some nice views of the ocean on your left crystal blue water we can stop here few minutes to take pictures.\n");
                try {
                    Thread.sleep(3000);
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
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ladies and gentlemen as we cross thus bridge you will be able to see the waterfall, & alot of peacocks.\n");
                System.out.println("A fun fact about " + peacock.getName() + " they are " + peacock.getDescription() + "\n these animals have a average lifespan of " + peacock.getLifespan() + " & they're diet is " + peacock.getDiet() + "\n");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ladies and gentlemen our tour is coming to a full stop now. I hoped you enjoyed the tour and can't wait to see you guys again \n " +
                        "You can start a new tour soon");
                break;
            case 2:
                guidedWalkingTour.setSight("Basic Tour");
                System.out.println("You have chosen the " + guidedWalkingTour.getSight() + ".");
                System.out.println("Tour details:\n" + guidedWalkingTour.getDescription());
                break;
            default:
                System.out.println("Invalid choice. Defaulting to basic tour.");
                System.out.println("Let's start walking now guys! \n");
                try {
                    Thread.sleep(2000); // Sleep for another 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("On your right, you can see some " + panda.getName() + " they are " + panda.getDescription() + "\n these animals have a average lifespan of " + panda.getLifespan() + " & they're diet is " + panda.getDiet());

                try {
                    Thread.sleep(3000);
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

                System.out.println("In front of, you can see some " + kangaroo.getName() + " they are " + kangaroo.getDescription() + "\n these animals have a average lifespan of " + kangaroo.getLifespan() + " years old & they're diet is " + kangaroo.getDiet());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ladies and gentlemen as we cross this bridge you will be able to see the waterfall, & alot of peacocks.\n");
                System.out.println("A fun fact about " + peacock.getName() + " they are " + peacock.getDescription() + "\n these animals have a average lifespan of " + peacock.getLifespan() + " & they're diet is " + peacock.getDiet() + "\n");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ladies and gentlemen our tour is coming to a full stop now. I hoped you enjoyed the tour and can't wait to see you guys again \n" +
                        "You can start a new tour soon");
                break;
        }




    }
}
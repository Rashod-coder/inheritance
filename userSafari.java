import java.util.Scanner;

 class UserSafari {
    public static void startTour() {
        Scanner scanner = new Scanner(System.in);
        animals lion = new animals("Lion", "Carnivore", "The king of the jungle", 15);
        animals elephant = new animals("Elephant", "Herbivore", "The largest land animal", 60);
        animals monkey = new animals("Monkey", "Omnivore", "Highly intelligent and social animals, often found in tropical rainforests & has human like features", 20);
        animals giraffe = new animals("Giraffe", "Herbivore", "The tallest mammal on Earth", 25);
        animals kangaroo = new animals("Kangaroo", "Herbivore", "Marsupials found in Australia known for their powerful hind legs", 15);
        animals zebra = new animals("Zebra", "Herbivore", "Equids known for their distinctive black and white stripes", 25);
        animals cheetah = new animals("Cheetah", "Carnivore", "Fastest land animal, known for its incredible speed and spotted coat", 12);
        animals panda = new animals("Panda", "Herbivore", "Large bears native to China known for their black and white fur and bamboo diet", 20);
        animals peacock = new animals("Peacock", "Omnivore", "Pretty unique bird with colorful feathers ", 25);

        System.out.println("Welcome to thea Vehicle Safari Tours!\n");
        System.out.println("Which tour would you like to start?");
        System.out.println("1. Truck Tour");
        System.out.println("2. ATV Tour");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (choice == 1) {
            SafariTour tour = new TruckTour("Basic Truck Tour", 99.99, 3, "Leon", "4 Wheel Offroad Truck");
            System.out.println("You have selected the Truck Tour.");
            System.out.println("Tour Description: " + tour.getDescription() + "\n");
            System.out.println("Welcome to the tour Truck Tour, I'm " + tour.getGuide() + " in this tour you will be going through the jungle seeing animals!");
            System.out.println("Let's start going there may be some bumpy surfaces so hold on now! \n");
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
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("In front of, you can see some " + kangaroo.getName() + " they are " + kangaroo.getDescription() + "\n these animals have a average lifespan of " + kangaroo.getLifespan() + " years old & they're diet is " + kangaroo.getDiet());

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
            System.out.println("This tour is coming to an end I hope you enjoyed it, we hope to meet you again \n " +
                    "You will be able to start a new tour soon. ");



        } else if (choice == 2) {
            SafariTour tour = new ATVTour("Basic ATV Tour", 79.99, 2, "Kai", "Sport ATV");
            System.out.println("You have selected the ATV Tour.");
            System.out.println("Tour Description: " + tour.getDescription() + "\n");
            System.out.println("Welcome to the ATV tour, I'm " + tour.getGuide() + " in this tour you will be going through the jungle seeing animals!");
            System.out.println("In a ATV tour the difference is we go much faster, & the experience is more fun!");
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
            System.out.println("This tour is coming to an end I hope you enjoyed it, we hope to meet you again \n " +
                    "You will be able to start a new tour soon: ");



        } else if (choice == 3) {
            System.out.println("You have quit the program");
        } else {
            System.out.println("Invalid choice. Please enter 1 for Truck Tour or 2 for ATV Tour.");
        }
    }
}

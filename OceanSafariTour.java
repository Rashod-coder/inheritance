// Subclass representing an ocean safari tour
class OceanSafariTour extends Tour {
    protected String tourType; // e.g., snorkeling, diving, whale watching


    protected String guide;



    // Constructor
    public OceanSafariTour(String name, double price, int durationInHours, String tourType, String guide) {
        super(name, price, durationInHours);
        this.tourType = tourType;
        this.guide = guide;
    }

    // Overridden method
    @Override
    public String getDescription() {
        return "Experience the beauty of the ocean with our " + tourType + " tour.";
    }



    // Setter for tourType
    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public String getGuide(){
        return guide;
    }

    public String getTourType(){
        return tourType;
    }

    public String dolphinDescription(){
        return "Dolphins are highly intelligent marine mammals known for their playful behavior and acrobatic flips.";
    }

    public String turtleDecsription(){
        return "Turtles, with their distinctive shells and slow movements, are often seen gracefully swimming in the ocean \nduring breeding season they come out to the beach and lay eggs";
    }
}

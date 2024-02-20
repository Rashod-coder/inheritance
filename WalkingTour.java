// Subclass representing a walking tour
class WalkingTour extends Tour {
    private int distanceInKilometers;
    private String guide;
    private String sight;

    // Constructor
    public WalkingTour(String name, double price, int durationInHours, int distanceInKilometers, String guide, String sight) {
        super(name, price, durationInHours);
        this.distanceInKilometers = distanceInKilometers;
        this.guide = guide;
        this.sight = sight;
    }

    // Overridden method
    @Override
    public String getDescription() {
        return "Explore the area on foot with this walking tour, covering a distance of " + distanceInKilometers + " kilometers with guide " + guide + ".";
    }

    public void setSight(String sight) {
        this.sight = sight;
    }

    public int getDistanceInKilometers() {
        return distanceInKilometers;
    }

    public void setDistanceInKilometers(int distanceInKilometers) {
        this.distanceInKilometers = distanceInKilometers;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

    public String getSight() {
        return sight;
    }
}

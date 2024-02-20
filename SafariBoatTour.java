class SafariBoatTour extends Tour {

    private boolean includesWildlifeSpotting;
    private String guide;

    // Constructor
    public SafariBoatTour(String name, double price, int durationInHours,String guide, boolean includesWildlifeSpotting) {
        super(name, price, durationInHours);
        this.includesWildlifeSpotting = includesWildlifeSpotting;
        this.guide = guide;
    }

    // Overridden method
    @Override
    public String getDescription() {
        String wildlifeSpottingInfo = includesWildlifeSpotting ? " with opportunities for wildlife spotting" : "";
        return "Embark on an adventurous safari boat tour and explore its wildlife and landscapes" + wildlifeSpottingInfo + ".";
    }

    // Setter for includesWildlifeSpotting
    public void setIncludesWildlifeSpotting(boolean includesWildlifeSpotting) {
        this.includesWildlifeSpotting = includesWildlifeSpotting;
    }

    // Assuming you have getters/setters for inherited properties from the Tour class, otherwise add them here
    // For example, setter for the name
    public void setName(String name) {
        super.setName(name);
    }

    // Setter for the price
    public void setPrice(double price) {
        super.setPrice(price);
    }

    // Setter for the durationInHours
    public void setDurationInHours(int durationInHours) {
        super.setDurationInHours(durationInHours);
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getGuide(){
        return guide;
    }
}

class SafariTour extends Tour {
    // Additional properties specific to safari tours
    protected String guide;

    // Constructor
    public SafariTour(String name, double price, int durationInHours, String guide) {
        super(name, price, durationInHours);
        this.guide = guide;
    }

    // Overridden method
    @Override
    public String getDescription() {
        return "This safari tour explores the wilderness with " + guide + ".";
    }

    public void setGuide(String guide){
        this.guide = guide;
    }
    @Override
    public void setPrice(double price){
        this.price = price;
    }

    public String getGuide(){
        return guide;
    }
}
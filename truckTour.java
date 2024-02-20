 class TruckTour extends SafariTour {
    private String truckType;

    // Constructor
    public TruckTour(String name, double price, int durationInHours, String guide, String truckType) {
        super(name, price, durationInHours, guide);
        this.truckType = truckType;
    }

    // Getter for truckType
    public String getTruckType() {
        return truckType;
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " Travel in a rugged " + truckType + ".";
    }


    public String getGuide() {
        return guide;
    }

    public double getPrice() {
        return price;
    }

    public int getDurationInHours() {
        return durationInHours;
    }
}

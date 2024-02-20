 class ATVTour extends SafariTour {
    private String car;

    // Constructor
    public ATVTour(String name, double price, int durationInHours, String guide, String car) {
        super(name, price, durationInHours, guide);
        this.car = car;
    }

    // Getter for car
    public String getCar() {
        return car;
    }

    // Setter for car
    public void setCar(String car) {
        this.car = car;
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " Ride a powerful " + car + " through adventurous trails.";
    }


    public double getPrice() {
        return price;
    }

    // Setter for price
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for guide
    public String getGuide() {
        return guide;
    }

    // Setter for guide
    public void setGuide(String guide) {
        this.guide = guide;
    }
}

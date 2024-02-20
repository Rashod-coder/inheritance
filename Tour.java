abstract class Tour {

    protected String name;
    protected double price;
    protected int durationInHours;


    public Tour(String name, double price, int durationInHours) {
        this.name = name;
        this.price = price;
        this.durationInHours = durationInHours;
    }


    public abstract String getDescription();


    public void setPrice(double price) {
        this.price = price;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

    public void setName(String name) {
    }
}
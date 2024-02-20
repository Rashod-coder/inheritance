public class animals {
    private String name;
    private String diet;
    private String description;
    private int lifespan;

    public animals(String name, String diet, String description, int lifespan) {
        this.name = name;
        this.diet = diet;
        this.description = description;
        this.lifespan = lifespan;
    }

    public String getName() {
        return name;
    }

    public String getDiet() {
        return diet;
    }

    public String getDescription() {
        return description;
    }

    public int getLifespan() {
        return lifespan;
    }

    public static void main(String[] args) {

    }
}

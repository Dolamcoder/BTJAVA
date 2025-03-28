package Model;
public class Food {
    private String name;
    private String id;
    private double price;
    private String description;
    private int calories;

    public Food(String name, String id, double price, String description, int calories) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.description = description;
        this.calories = calories;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}


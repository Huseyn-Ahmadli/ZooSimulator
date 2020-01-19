public class Food {
    private String name;
    private int foodHealth;
    private int foodWaste;

    public Food(String name, int health, int waste) {
        this.name = name;
        this.foodHealth = health;
        this.foodWaste = waste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return foodHealth;
    }

    public void setHealth(int health) {
        this.foodHealth = health;
    }

    public int getWaste() {
        return foodWaste;
    }

    public void setWaste(int waste) {
        this.foodWaste = waste;
    }
}

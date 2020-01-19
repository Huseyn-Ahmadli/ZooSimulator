import java.util.ArrayList;
import java.util.HashMap;

public class FoodInfo {
    static ArrayList<Food> foods = new ArrayList<Food>();

    public static void addFoodTypes() {
        foods.add(new Food("hay", 1, 4));
        foods.add(new Food("steak", 3, 4));
        foods.add(new Food("fruit", 2, 3));
        foods.add(new Food("celery", 0, 1));
        foods.add(new Food("fish", 3, 2));
        foods.add(new Food("ice cream", 1, 3));
    }
}
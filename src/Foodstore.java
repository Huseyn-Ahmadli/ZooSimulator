import java.util.HashMap;
import java.util.Map;

public class Foodstore {


    Map<Food, Integer> store = new HashMap<Food, Integer>();


    public void addFood(Food food, int quantity) {
        // Making sure the quantity is a positive number
        if (store.containsKey(food)) {
            store.put(food, store.get(food) + quantity);
        } else {
            store.put(food, quantity);
        }
    }

    public int getStoreSize() {
        int storeSize = 0;
        for (Map.Entry<Food, Integer> myFoods : store.entrySet()
        ) {
            storeSize += myFoods.getValue();
        }

        return storeSize;
    }

    public void takeFood(Food food) {
        for (Map.Entry<Food, Integer> m : store.entrySet()) {
            if (food == m.getKey() && m.getValue() > 0) {
                m.setValue(m.getValue() - 1);
            }
        }
    }


}


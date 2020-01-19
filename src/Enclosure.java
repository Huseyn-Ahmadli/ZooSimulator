import java.sql.SQLOutput;
import java.util.ArrayList;

public class Enclosure {
    ArrayList<Animal> animalList = new ArrayList<Animal>();
    private Foodstore encFoodstore = new Foodstore();
    private int wasteSize;
private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Enclosure() {
        this.encFoodstore = new Foodstore();
    }

    public void addAnimal(Animal _animal) {

        animalList.add(_animal);
        _animal.setEnclosure(this);

    }

    public void removeAnimal(Animal animal) {
        if (animalList.contains(animal)) {
            animalList.remove(animal);
        }
    }

    public void removeWaste(int countWaste) {
        wasteSize = wasteSize - countWaste;
        if (wasteSize < 0) {
            wasteSize = 0;
        }

    }

    public String getName() {
//        String name;
//        if (animalList.size() > 0) {
//            name = animalList.get(0).getClass().getName();
//        } else {
//            name ="";
//        }
        return name;
    }


    public Foodstore getEncFoodstore() {
        return encFoodstore;
    }

    public void addWaste(int countWaste) {
        wasteSize = wasteSize + countWaste;
    }

    public int getWasteSize() {
        return wasteSize;
    }

    public int size() {
        return animalList.size();
    }

    public void aMonthPasses() {
        for (Animal myAnimal : animalList
        ) {
            myAnimal.aMonthPasses();
        }
        if(encFoodstore.getStoreSize()>0 && animalList.size()>0 ) {
            System.out.println("Total amount of foods in " + getName() + "'s enclosure are: " + encFoodstore.getStoreSize());

        }
        if(getWasteSize()>0) {
            System.out.println("Total Collected waste size on " + getName() + "'s enclosure are " + getWasteSize());
        }
        if(this.animalList.size() > 0){
            System.out.println("Sum of animals in the enclosure of " + getName() + "'s are " + size());
        }

    }


}

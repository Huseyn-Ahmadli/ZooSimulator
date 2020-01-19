import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Zoo {
    static ArrayList<Animal> zooAnimals = new ArrayList<>();
    ArrayList<Zookeeper> zooZookeepers = new ArrayList<>();
    ArrayList<Enclosure> zooEnclosures = new ArrayList<>();
    static Foodstore zooFoodStore = new Foodstore();


    public static Foodstore getZooFoodStore() {
        return zooFoodStore;
    }

    public void setZooFoodStore(Foodstore zooFoodStore) {
        this.zooFoodStore = zooFoodStore;
    }

    public Zoo() {

        zooFoodStore = new Foodstore();

    }

    public void initializeZoo() throws Exception {

        Scanner sc = null;
        File file = new File("C:\\Users\\Huseyn\\Desktop\\ZooTasks 2-1\\src\\zoo.txt");
        Map<String, String[]> map = new HashMap<>();


        try {
            int count = 0;
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                count++;
                String line = sc.nextLine();
                if (!line.contains(":")) {
                    System.out.println("Skipped double doc in the " + count + " line. Please check and rerun again");
                    System.exit(0);
                }
                String[] parts = line.split(":", 2);
//                if (parts.length >= 2) {

                String key = parts[0];
                String[] value = parts[1].split(",");

                int k = 1;

                switch (key.toLowerCase()) {

                    case ("steak"):
                        if (!zooFoodStore.store.containsKey(FoodInfo.foods.get(1)))
                            zooFoodStore.store.put(FoodInfo.foods.get(1), Integer.parseInt(value[0]));
                        else
                            zooFoodStore.store.put(FoodInfo.foods.get(1), zooFoodStore.store.get(FoodInfo.foods.get(1)) + Integer.parseInt(value[0]));
                        break;
                    case ("hay"):
                        if (!zooFoodStore.store.containsKey(FoodInfo.foods.get(0)))
                            zooFoodStore.store.put(FoodInfo.foods.get(0), Integer.parseInt(value[0]));
                        else
                            zooFoodStore.store.put(FoodInfo.foods.get(0), zooFoodStore.store.get(FoodInfo.foods.get(0)) + Integer.parseInt(value[0]));
                        break;
                    case ("fruit"):
                        if (!zooFoodStore.store.containsKey(FoodInfo.foods.get(2)))
                            zooFoodStore.store.put(FoodInfo.foods.get(2), Integer.parseInt(value[0]));
                        else
                            zooFoodStore.store.put(FoodInfo.foods.get(2), zooFoodStore.store.get(FoodInfo.foods.get(2)) + Integer.parseInt(value[0]));
                        break;
                    case ("celery"):
                        if (!zooFoodStore.store.containsKey(FoodInfo.foods.get(3)))
                            zooFoodStore.store.put(FoodInfo.foods.get(3), Integer.parseInt(value[0]));
                        else
                            zooFoodStore.store.put(FoodInfo.foods.get(3), zooFoodStore.store.get(FoodInfo.foods.get(3)) + Integer.parseInt(value[0]));
                        break;
                    case ("fish"):
                        if (!zooFoodStore.store.containsKey(FoodInfo.foods.get(4)))
                            zooFoodStore.store.put(FoodInfo.foods.get(4), Integer.parseInt(value[0]));
                        else
                            zooFoodStore.store.put(FoodInfo.foods.get(4), zooFoodStore.store.get(FoodInfo.foods.get(4)) + Integer.parseInt(value[0]));
                        break;
                    case ("ice cream"):
                        if (!zooFoodStore.store.containsKey(FoodInfo.foods.get(5)))
                            zooFoodStore.store.put(FoodInfo.foods.get(5), Integer.parseInt(value[0]));
                        else
                            zooFoodStore.store.put(FoodInfo.foods.get(5), zooFoodStore.store.get(FoodInfo.foods.get(5)) + Integer.parseInt(value[0]));
                        break;

                    case ("playzookeper"):
                        if (value[0].length() != 0) k = Integer.parseInt(value[0]);
                        for (int i = 0; i < k; i++) {
                            zooZookeepers.add(new PlayZookeeper(zooEnclosures));
                            System.out.println(zooZookeepers.get(zooZookeepers.size() - 1).getClass().getName() + " " + zooZookeepers.get(zooZookeepers.size() - 1).name + " yarandi");
                        }
                        break;
                    case ("zookeper"):
                        if (value[0].length() != 0) k = Integer.parseInt(value[0]);
                        for (int i = 0; i < k; i++) {
                            zooZookeepers.add(new Zookeeper(zooEnclosures));
                            System.out.println(zooZookeepers.get(zooZookeepers.size() - 1).getClass().getName() + " " + zooZookeepers.get(zooZookeepers.size() - 1).name + " yarandi");
                        }
                        break;
                    case ("physiozookeper"):
                        if (value[0].length() != 0) k = Integer.parseInt(value[0]);
                        for (int i = 0; i < k; i++) {
                            zooZookeepers.add(new PhysioZookeeper(zooEnclosures));
                            System.out.println(zooZookeepers.get(zooZookeepers.size() - 1).getClass().getName() + " " + zooZookeepers.get(zooZookeepers.size() - 1).name + " yarandi");
                        }
                        break;

                    case ("enclosure"):
                        addNewEnclosure(1);
                        zooEnclosures.get(zooEnclosures.size() - 1).addWaste(Integer.parseInt(value[0]));
                        break;

                    case ("lion"):
                        addAnimalProperties(new Lion(Integer.parseInt(value[1]), value[0].toLowerCase().charAt(0), Integer.parseInt(value[2])), value);
                        break;
                    case ("tiger"):
                        addAnimalProperties(new Tiger(Integer.parseInt(value[1]), value[0].toLowerCase().charAt(0), Integer.parseInt(value[2])), value);
                        break;
                    case ("elephant"):
                        addAnimalProperties(new Elephant(Integer.parseInt(value[1]), value[0].toLowerCase().charAt(0), Integer.parseInt(value[2])), value);
                        break;
                    case ("giraffe"):
                        addAnimalProperties(new Giraffe(Integer.parseInt(value[1]), value[0].toLowerCase().charAt(0), Integer.parseInt(value[2])), value);
                        break;
                    case ("bear"):
                        addAnimalProperties(new Bear(Integer.parseInt(value[1]), value[0].toLowerCase().charAt(0), Integer.parseInt(value[2])), value);
                        break;
                    case ("penguin"):
                        addAnimalProperties(new Penguin(Integer.parseInt(value[1]), value[0].toLowerCase().charAt(0), Integer.parseInt(value[2])), value);
                        break;
                    case ("gorilla"):
                        addAnimalProperties(new Gorilla(Integer.parseInt(value[1]), value[0].toLowerCase().charAt(0), Integer.parseInt(value[2])), value);
                        break;
                    case ("chimpanzee"):
                        addAnimalProperties(new Chimpanzee(Integer.parseInt(value[1]), value[0].toLowerCase().charAt(0), Integer.parseInt(value[2])), value);
                        break;
                }

            }

        } catch (FileNotFoundException e) {

            System.out.println("File tapilmadı");
        } catch (NumberFormatException e) {

            System.out.println("Reqemler duzgun daxil edilmeyib: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Eynive boyudu hamisin yaz: " + e.getMessage());
            System.exit(0);
        } catch (IndexOutOfBoundsException e) {

            System.out.println("Ele bir enclousure yoxdur " + e.getMessage());
            System.exit(0);
        }
        sc.close();
    }


    public void addNewEnclosure(int countOfEnclosures) {
        for (int i = 0; i < countOfEnclosures; i++) {
            zooEnclosures.add(new Enclosure());
        }
    }

    public void go() {
        for (Map.Entry<Food, Integer> z : zooFoodStore.store.entrySet()
        ) {
            System.out.println("Count of " + z.getKey().getName() + " in zooFoodstore - " + z.getValue().toString());
        }

        int monthCount = 0;
        while (zooAnimals.size() > 0) {
            aMonthPasses();
            monthCount++;
            System.out.println(monthCount + " months passed");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

        }
        for (Map.Entry<Food, Integer> zooFood : zooFoodStore.store.entrySet()
        ) {
            System.out.println("There are " + zooFood.getValue() + " " + zooFood.getKey().getName() + " in the ZooFoodStore");
        }
    }

    public void addAnimalProperties(Animal animal, String[] value) {
        zooAnimals.add(animal);
        zooEnclosures.get(zooEnclosures.size() - 1).setName(zooAnimals.get(zooAnimals.size() - 1).getClass().getName());
        if (value.length <= 3) {
            zooEnclosures.get(zooEnclosures.size() - 1).addAnimal(zooAnimals.get(zooAnimals.size() - 1));
        } else {
            zooEnclosures.get(Integer.parseInt(value[3]) - 1).addAnimal(zooAnimals.get(zooAnimals.size() - 1));
        }
        System.out.println(zooAnimals.get(zooAnimals.size() - 1).getClass().getName() + " " + zooAnimals.get(zooAnimals.size() - 1).getName() + " yaradıldı.");
    }

    public void aMonthPasses() {
        for (Zookeeper myZookeep : zooZookeepers
        ) {
            myZookeep.aMonthPasses();
        }

        for (Enclosure myEnc : zooEnclosures
        ) {
            myEnc.aMonthPasses();
        }


    }

}

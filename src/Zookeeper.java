import java.util.ArrayList;
import java.util.Random;

public class Zookeeper {
    ArrayList<Enclosure> zookeeperEnclosure = new ArrayList<>();

    String name;

    public Zookeeper(ArrayList<Enclosure> zookeeperEnclosure) {
        Random rndm = new Random();
        this.name = NameList.zookeperNamesList.get(rndm.nextInt(NameList.zookeperNamesList.size()));
        this.zookeeperEnclosure = zookeeperEnclosure;
    }

    public void treat(Animal animal){

        if(animal.getClass().getName().equals("Lion")|| animal.getClass().getName().equals("Tiger")|| animal.getClass().getName().equals("Bear")){
            System.out.println(animal.getClass().getName() + " " + animal.getName() + " treated by " + this.getClass().getName()+ " " + name);
            animal.treat();

        }
    }

    public void aMonthPasses() {
        Random rnd = new Random();
        int countOfMovedFood = 0;
        int countOfRemovedWaste = 0;
        int countOfRemovedAnimal = 0;
        int countOfthreats =0;
        String diedAnimalsnames="";

        for (Enclosure myEnc : zookeeperEnclosure
        ) {
            ArrayList<Animal> diedAnimals = new ArrayList<>();
            for (Animal myAnimal : myEnc.animalList
            ) {
                if(!myAnimal.isAlive()) diedAnimals.add(myAnimal);
                if (countOfMovedFood < 20 && myEnc.animalList.size() > myEnc.getEncFoodstore().getStoreSize()) {
                    countOfMovedFood++;
                    int i = rnd.nextInt(2);

                    if(Zoo.zooFoodStore.store.containsKey(myAnimal.getEats()[i])) {
                        if (Zoo.zooFoodStore.store.get(myAnimal.getEats()[i]) > 0) {
                            Zoo.getZooFoodStore().takeFood(myAnimal.getEats()[i]);
                            myEnc.getEncFoodstore().addFood(myAnimal.getEats()[i], 1);
                        }
//                        else {System.out.println("There is no food in the ZooFoodStore for " + myAnimal.getClass().getName());}
                    }else if(Zoo.zooFoodStore.store.containsKey(myAnimal.getEats()[(1-i)%2])){
                        if (Zoo.zooFoodStore.store.get(myAnimal.getEats()[(1-i)%2]) > 0) {
                            Zoo.getZooFoodStore().takeFood(myAnimal.getEats()[(1-i)%2]);
                            myEnc.getEncFoodstore().addFood(myAnimal.getEats()[(1-i)%2], 1);
                        }
                    }
                    else {
                        System.out.println("There is no food in the ZooFoodStore for " + myAnimal.getClass().getName());
                    }


                }
                if (myAnimal.getHealth() > 0 && myAnimal.getHealth() <5 && countOfthreats<2) {
                    treat(myAnimal);
                    countOfthreats++;
                   ;
                }
            }
            for (Animal diedAnimal: diedAnimals
            ) {
                myEnc.animalList.remove(diedAnimal);
                Zoo.zooAnimals.remove(diedAnimal);
                countOfRemovedAnimal++;
                if(!diedAnimalsnames.equals("")) diedAnimalsnames =diedAnimalsnames + ", ";

                diedAnimalsnames +=  diedAnimal.getClass().getName() + " " + diedAnimal.getName();

            }
            while (countOfRemovedWaste < 20 && myEnc.getWasteSize() > 0) {
                myEnc.removeWaste(1);
                countOfRemovedWaste++;
            }
        }




            if (countOfMovedFood > 0) {
                System.out.println(getClass().getName() + " " + name +" moved " + countOfMovedFood + " count of foods.");
            }
            if (countOfRemovedWaste > 0) {
                System.out.println(getClass().getName() + " " + name+" removed " + countOfRemovedWaste + " wastes.");
            }
            if (countOfRemovedAnimal > 0) {
                System.out.println(getClass().getName() + " " + name + " removed " + diedAnimalsnames + " from enclosure." );
                System.out.println(getClass().getName() + " " + name +" removed " + countOfRemovedAnimal + " animals.");
            }

//        System.out.println("Zookeper " + name + " moved " + countOfMovedFood + " count of foods, and removed " + countOfRemovedWaste + " wastes and the number of removed animals are: " + countOfRemovedAnimal);
    }

    ;
}

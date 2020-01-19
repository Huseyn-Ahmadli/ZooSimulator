import java.util.ArrayList;

public class PhysioZookeeper extends Zookeeper {
    public PhysioZookeeper(ArrayList<Enclosure> zookeeperEnclosure) {
        super(zookeeperEnclosure);
    }

    @Override
    public void treat(Animal animal) {
        if (animal.getClass().getName().equals("Elephant") || animal.getClass().getName().equals("Giraffe")) {
            animal.treat();
            System.out.println(animal.getClass().getName() + " " + animal.getName() + " treated by " + this.getClass().getName()+ " " + name);
        }
    }
}

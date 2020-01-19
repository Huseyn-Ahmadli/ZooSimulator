import java.util.ArrayList;

public class PlayZookeeper extends Zookeeper {
    public PlayZookeeper(ArrayList<Enclosure> zookeeperEnclosure) {
        super(zookeeperEnclosure);
    }

    @Override
    public void treat(Animal animal) {
        if (animal.getClass().getName().equals("Gorilla") || animal.getClass().getName().equals("Chimpanzee") || animal.getClass().getName().equals("Penguin")) {
            animal.treat();
            System.out.println(animal.getClass().getName() + " " + animal.getName() + " treated by " + this.getClass().getName()+ " " + name);
        }
    }
}

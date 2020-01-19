import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public abstract class Animal {
    private int age;
    private char gender;
    private Food[] eats;
    private int health;
    private int lifeExpectancy;
    private Enclosure enclosure;
    private String name;

    public Animal(int animalAge, char animalGender, Food[] canEatThis, int animalHealth, int animalLifeExpectancy){
        Random rndm = new Random();
        this.age = animalAge;
        this.name = NameList.animalNamesList.get(rndm.nextInt(NameList.animalNamesList.size()));
        this.gender = animalGender;

        this.eats = canEatThis;

        setHealth(animalHealth);
        this.lifeExpectancy = animalLifeExpectancy;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int can) {
        if (can >= 10) {
            this.health = 10;
        } else if (can <= 0) {
            this.health = 0;
            System.out.println(getClass().getName() + " " + this.name + " health is "+ this.getHealth() + " and " + " was died");
        } else {
            this.health = can;
        }
    }

    public Food[] getEats() {
        return eats;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void increaseAge() {
        ++this.age;
    }


    public char getGender() {
        return gender;
    }

    public int getlifeExpectancy() {
        return lifeExpectancy;
    }

    public void increaseHealth(int healthPoints) {
        if (healthPoints > 0) {
            System.out.println(getClass().getName() + " " + getName() + " gains " + healthPoints + " health points; ");
            setHealth(health + healthPoints);
            System.out.println(getClass().getName() + " " + name + " health is "+ this.getHealth());

        }
    }
//    public void increaseHealth() {
//        increaseHealth(1);
//    }

    public void eat() {
        Random rndm = new Random();
        ArrayList<Food> foodsThatCanEat = new ArrayList<>();
        for (Food food : eats
        ) {
            if(enclosure.getEncFoodstore().store.containsKey(food)){
                if (enclosure.getEncFoodstore().store.get(food) > 0) {
                    foodsThatCanEat.add(food);
                }
            }
        }

        if (foodsThatCanEat.size() > 0) {
            int i = rndm.nextInt(foodsThatCanEat.size());
            enclosure.getEncFoodstore().takeFood(foodsThatCanEat.get(i));

            enclosure.addWaste(foodsThatCanEat.get(i).getWaste());
            System.out.println(this.getClass().getName() + " " + this.name + " eats " + foodsThatCanEat.get(i).getName() + " and increase health by " + foodsThatCanEat.get(i).getHealth() + " and added waste size of " + foodsThatCanEat.get(i).getWaste());
            increaseHealth(foodsThatCanEat.get(i).getHealth());
        } else {
            System.out.println("There is no food in foodstore for " + this.getClass().getName() + " " + this.name);
        }

    }

    ;

    public void decreaseHealth() {
        setHealth(this.health-2);

    }

    public abstract void treat();


    public boolean isAlive() {

        if (this.getHealth() <= 0) {
            System.out.println(this.getClass().getName() + " " + this.name + " Passed due to health decrease");
            return false;
        } else if (this.getAge() == this.lifeExpectancy){
            System.out.println(this.getClass().getName() + " " + this.name + " Devil bring him/her to Hell");
            return false;
        }

            return true;
    }

    public void setEnclosure(Enclosure animalEnclosure) {
        this.enclosure = animalEnclosure;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void aMonthPasses() {
        this.eat();
        this.increaseAge();
        this.decreaseHealth();
//        System.out.println(getClass().getName() + " " + name + " health is "+ this.getHealth());


    }
};



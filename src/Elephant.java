public class Elephant extends Animal {

    public Elephant(int yas, char cins, int can){
        super(yas, cins, new Food[]{FoodInfo.foods.get(0),FoodInfo.foods.get(2)}, can, 36);
    }

    @Override
    public void treat(){
        System.out.println(getClass().getName() + " " + getName() + " takes a bath; ");
        bath();
    }

    public void bath(){
        increaseHealth(5);
    }


}

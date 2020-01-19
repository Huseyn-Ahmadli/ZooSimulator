public class Bear extends Animal {

    public Bear(int yas, char cins, int can){
        super(yas, cins, new Food[]{FoodInfo.foods.get(1),FoodInfo.foods.get(4)}, can, 18);
    }

       @Override
    public void treat(){
        System.out.println(getClass().getName() + " " + getName() + " gets a hug; ");
        hug();
    }

    public void hug(){
        increaseHealth(3);
    }


}

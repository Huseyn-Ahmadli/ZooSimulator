public class Giraffe extends Animal {

    public Giraffe(int yas, char cins, int can){
        super(yas, cins, new Food[]{FoodInfo.foods.get(0),FoodInfo.foods.get(2)}, can, 28);
    }

    @Override
    public void treat(){
        System.out.println(getClass().getName() + " " + getName() +  " gets a neck massage; ");
        neckMassage();
    }

    public void neckMassage(){
        increaseHealth(4);
    }


}

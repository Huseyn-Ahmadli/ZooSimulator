public class Penguin extends Animal {

    public Penguin(int yas, char cins, int can) throws Exception {
        super(yas, cins, new Food[]{FoodInfo.foods.get(4),FoodInfo.foods.get(5)}, can, 15);
    }

    @Override
    public void treat(){
        System.out.println(getClass().getName() + " " + getName() + " is watching a film; ");
        watchAFilm();
    }

    public void watchAFilm(){
        increaseHealth(2);
    }


}

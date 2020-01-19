public abstract class Ape extends Animal {
    public Ape(int yas, char cins,  int can, int omur){
        super(yas, cins, new Food[]{FoodInfo.foods.get(2),FoodInfo.foods.get(5)}, can, omur);
    }

    @Override
    public abstract void treat();
}


public abstract class BigCat extends Animal {

    public BigCat(int yas, char cins, int can){
        super(yas, cins, new Food[]{FoodInfo.foods.get(3), FoodInfo.foods.get(1)},can, 24);
    }

    public BigCat(int yas, char cins, Food[] canEatThis, int can, int omur){
        super(yas, cins, canEatThis, can, omur);
    }



    @Override
    public abstract void treat();
    }





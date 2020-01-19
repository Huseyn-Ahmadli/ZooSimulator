public class Lion extends BigCat {

    public Lion(int yas, char cins, int can){
        super(yas, cins, can);
    }

    @Override
    public void treat(){
        System.out.println(getClass().getName() + " " + getName() + " gets to stroked");
        stroked();
    }

    public void stroked(){
        increaseHealth(2);
    }


}

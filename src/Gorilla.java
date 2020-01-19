public class Gorilla extends Ape {
    public Gorilla(int yas, char cins, int can){
        super(yas, cins, can, 32);
    }

    @Override
    public void treat(){
        System.out.println(getClass().getName() + " " + getName() + " stardet to paint.");
        painting();
    }

    public void painting(){
        increaseHealth(4);
    }


}

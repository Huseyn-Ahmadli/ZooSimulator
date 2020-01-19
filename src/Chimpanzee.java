public class Chimpanzee extends Ape {
    public Chimpanzee(int yas, char cins, int can){
        super(yas, cins, can, 24);
    }

    @Override
    public void treat(){
        System.out.println("gets to play Chase; ");
        playChase();
    }

    public void playChase(){
        increaseHealth(4);
    }

}

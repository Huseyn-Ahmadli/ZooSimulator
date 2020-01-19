import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) throws Exception {
                NameList.addNamesToList();
                FoodInfo.addFoodTypes();
        Zoo myZoo = new Zoo();
              myZoo.initializeZoo();

        myZoo.go();




    }
}

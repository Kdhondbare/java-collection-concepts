import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Insertion order is maintained.
public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> fruitsNames = new LinkedHashSet<>();

        fruitsNames.add("Mango");
        fruitsNames.add("Apple");
        fruitsNames.add("Guava");
        fruitsNames.add("Orange");

        System.out.println("-----------------------");
        System.out.println("isEmpty set ? " + fruitsNames.isEmpty());
        System.out.println("-----------------------");
        System.out.println("size : " + fruitsNames.size());
        System.out.println("-----------------------");
        for (String fruitName : fruitsNames){
            System.out.println("Name : " + fruitName);
        }

        System.out.println("-----------------------");
        fruitsNames.remove("Apple");

        for (String fruitName : fruitsNames){
            System.out.println("Name : " + fruitName);
        }
        System.out.println("-----------------------");
        System.out.println("size : " + fruitsNames.size());
    }
}

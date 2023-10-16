import java.util.HashSet;
import java.util.Set;

//Insertion order is not maintained.
public class HashSetExample {

    public static void main(String[] args) {
        Set<String> fruitsNames = new HashSet<>();

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
        fruitsNames.forEach(item -> System.out.println("item"));
        System.out.println("-----------------------");
        System.out.println("size : " + fruitsNames.size());
        System.out.println("-----------------------");
    }
}

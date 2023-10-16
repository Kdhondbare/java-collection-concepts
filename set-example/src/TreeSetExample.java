import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Elements are stored in sorted order.
public class TreeSetExample {

    public static void main(String[] args) {
        Set<String> fruitsNames = new TreeSet<>();

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

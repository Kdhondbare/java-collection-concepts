import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExceptionExample2 {

    public static void main(String[] args) {

        Map<String, Long> phoneBook = new ConcurrentHashMap<>();

        phoneBook.put("Vikram", 8965321487L);
        phoneBook.put("Mike", 5896541236L);
        phoneBook.put("Jim", 8745123658L);
        System.out.println(phoneBook);

        Iterator<String> keyIterator = phoneBook.keySet().iterator();//3 elements

        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            System.out.println("key = " + key);
            if ("Vikram".equals(key)){
                keyIterator.remove();//this works and remove element from map
                phoneBook.remove("Jim");//remove element from map is allowed
            }
        }
        System.out.println(phoneBook);
    }
}

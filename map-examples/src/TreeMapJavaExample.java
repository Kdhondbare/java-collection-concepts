import java.util.Map;
import java.util.TreeMap;

public class TreeMapJavaExample {

    public static void main(String[] args) {
        Map<String, Long> myPhonebook = new TreeMap<>();

        myPhonebook.put("Vikram", 1234123412L);

        myPhonebook.put("Komal", 2345234523L);
        myPhonebook.put("Komal", 1212121212L);

        myPhonebook.put("Bhagyashree", 3456345634L);
        myPhonebook.put("Abhi", null);

        System.out.println(myPhonebook);

        for (String key : myPhonebook.keySet()) {
            System.out.println("key = " + key);
        }

        for (Map.Entry<String, Long> entry : myPhonebook.entrySet()) {
            System.out.println("K = " + entry.getKey() + " V = " + entry.getValue());
        }
    }
}

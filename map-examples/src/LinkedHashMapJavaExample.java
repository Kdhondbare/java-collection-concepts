import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapJavaExample {

    public static void main(String[] args) {
        Map<String, Long> myphonebook = new LinkedHashMap<>();

        myphonebook.put("Vikram", 1234123412L);

        myphonebook.put("Komal", 2345234523L);
        myphonebook.put("Komal", 1212121212L);

        myphonebook.put("Bhagyashree", 3456345634L);
        myphonebook.put(null, null);
        myphonebook.put("abc", null);

        myphonebook.remove(null);

        System.out.println(myphonebook);

        for (String key : myphonebook.keySet()) {
            System.out.println("key = " + key);
        }

        for (Map.Entry<String, Long> entry : myphonebook.entrySet()) {
            System.out.println("K = " + entry.getKey() + " V = " + entry.getValue());
        }
    }
}

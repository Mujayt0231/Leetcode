import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractice {

    // Hashmap practice
    public static void main(String[] args) {

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("Occupation", "Doctor");
        hashmap.put("Doctor", "Occupation");

        System.out.println(hashmap.entrySet());

        for (String string : hashmap.keySet()) {
            System.out.println(string);
        }

        for (Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println(entry);
        }

    }

}

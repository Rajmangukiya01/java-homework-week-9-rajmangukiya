package homework;

/* Create a HashMap object called people that will store String keys and Integer
   values: And use for each loop to iterate the value from Map */

import java.util.HashMap;
import java.util.Map;

public class Program9 {
    public static void main(String[] args) {
        useMap();
    }

    public static void useMap() {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("First person", 1);
        people.put("Second person", 2);
        people.put("Third person", 3);
        people.put("Fourth person", 4);
        people.put("Fifth person", 5);

        for (Map.Entry<String, Integer> person : people.entrySet()) {
            System.out.println(person);
        }
    }
}


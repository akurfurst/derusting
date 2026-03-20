import java.util.*;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> map = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    for(int i = 0; i < 3; i++){
      map.put("Test" + (i+1), (i+1) * 13);
    }
    System.out.println(map.toString());
    // Get the value associated with a given key in the Map
    System.out.println(map.get("Test3"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println(map.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    map.put("Test1", 1);
    System.out.println(map.toString());
    // Check whether the Map contains a given key
    System.out.println(map.containsKey("Test0"));
    System.out.println(map.containsKey("Test1"));
    // Check whether the Map contains a given value
    System.out.println();
    System.out.println(map.containsValue(0));
    System.out.println(map.containsValue(1));
    // Iterate over the keys of the Map, printing each key
    System.out.println();
    for(String x : map.keySet()){
      System.out.println(x);
    }
    // Iterate over the values of the map, printing each value
    System.out.println();
    for(int x : map.values()){
      System.out.println(x);
    }
    // Iterate over the entries in the map, printing each key and value
    map.forEach((s, x) -> System.out.println("[" + s + ", " + x + "]"));
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}

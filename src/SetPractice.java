import java.util.*;
public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> set = new HashSet<>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    for(int i = 0; i < 3; i++){
      set.add("Test" + (i+1));
    }
    System.out.println(set.toString());
    // Check whether the Set contains a given String
    System.out.println(set.contains("Test0"));
    System.out.println(set.contains("Test1"));
    // Remove an element from the Set
    set.remove("Test3");
    System.out.println(set);
    // Get the size of the Set
    System.out.println(set.size());
    // Iterate over the elements of the Set, printing each one on a separate line
    for(String x : set){
      System.out.println(x);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}

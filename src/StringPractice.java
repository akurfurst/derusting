import java.util.*;
public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String s1 = "Test1";
    // Find the length of the string
    System.out.println(s1.length());
    // Concatenate (add) two strings together and reassign the result
    String s2 = s1 + "abc";
    System.out.println(s2);
    // Find the value of the character at index 3
    System.out.println(s2.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(s2.contains("abc"));
    // Iterate over the characters of the string, printing each one on a separate line
    System.out.println();
    for(int i = 0; i < s2.length(); i++){
      System.out.println(s2.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> list = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    for(int i = 0; i < 10; i++){
      list.add("Test" + (i+1));
    }
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println(list.toString());
    // Check whether two strings are equal
    System.out.println(s1.equals(list.get(0)));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}

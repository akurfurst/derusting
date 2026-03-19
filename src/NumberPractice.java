public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float f1 = -1.04f;
    System.out.println(f1);
    // Create an int with a positive value and assign it to a variable
    int n1 = 16;
    System.out.println(n1);
    // Use the modulo % operator to find the remainder when the int is divided by 3
    System.out.println(n1%3);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if(n1 % 2 == 0) System.out.println("Even");
    else System.out.println("Odd");
    // Divide the number by another number using integer division
    System.out.println(n1/4);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}

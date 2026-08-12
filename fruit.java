package fruit;
import java.util.Vector;

public class FruitVectorExample {
    public static void main(String[] args) {
        // Create a Vector to store String elements
        Vector<String> fruits = new Vector<>();

        // Add 5 fruit names to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Display each fruit on a new line using enhanced for loop
        System.out.println("List of Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

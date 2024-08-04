import java.util.ArrayList;
import java.util.HashMap;

public class WrapperClassExample {

    public static void main(String[] args) {
        // 1. Collection Framework Compatibility
        // Using ArrayList with Wrapper Class (Integer)
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10); // Autoboxing: int to Integer
        numberList.add(20);
        numberList.add(30);
        System.out.println("ArrayList of Integers: " + numberList);

        // Using HashMap with Wrapper Classes (Integer and Double)
        HashMap<Integer, Double> map = new HashMap<>();
        map.put(1, 99.99); // Autoboxing: int to Integer, double to Double
        map.put(2, 199.99);
        System.out.println("HashMap of Integer keys and Double values: " + map);

        // 2. Utility Methods
        // Converting String to int using Integer.parseInt()
        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println("Parsed int from String: " + num);

        // Converting int to String using Integer.toString()
        int number = 200;
        String str = Integer.toString(number);
        System.out.println("String representation of int: " + str);

        // 3. Thread Safety
        // Synchronizing on an Integer object
        Integer count = 0;
        synchronized (count) {
            count = count + 1; // Autoboxing and Unboxing
            System.out.println("Synchronized count: " + count);
        }

        // 4. Default Values in Collections
        // Using null to represent absence of a value in ArrayList
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(null); // Represents a missing score
        scores.add(85);
        System.out.println("ArrayList with a null value: " + scores);

        // 5. Flexibility and Interoperability
        // Method accepting Integer (Wrapper Class)
        printNumber(42); // Passing int, autoboxing to Integer

        // Autoboxing and Unboxing Example
        Integer wrappedInt = 50; // Autoboxing
        int unboxedInt = wrappedInt; // Unboxing
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unboxed int: " + unboxedInt);

        // Using utility methods from the wrapper class
        System.out.println("Minimum value of Integer: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of Integer: " + Integer.MAX_VALUE);
    }

    // Method demonstrating interoperability with Wrapper Classes
    public static void printNumber(Integer num) {
        System.out.println("Printing Integer: " + num);
    }
}

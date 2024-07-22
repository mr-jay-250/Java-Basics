// We are creating a non-primitive data type named Data
class Data {
    int value;

    // Constructor to initialize the value
    public Data(int value) {
        this.value = value;
    }

    // Method to display the value
    public void display() {
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        // Declare a variable of type Data
        Data data1 = new Data(10); // data1 holds a reference to a Data object in heap memory
        Data data2 = data1; // data2 holds the same reference as data1

        // Display the values using the display method
        data1.display(); // Output: Value: 10
        data2.display(); // Output: Value: 10

        // Modify the value using one of the references
        data2.value = 20;

        // Display the values again to show that both references reflect the change
        data1.display(); // Output: Value: 20
        data2.display(); // Output: Value: 20
    }
}

# Java Wrapper Classes: Comprehensive Guide

## Introduction

Wrapper classes in Java are used to convert primitive data types into objects. This conversion is essential for various operations like working with collections, using utility methods, ensuring thread safety, and more. This guide provides a detailed explanation and examples to help you understand the concepts better.

## Why Use Wrapper Classes?

### Collection Framework Compatibility

Java's collection framework, such as `ArrayList` and `HashMap`, only works with objects. Wrapper classes enable us to store primitive types in these collections.

```java
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
```

### Thread Safety

Wrapper classes are immutable and can be synchronized, making them suitable for multi-threaded environments.

```
// Example of synchronization with Wrapper Class
Integer count = 0;

synchronized (count) {
    count = count + 1; // Autoboxing and Unboxing
    System.out.println("Synchronized count: " + count);
}
```

### Default Values in Collections
Wrapper classes can be null, which can be useful to signify the absence of a value in collections.

```
// Using null to represent absence of a value
ArrayList<Integer> scores = new ArrayList<>();
scores.add(null); // Represents a missing score
scores.add(85);
System.out.println("ArrayList with a null value: " + scores);
```

### Flexibility and Interoperability

Wrapper classes are used in scenarios where an object reference is needed, such as in method calls that require objects as arguments.

```
// Method accepting Integer (Wrapper Class)
public void printNumber(Integer num) {
    System.out.println("Number: " + num);
}

// Calling method with primitive type (Autoboxing)
printNumber(42);
```

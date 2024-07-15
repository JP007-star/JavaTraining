
### Class Definition

A class is defined using the `class` keyword. Here is a simple example:

```java
public class Car {
    // Fields (or instance variables)
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}
```

### Creating Objects

An object is created using the `new` keyword followed by the class constructor. Here’s how you create an object of the `Car` class:

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2020);

        // Calling a method on the object
        myCar.displayInfo();
    }
}
```

### Explanation

1. **Class Definition:**
    - `Car` is a class with three fields: `color`, `model`, and `year`.
    - It has a constructor `Car(String color, String model, int year)` to initialize these fields.
    - It has a method `displayInfo()` to print the details of the car.

2. **Creating an Object:**
    - `Car myCar = new Car("Red", "Toyota", 2020);` creates a new `Car` object with the specified attributes.
    - `myCar.displayInfo();` calls the `displayInfo` method on the `myCar` object to display its details.

### Example with Multiple Objects

You can create multiple objects from the same class:

```java
public class Main {
    public static void main(String[] args) {
        // Creating multiple objects of the Car class
        Car car1 = new Car("Red", "Toyota", 2020);
        Car car2 = new Car("Blue", "Honda", 2018);
        Car car3 = new Car("Black", "BMW", 2022);

        // Calling methods on the objects
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
    }
}
```

### More Advanced Concepts

1. **Encapsulation:** Protecting the data by making fields private and providing public getter and setter methods.
2. **Inheritance:** Creating a new class based on an existing class.
3. **Polymorphism:** The ability to call the same method on different objects and have each of them respond in their own way.
4. **Abstraction:** Hiding complex implementation details and showing only the necessary features of the object.

Here is an example incorporating encapsulation:

```java
public class Car {
    // Private fields
    private String color;
    private String model;
    private int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Getter and setter methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and setter methods for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter methods for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2020);

        // Using getter and setter methods
        System.out.println("Initial Car Info:");
        myCar.displayInfo();

        myCar.setColor("Blue");
        myCar.setModel("Honda");
        myCar.setYear(2022);

        System.out.println("\nUpdated Car Info:");
        myCar.displayInfo();
    }
}
```

In this example, fields are private and accessed via public getter and setter methods, demonstrating encapsulation.
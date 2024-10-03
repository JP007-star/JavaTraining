The **SOLID** principles are a set of design guidelines in object-oriented programming that help make software designs more understandable, flexible, and maintainable. They were introduced by Robert C. Martin (Uncle Bob). The acronym SOLID stands for:

- **S**: Single Responsibility Principle (SRP)  -->  a class should have only one job
- **O**: Open/Closed Principle (OCP)            -->  class/function open for extension but closed for modification
- **L**: Liskov Substitution Principle (LSP)    -->  SubType are substitutable Base Class without correcting program
- **I**: Interface Segregation Principle (ISP)  -->  No Client should be force to depends on methods in does not use
- **D**: Dependency Inversion Principle (DIP)   -->  High-level modules should not depend on low-level modules

Here’s a breakdown of each principle with explanations and Java examples.

---

### 1. Single Responsibility Principle (SRP)
**Definition**: A class should have one, and only one, reason to change. This means that a class should have only one responsibility or one job.

**Explanation**: If a class is responsible for too many things, changes in one part of the class might affect other parts, leading to a ripple effect when bugs occur or requirements change.

**Example**:
```java
// Bad Design: Class has two responsibilities (employee info and payroll info)
public class Employee {
    private String name;
    private String position;
    
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    
    // Responsible for saving employee details
    public void saveEmployeeDetails() {
        // Logic to save employee details to database
    }

    // Also responsible for calculating salary
    public void calculateSalary() {
        // Salary calculation logic
    }
}

// Refactored Design: Split into two classes with distinct responsibilities
public class Employee {
    private String name;
    private String position;
    
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    
    // Only responsible for employee-related details
    public void saveEmployeeDetails() {
        // Logic to save employee details
    }
}

// SalaryCalculator has its own responsibility
public class SalaryCalculator {
    public void calculateSalary(Employee employee) {
        // Logic to calculate salary
    }
}
```

---

### 2. Open/Closed Principle (OCP)
**Definition**: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

**Explanation**: You should be able to extend the behavior of a class without modifying its existing code. This avoids introducing bugs into existing functionality while allowing the class to be extended with new behavior.

**Example**:
```java
// Bad Design: We modify the code every time we add a new shape
public class Shape {
    public String type;
    
    public Shape(String type) {
        this.type = type;
    }

    public double calculateArea() {
        if (type.equals("circle")) {
            // Logic for circle area
        } else if (type.equals("rectangle")) {
            // Logic for rectangle area
        }
        return 0;
    }
}

// Refactored Design: Classes can be extended without modifying existing code
abstract class Shape {
    public abstract double calculateArea();
}

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
```

---

### 3. Liskov Substitution Principle (LSP)
**Definition**: Subtypes must be substitutable for their base types without altering the correctness of the program.

**Explanation**: Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. This means that a subclass should not override functionality in a way that breaks the behavior of the base class.

**Example**:
```java
// Bad Design: Square violates LSP by changing behavior of its parent class Rectangle
public class Rectangle {
    protected int width;
    protected int height;
    
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}

public class Square extends Rectangle {
    // This violates LSP because width and height should be equal
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Changes height as well, unexpected behavior
    }

    @Override
    public void setHeight(int height) {
        this.width = height; // Changes width as well, unexpected behavior
        this.height = height;
    }
}

// Refactored Design: Separate Square and Rectangle as different shapes
public abstract class Shape {
    public abstract int calculateArea();
}

public class Rectangle extends Shape {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}
```

---

### 4. Interface Segregation Principle (ISP)
**Definition**: No client should be forced to depend on methods it does not use.

**Explanation**: Instead of having large interfaces, it’s better to have smaller, more specific ones so that clients only need to know about the methods that are relevant to them.

**Example**:
```java
// Bad Design: One large interface with too many methods
public interface Worker {
    void work();
    void eat();
}

// Both classes need to implement all methods, even if unnecessary
public class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Coding");
    }

    @Override
    public void eat() {
        System.out.println("Eating lunch");
    }
}

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Automating tasks");
    }

    // Unnecessary implementation for Robot
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot doesn't eat");
    }
}

// Refactored Design: Split interfaces into smaller ones
public interface Workable {
    void work();
}

public interface Eatable {
    void eat();
}

// Classes implement only relevant interfaces
public class Developer implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Coding");
    }

    @Override
    public void eat() {
        System.out.println("Eating lunch");
    }
}

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Automating tasks");
    }
}
```

---

### 5. Dependency Inversion Principle (DIP)
**Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.

**Explanation**: This principle suggests that the design should depend on interfaces or abstractions rather than concrete implementations. This makes the system more flexible and easier to change.

**Example**:
```java
// Bad Design: High-level class depends on low-level concrete classes
public class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is on");
    }

    public void turnOff() {
        System.out.println("LightBulb is off");
    }
}

public class Switch {
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate(String action) {
        if (action.equalsIgnoreCase("ON")) {
            lightBulb.turnOn();
        } else if (action.equalsIgnoreCase("OFF")) {
            lightBulb.turnOff();
        }
    }
}

// Refactored Design: Depend on an abstraction (interface)
public interface Switchable {
    void turnOn();
    void turnOff();
}

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb is off");
    }
}

public class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(String action) {
        if (action.equalsIgnoreCase("ON")) {
            device.turnOn();
        } else if (action.equalsIgnoreCase("OFF")) {
            device.turnOff();
        }
    }
}
```

---

### Conclusion
The SOLID principles help you design code that is easier to understand, maintain, and extend. These principles promote a clean architecture and allow for the flexibility needed to accommodate future changes. By applying them consistently, you'll avoid many common pitfalls in software development.
OOPS, or Object-Oriented Programming System, is a paradigm used in programming to design and organize software. In Java, OOP is implemented through the following core concepts:

### 1. **Class and Object**
- **Class**: A blueprint for creating objects. It defines properties and behaviors.
- **Object**: An instance of a class. It holds actual values and can perform actions defined by the class.

```java
// Example of a Class
public class Car {
    // Properties (Attributes)
    String color;
    String model;
    
    // Constructor
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }
    
    // Method (Behavior)
    public void displayInfo() {
        System.out.println("Car model: " + model + ", Color: " + color);
    }
}

// Creating an Object
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Tesla Model S");
        myCar.displayInfo();  // Output: Car model: Tesla Model S, Color: Red
    }
}
```

### 2. **Inheritance**
Inheritance allows a new class to inherit the properties and methods of an existing class.

```java
// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Output: This animal eats food.
        myDog.bark();  // Output: The dog barks.
    }
}
```

### 3. **Polymorphism**
Polymorphism allows methods to do different things based on the object it is acting upon.

- **Method Overloading**: Same method name with different parameters.

```java
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println(math.add(5, 10));  // Output: 15
        System.out.println(math.add(5, 10, 15));  // Output: 30
    }
}
```

- **Method Overriding**: Subclass provides a specific implementation of a method that is already defined in its superclass.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();  // Output: Dog barks.
    }
}
```

### 4. **Encapsulation**
Encapsulation is the wrapping of data (variables) and code (methods) together as a single unit. It restricts direct access to some of an object's components.

```java
class Person {
    // Private variable
    private String name;
    
    // Getter method
    public String getName() {
        return name;
    }
    
    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        System.out.println(person.getName());  // Output: John Doe
    }
}
```

### 5. **Abstraction**
Abstraction hides the implementation details and only exposes the functionality.

- **Abstract Class**: A class that cannot be instantiated and may contain abstract methods.

```java
abstract class Animal {
    abstract void sound();  // Abstract method

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Output: Dog barks.
        myDog.sleep();  // Output: This animal sleeps.
    }
}
```

- **Interface**: A reference type in Java, it is a collection of abstract methods.

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Output: Dog barks.
    }
}
```

### Session 2: Abstract Classes vs. Interfaces and Exception Handling

#### Day 1: Abstract Classes vs. Interfaces

**Abstract Classes**

1. **Definition**: Abstract classes are classes that cannot be instantiated and can contain abstract methods (methods without a body) and concrete methods (methods with a body).

2. **Example and Use Case**:
    ```java
    abstract class Animal {
        abstract void sound();  // Abstract method

        void sleep() {  // Concrete method
            System.out.println("Sleeping");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.sound();  // Output: Dog barks
            dog.sleep();  // Output: Sleeping
        }
    }
    ```
    - **Use Case**: Use abstract classes when you have a base class that should not be instantiated on its own but can provide some default behavior or state that other classes can inherit and override.

**Interfaces**

1. **Definition**: Interfaces are a way to define methods that must be implemented by classes. Interfaces cannot contain any concrete methods (until Java 8, which introduced default and static methods).

2. **Example and Use Case**:
    ```java
    interface Vehicle {
        void drive();  // Abstract method
    }

    class Car implements Vehicle {
        @Override
        public void drive() {
            System.out.println("Car drives");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Car car = new Car();
            car.drive();  // Output: Car drives
        }
    }
    ```
    - **Use Case**: Use interfaces to define a contract that multiple classes can implement, ensuring they provide specific behavior. Interfaces are useful for achieving multiple inheritance in Java.

**Comparison**:

- **Abstract Classes**:
    - Can have both abstract and concrete methods.
    - Can have member variables.
    - Can provide a base class implementation.
    - Can have constructors.
    - Supports single inheritance.

- **Interfaces**:
    - All methods are abstract by default (until Java 8).
    - Cannot have member variables (only constants).
    - Cannot provide a base class implementation.
    - No constructors.
    - Supports multiple inheritance.

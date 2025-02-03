
### List of Java Keywords

#### 1. **Data Types**
- `byte`: 8-bit integer data type.
- `short`: 16-bit integer data type.
- `int`: 32-bit integer data type.
- `long`: 64-bit integer data type.
- `float`: Single-precision 32-bit floating point.
- `double`: Double-precision 64-bit floating point.
- `char`: A single 16-bit Unicode character.
- `boolean`: Represents `true` or `false`.

#### 2. **Control Flow Statements**
- `if`: Used for decision-making operations.
- `else`: Used in conjunction with `if` for alternative operations.
- `switch`: Used to execute one statement from multiple conditions.
- `case`: Defines individual conditions in a `switch` statement.
- `default`: Defines the default condition in a `switch` statement.
- `while`: Starts a while loop.
- `do`: Starts a do-while loop.
- `for`: Starts a for loop.
- `break`: Exits from the loop or switch statement.
- `continue`: Skips the current iteration of a loop.
- `return`: Exits from the current method and optionally returns a value.

#### 3. **Modifiers**
- `public`: Access modifier, visible to all classes.
- `protected`: Access modifier, visible to the package and subclasses.
- `private`: Access modifier, visible only within the class.
- `static`: Indicates a class-level variable or method.
- `final`: Indicates that a variable is constant, a method cannot be overridden, or a class cannot be subclassed.
- `abstract`: Indicates that a class cannot be instantiated or that a method must be implemented in a subclass.
- `synchronized`: Used for thread-safe methods and blocks.
- `volatile`: Indicates that a variable may be changed unexpectedly.
- `transient`: Prevents serialization of a variable.

#### 4. **Exception Handling**
- `try`: Starts a block of code that will be tested for exceptions.
- `catch`: Catches exceptions thrown by the `try` block.
- `finally`: Defines a block of code, always executed after `try`/`catch`.
- `throw`: Used to explicitly throw an exception.
- `throws`: Declares the exceptions that can be thrown by a method.

#### 5. **Class Related**
- `class`: Declares a class.
- `interface`: Declares an interface.
- `extends`: Indicates that a class is inheriting from a superclass.
- `implements`: Indicates that a class implements an interface.
- `this`: Refers to the current instance of a class.
- `super`: Refers to the superclass of the current instance.

#### 6. **Others**
- `import`: Imports other Java packages or classes.
- `package`: Defines a package to group related classes.
- `new`: Creates new objects.
- `instanceof`: Tests whether an object is an instance of a specific class or subclass.
- `null`: A literal representing a null reference.
- `void`: Specifies that a method does not return a value.
- `native`: Indicates that a method is implemented in native code using JNI (Java Native Interface).
- `strictfp`: Restricts floating-point calculations to ensure portability.
- `goto`: Reserved keyword but not used in Java.
- `const`: Reserved keyword but not used in Java.

### Examples of Using Keywords

#### Example 1: Data Types and Variable Declaration
```java
public class DataTypeExample {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = 5.99;
        char myChar = 'A';
        boolean myBool = true;

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBool);
    }
}
```

#### Example 2: Control Flow Statements
```java
public class ControlFlowExample {
    public static void main(String[] args) {
        int number = 10;

        // if-else statement
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // switch statement
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Other number");
                break;
        }
    }
}
```

#### Example 3: Class and Inheritance
```java
// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Method from superclass
        myDog.bark(); // Method from subclass
    }
}
```

#### Example 4: Exception Handling
```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed");
        }
    }
}
```

1. Structure of a Java Program:

Every Java program has at least one class.
The entry point of a Java application is the main method.
Example:

java
Copy code
public class Main {
public static void main(String[] args) {
// This is where the program starts
System.out.println("Hello, World!");
}
}
2. Comments:

Single-line comments start with //.
Multi-line comments are enclosed between /* and */.
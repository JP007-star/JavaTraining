![img.png](6f1fdc93-a974-44f7-b149-1eb7193349da.png)

### JDK, JRE, and JVM

**Java Development Kit (JDK):**
- The JDK is a full-featured software development kit necessary for Java development. It includes:
    - **JRE (Java Runtime Environment):** Necessary for running Java applications.
    - **Development Tools:** Tools like the Java compiler (`javac`), debuggers, and other utilities required for Java development.

**Java Runtime Environment (JRE):**
- The JRE provides the libraries, Java Virtual Machine (JVM), and other components to run applications written in Java. It does not include development tools such as compilers or debuggers.
    - **JVM:** The engine that runs Java bytecode. It converts bytecode into machine language.
    - **Core Libraries:** Necessary libraries and other files required for running Java applications.

**Java Virtual Machine (JVM):**
- The JVM is the heart of Java's "write once, run anywhere" capability. It is responsible for:
    - **Loading, Verifying, and Executing Bytecode:** Ensures the bytecode is safe to execute.
    - **Garbage Collection:** Automatic memory management.
    - **Platform Independence:** Converts bytecode into machine code that runs on the underlying hardware.

### JDK 1.8 (Java SE 8)

JDK 1.8, also known as Java SE 8, introduced several significant features and enhancements. Below are the key features introduced in JDK 1.8:

#### Key Features of JDK 1.8:

1. **Lambda Expressions:**
    - Provides a clear and concise way to represent one method interface using an expression.
    - Syntax: `(parameters) -> expression` or `(parameters) -> { statements; }`
    - Example:
      ```java
      List<String> list = Arrays.asList("a", "b", "c");
      list.forEach(item -> System.out.println(item));
      ```

2. **Functional Interfaces:**
    - An interface with a single abstract method, used as the type for lambda expressions.
    - Annotated with `@FunctionalInterface`.
    - Example:
      ```java
      @FunctionalInterface
      interface MyFunctionalInterface {
          void myMethod();
      }
      ```

3. **Stream API:**
    - Introduces the `java.util.stream` package, providing a powerful way to process collections of objects.
    - Supports operations like filter, map, reduce, and collect.
    - Example:
      ```java
      List<String> list = Arrays.asList("a", "b", "c", "d");
      list.stream()
          .filter(s -> s.startsWith("a"))
          .forEach(System.out::println);
      ```

4. **Default and Static Methods in Interfaces:**
    - Allows interfaces to have default methods (with a default implementation) and static methods.
    - Example:
      ```java
      interface MyInterface {
          default void defaultMethod() {
              System.out.println("Default method");
          }
          
          static void staticMethod() {
              System.out.println("Static method");
          }
      }
      ```

5. **Method References:**
    - A shorthand notation for calling a method via a lambda expression.
    - Syntax: `ClassName::methodName`
    - Example:
      ```java
      list.forEach(System.out::println);
      ```

6. **Optional Class:**
    - A container class to represent optional values, to avoid `NullPointerException`.
    - Example:
      ```java
      Optional<String> optional = Optional.ofNullable("Hello");
      optional.ifPresent(System.out::println);
      ```

7. **New Date and Time API:**
    - Introduces a new date and time API under the `java.time` package to replace the old `java.util.Date` and `java.util.Calendar`.
    - Example:
      ```java
      LocalDate date = LocalDate.now();
      LocalTime time = LocalTime.now();
      LocalDateTime dateTime = LocalDateTime.now();
      ```

8. **Nashorn JavaScript Engine:**
    - A new lightweight, high-performance JavaScript engine integrated with Java, allowing embedding JavaScript code within Java applications.
    - Example:
      ```java
      ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
      engine.eval("print('Hello from Nashorn');");
      ```

9. **Concurrent Accumulators:**
    - Improved concurrent performance with classes like `LongAdder` and `DoubleAdder` for high-frequency updates.

10. **Base64 Encoding and Decoding:**
    - Utility class for encoding and decoding Base64.
    - Example:
      ```java
      Base64.Encoder encoder = Base64.getEncoder();
      String encodedString = encoder.encodeToString("Hello".getBytes());
      ```

### Summary

- **JDK (Java Development Kit):** Full package including JRE, JVM, and development tools.
- **JRE (Java Runtime Environment):** Contains JVM and libraries needed to run Java applications.
- **JVM (Java Virtual Machine):** Executes Java bytecode, ensuring platform independence.


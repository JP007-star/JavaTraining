Exception handling in Java is a robust mechanism to handle runtime errors, ensuring the normal flow of the application. The core concepts and structures in Java exception handling include:

1. **Try-Catch Block**: This is used to wrap code that might throw an exception. If an exception occurs, it is caught by the `catch` block.
    ```java
    try {
        // Code that may throw an exception
    } catch (ExceptionType e) {
        // Code to handle the exception
    }
    ```

2. **Finally Block**: This block is used for code that must execute whether an exception is thrown or not. It is typically used for cleanup activities, like closing files or releasing resources.
    ```java
    try {
        // Code that may throw an exception
    } catch (ExceptionType e) {
        // Code to handle the exception
    } finally {
        // Code to be executed regardless of an exception
    }
    ```

3. **Throwing Exceptions**: You can throw exceptions using the `throw` keyword. This is useful for handling custom error conditions.
    ```java
    if (someCondition) {
        throw new MyException("Error message");
    }
    ```

4. **Custom Exceptions**: You can create your own exception classes by extending the `Exception` class or any of its subclasses.
    ```java
    public class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
    ```

5. **Checked vs. Unchecked Exceptions**:
    - **Checked Exceptions**: These are exceptions that are checked at compile-time. They must be either caught or declared in the method signature using the `throws` keyword.
        ```java
        public void myMethod() throws IOException {
            // Code that may throw IOException
        }
        ```
    - **Unchecked Exceptions**: These are exceptions that are not checked at compile-time. They include subclasses of `RuntimeException` and `Error`.
        ```java
        public void myMethod() {
            // Code that may throw a RuntimeException
        }
        ```

6. **Multiple Catch Blocks**: You can have multiple `catch` blocks to handle different types of exceptions.
    ```java
    try {
        // Code that may throw exceptions
    } catch (IOException e) {
        // Handle IOException
    } catch (SQLException e) {
        // Handle SQLException
    }
    ```

7. **Try-With-Resources**: This is a try statement that declares one or more resources. A resource is an object that must be closed after the program is finished with it. The `try-with-resources` statement ensures that each resource is closed at the end of the statement.
    ```java
    try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
        // Code that uses the resource
    } catch (IOException e) {
        // Handle IOException
    }
    ```

Here is a practical example incorporating these concepts:

```java
import java.io.*;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (MyCustomException e) {
            System.err.println("Custom Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
    }

    public static void readFile(String fileName) throws MyCustomException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new MyCustomException("File not found: " + fileName);
        } catch (IOException e) {
            throw new MyCustomException("Error reading file: " + fileName);
        }
    }
}

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
```

In this example:
- The `readFile` method reads a file and throws a `MyCustomException` if any issues occur.
- The `main` method handles this custom exception and includes a `finally` block to demonstrate its execution regardless of exceptions.
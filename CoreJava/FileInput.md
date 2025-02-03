
### 1. **FileWriter & FileReader**

These classes are used for writing to and reading from text files.

- **FileWriter**: Writes text to a file.
- **FileReader**: Reads text from a file.

#### Example:

```java
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileWriterReaderExample {
    public static void main(String[] args) {
        // Writing to a file using FileWriter
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, FileWriter!\nWelcome to file handling in Java.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file using FileReader
        try (FileReader reader = new FileReader("example.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### 2. **BufferedWriter & BufferedReader**

- **BufferedWriter**: Buffers data before writing to improve efficiency.
- **BufferedReader**: Buffers input to read more efficiently (usually line by line).

#### Example:

```java
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class BufferedWriterReaderExample {
    public static void main(String[] args) {
        // Writing to a file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered_example.txt"))) {
            writer.write("This is a BufferedWriter example.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("buffered_example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### 3. **Input from Keyboard using Console Class**

The `Console` class is used to read from the keyboard in a secure manner, especially useful for reading passwords.

#### Example:

```java
import java.io.Console;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            String username = console.readLine("Enter your username: ");
            char[] password = console.readPassword("Enter your password: ");
            
            System.out.println("Username: " + username);
            System.out.println("Password: " + new String(password));
        } else {
            System.out.println("No console available.");
        }
    }
}
```

### 4. **Input from Keyboard using Scanner Class**

`Scanner` is commonly used for reading inputs from various input sources like keyboard, files, etc.

#### Example:

```java
import java.util.Scanner;

public class ScannerInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name + ", Age: " + age);

        scanner.close();
    }
}
```

### 5. **PrintWriter Class**

`PrintWriter` is used for writing formatted text to an output stream (like files). It can also be used to write directly to the console.

#### Example:

```java
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) {
        // Writing to a file using PrintWriter
        try (PrintWriter writer = new PrintWriter("printwriter_example.txt")) {
            writer.println("Hello from PrintWriter!");
            writer.printf("Age: %d", 30);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to the console using PrintWriter
        PrintWriter consoleWriter = new PrintWriter(System.out);
        consoleWriter.println("Printing to the console using PrintWriter.");
        consoleWriter.flush();  // Flushes the output stream
    }
}
```

### 6. **Reading and Writing Data Simultaneously**

Sometimes, you may need to read and write data simultaneously in Java. This can be achieved using multiple streams (InputStream and OutputStream).

#### Example:

```java
import java.io.*;

public class ReadWriteSimultaneousExample {
    public static void main(String[] args) {
        // Source and destination files
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Write to the source file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFile))) {
            writer.write("This is the source file content.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from source file and write to destination file simultaneously
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Verify the destination file content
        try (BufferedReader reader = new BufferedReader(new FileReader(destinationFile))) {
            String line;
            System.out.println("Destination file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Summary:

- **FileWriter/FileReader**: Used for writing and reading text files.
- **BufferedWriter/BufferedReader**: Buffered writing/reading for efficient IO operations.
- **Console**: Reading inputs from the console (keyboard).
- **Scanner**: A more flexible class for reading inputs from various sources.
- **PrintWriter**: Useful for writing formatted text to files or other output streams.
- **Simultaneous Read/Write**: Reading and writing files at the same time using multiple streams.

Let me know if you want further clarification or additional examples!
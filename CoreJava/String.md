

#### 1. Introduction to Strings
- **Definition**: In Java, a string is a sequence of characters. Strings are objects that are immutable, meaning once a string object is created, it cannot be changed.
- **Creation**: Strings can be created in two ways:
    - **String Literal**:
      ```java
      String str = "Hello, World!";
      ```
    - **Using the `new` keyword**:
      ```java
      String str = new String("Hello, World!");
      ```

#### 2. String Class Methods
Java's `String` class provides numerous methods to manipulate and process strings.

- **length()**: Returns the length of the string.
  ```java
  int len = str.length();
  ```

- **charAt()**: Returns the character at the specified index.
  ```java
  char ch = str.charAt(0); // 'H'
  ```

- **substring()**: Returns a new string that is a substring of the given string.
  ```java
  String substr = str.substring(7, 12); // "World"
  ```

- **contains()**: Checks if the string contains a specified sequence of characters.
  ```java
  boolean contains = str.contains("World"); // true
  ```

- **equals()**: Compares two strings for content equality.
  ```java
  boolean isEqual = str.equals("Hello, World!"); // true
  ```

- **equalsIgnoreCase()**: Compares two strings ignoring case considerations.
  ```java
  boolean isEqual = str.equalsIgnoreCase("hello, world!"); // true
  ```

- **compareTo()**: Compares two strings lexicographically.
  ```java
  int result = str.compareTo("Hello, World!"); // 0 (equal)
  ```

- **indexOf()**: Returns the index of the first occurrence of a specified character or substring.
  ```java
  int index = str.indexOf('W'); // 7
  ```

- **toLowerCase()**: Converts all characters of the string to lower case.
  ```java
  String lower = str.toLowerCase(); // "hello, world!"
  ```

- **toUpperCase()**: Converts all characters of the string to upper case.
  ```java
  String upper = str.toUpperCase(); // "HELLO, WORLD!"
  ```

- **trim()**: Removes whitespace from both ends of the string.
  ```java
  String trimmed = str.trim();
  ```

- **replace()**: Replaces each occurrence of a character with a new character.
  ```java
  String replaced = str.replace('H', 'h'); // "hello, World!"
  ```

#### 3. String Immutability
- **Concept**: Strings in Java are immutable. Once a string is created, it cannot be changed. Any modification to a string results in the creation of a new string.
  ```java
  String str1 = "Hello";
  String str2 = str1.concat(", World!");
  // str1 remains "Hello", str2 becomes "Hello, World!"
  ```

#### 4. String Pool
- **String Interning**: Java optimizes memory usage by storing string literals in a common pool. Strings with the same content share the same memory location.
  ```java
  String str1 = "Hello";
  String str2 = "Hello";
  boolean same = (str1 == str2); // true, because they refer to the same object in the string pool
  ```

#### 5. StringBuilder and StringBuffer
- **Mutable Alternatives**: For mutable strings, Java provides `StringBuilder` and `StringBuffer`.
- **StringBuilder**: Non-synchronized, faster.
  ```java
  StringBuilder sb = new StringBuilder("Hello");
  sb.append(", World!");
  String result = sb.toString(); // "Hello, World!"
  ```

- **StringBuffer**: Synchronized, thread-safe, slightly slower.
  ```java
  StringBuffer sbf = new StringBuffer("Hello");
  sbf.append(", World!");
  String result = sbf.toString(); // "Hello, World!"
  ```

#### 6. String Formatting
- **Using `String.format()`**: Allows for formatted strings similar to `printf` in C.
  ```java
  String formatted = String.format("Name: %s, Age: %d", "John", 25);
  // "Name: John, Age: 25"
  ```

- **Using `printf`**: Directly prints formatted strings to the console.
  ```java
  System.out.printf("Name: %s, Age: %d", "John", 25);
  ```

#### 7. Regular Expressions with Strings
- **Using `matches()`**: Checks if the string matches the given regular expression.
  ```java
  boolean matches = str.matches("[A-Za-z]+"); // true if str contains only letters
  ```

- **Using `split()`**: Splits the string based on a regular expression.
  ```java
  String[] words = str.split("\\s+");
  ```

- **Using `replaceAll()` and `replaceFirst()`**: Replaces substrings matching a regular expression.
  ```java
  String replacedAll = str.replaceAll("\\s", "-");
  String replacedFirst = str.replaceFirst("\\s", "-");
  ```

#### 8. Use Case Example
**Use Case**: Creating a Simple Contact Information Formatter
- **Problem**: Given a contact's name and phone number, format it into a standard string.

**Example**:
```java
public class ContactFormatter {
    public static void main(String[] args) {
        String name = "John Doe";
        String phone = "123-456-7890";

        // Format the contact information
        String contactInfo = formatContact(name, phone);
        System.out.println(contactInfo); // Output: Name: John Doe, Phone: 123-456-7890
    }

    public static String formatContact(String name, String phone) {
        return String.format("Name: %s, Phone: %s", name, phone);
    }
}
```

**Explanation**:
- **Input**: The `main` method takes a name and phone number.
- **Processing**: The `formatContact` method uses `String.format()` to create a formatted string.
- **Output**: The formatted contact information is printed to the console.

This example demonstrates string creation, manipulation, and formatting, showcasing the fundamental operations needed for working with strings in Java.
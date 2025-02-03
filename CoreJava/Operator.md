
### Types of Operators

1. **Arithmetic Operators**
2. **Unary Operators**
3. **Assignment Operators**
4. **Relational Operators**
5. **Logical Operators**
6. **Bitwise Operators**
7. **Ternary Operator**
8. ** instanceof Operator**

### 1. Arithmetic Operators

These operators perform basic arithmetic operations.

- **Addition (`+`)**: Adds two operands.
- **Subtraction (`-`)**: Subtracts the second operand from the first.
- **Multiplication (`*`)**: Multiplies two operands.
- **Division (`/`)**: Divides the first operand by the second.
- **Modulus (`%`)**: Returns the remainder when the first operand is divided by the second.

**Example:**
```java
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}
```

### 2. Unary Operators

These operators operate on a single operand.

- **Unary plus (`+`)**: Indicates a positive value.
- **Unary minus (`-`)**: Negates an expression.
- **Increment (`++`)**: Increases a value by one.
- **Decrement (`--`)**: Decreases a value by one.
- **Logical complement (`!`)**: Inverts the value of a boolean.

**Example:**
```java
public class UnaryOperators {
    public static void main(String[] args) {
        int x = 10;
        boolean flag = false;

        System.out.println("Unary plus: " + (+x));
        System.out.println("Unary minus: " + (-x));
        System.out.println("Increment: " + (++x));
        System.out.println("Decrement: " + (--x));
        System.out.println("Logical complement: " + (!flag));
    }
}
```

### 3. Assignment Operators

These operators are used to assign values to variables.

- **Assignment (`=`)**: Assigns the right-hand operand to the left-hand operand.
- **Add and assign (`+=`)**: Adds right-hand operand to left-hand operand and assigns the result to the left-hand operand.
- **Subtract and assign (`-=`)**: Subtracts right-hand operand from left-hand operand and assigns the result to the left-hand operand.
- **Multiply and assign (`*=`)**: Multiplies left-hand operand by right-hand operand and assigns the result to the left-hand operand.
- **Divide and assign (`/=`)**: Divides left-hand operand by right-hand operand and assigns the result to the left-hand operand.
- **Modulus and assign (`%=`)**: Takes modulus using two operands and assigns the result to the left-hand operand.

**Example:**
```java
public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a += b;
        System.out.println("a += b: " + a);

        a -= b;
        System.out.println("a -= b: " + a);

        a *= b;
        System.out.println("a *= b: " + a);

        a /= b;
        System.out.println("a /= b: " + a);

        a %= b;
        System.out.println("a %= b: " + a);
    }
}
```

### 4. Relational Operators

These operators are used to compare two values.

- **Equal to (`==`)**: Returns true if both operands are equal.
- **Not equal to (`!=`)**: Returns true if operands are not equal.
- **Greater than (`>`)**: Returns true if the left operand is greater than the right operand.
- **Less than (`<`)**: Returns true if the left operand is less than the right operand.
- **Greater than or equal to (`>=`)**: Returns true if the left operand is greater than or equal to the right operand.
- **Less than or equal to (`<=`)**: Returns true if the left operand is less than or equal to the right operand.

**Example:**
```java
public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
}
```

### 5. Logical Operators

These operators are used to perform logical operations.

- **Logical AND (`&&`)**: Returns true if both operands are true.
- **Logical OR (`||`)**: Returns true if at least one operand is true.
- **Logical NOT (`!`)**: Inverts the value of a boolean.

**Example:**
```java
public class LogicalOperators {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}
```

### 6. Bitwise Operators

These operators perform bit-level operations on integer types.

- **Bitwise AND (`&`)**: Performs a bitwise AND operation.
- **Bitwise OR (`|`)**: Performs a bitwise OR operation.
- **Bitwise XOR (`^`)**: Performs a bitwise XOR operation.
- **Bitwise Complement (`~`)**: Inverts all the bits of an operand.
- **Left shift (`<<`)**: Shifts the bits of the left operand to the left by the number of positions specified by the right operand.
- **Right shift (`>>`)**: Shifts the bits of the left operand to the right by the number of positions specified by the right operand.
- **Unsigned right shift (`>>>`)**: Shifts zero into the leftmost bits.

**Example:**
```java
public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        System.out.println("a & b: " + (a & b));  // 0001
        System.out.println("a | b: " + (a | b));  // 0111
        System.out.println("a ^ b: " + (a ^ b));  // 0110
        System.out.println("~a: " + (~a));        // 1010 (inverts all bits)
        System.out.println("a << 1: " + (a << 1)); // 1010 (left shift)
        System.out.println("a >> 1: " + (a >> 1)); // 0010 (right shift)
        System.out.println("a >>> 1: " + (a >>> 1)); // 0010 (unsigned right shift)
    }
}
```

### 7. Ternary Operator

The ternary operator is a shorthand for the `if-else` statement. It has the form:
```java
condition ? expression1 : expression2;
```
If the condition is true, it evaluates `expression1`; otherwise, it evaluates `expression2`.

**Example:**
```java
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("Maximum value: " + max);
    }
}
```

### 8. instanceof Operator

The `instanceof` operator is used to test whether an object is an instance of a specific class or subclass.

**Example:**
```java
public class InstanceofOperator {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean result = str instanceof String;
        System.out.println("Is str an instance of String? " + result);
    }
}
```


Control statements in Java 
1. **Selection Statements**: These are used to select the execution of a statement based on the condition.
    - `if`
    - `if-else`
    - `if-else-if`
    - `switch`

2. **Iteration Statements**: These are used to execute a block of code repeatedly.
    - `for`
    - `while`
    - `do-while`
    - `for-each` (enhanced for loop)

3. **Jump Statements**: These are used to transfer control to another part of the program.
    - `break`
    - `continue`
    - `return`

Let's go through each of these with code examples:

### 1. Selection Statements

#### if statement

```java
public class Main {
    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        }
    }
}
```

#### if-else statement

```java
public class Main {
    public static void main(String[] args) {
        int number = -10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
```

#### if-else-if statement

```java
public class Main {
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
```

#### switch statement

```java
public class Main {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
```

### 2. Iteration Statements

#### for loop

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
    }
}
```

#### while loop

```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration " + i);
            i++;
        }
    }
}
```

#### do-while loop

```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Iteration " + i);
            i++;
        } while (i <= 5);
    }
}
```

#### for-each loop

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
```

### 3. Jump Statements

#### break statement

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println("Iteration " + i);
        }
    }
}
```

#### continue statement

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the iteration when i is 3
            }
            System.out.println("Iteration " + i);
        }
    }
}
```

#### return statement

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Sum: " + add(10, 20));
    }

    public static int add(int a, int b) {
        return a + b; // Return the sum of a and b
    }
}
```

These are the basic control statements in Java, each serving a specific purpose to manage the flow of the program.
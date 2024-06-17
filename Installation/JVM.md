### JVM Architecture

The JVM architecture consists of several key components, each playing a specific role in executing Java programs:

1. **ClassLoader Subsystem**
2. **Runtime Data Areas**
3. **Execution Engine**
4. **Native Method Interface (JNI)**
5. **Native Method Libraries**

### 1. ClassLoader Subsystem

The ClassLoader subsystem is responsible for loading class files. It reads the .class files, generates the bytecode, and loads them into the memory.

- **Components:**
    - **Bootstrap ClassLoader:** Loads core Java libraries located in `<JAVA_HOME>/lib`.
    - **Extension ClassLoader:** Loads classes from the `<JAVA_HOME>/lib/ext` directory.
    - **Application ClassLoader:** Loads classes from the classpath defined by the user.

### 2. Runtime Data Areas

The JVM organizes its memory into various runtime data areas, some of which are created per thread and others that are shared among all threads.

- **Method Area:**
    - Stores class structure, including the runtime constant pool, field and method data, and the code for methods.

- **Heap:**
    - The runtime data area from which memory for all class instances and arrays is allocated.
    - Shared among all threads.

- **Java Stack:**
    - Each thread has its own stack, which stores frames. A frame contains local variables, operand stack, and a reference to the runtime constant pool.
    - Used for method invocation and execution.

- **PC (Program Counter) Register:**
    - Contains the address of the JVM instruction currently being executed.
    - Each thread has its own PC register.

- **Native Method Stack:**
    - Contains all the native method information used in the application.
    - Each thread has its own native method stack.

### 3. Execution Engine

The Execution Engine is responsible for executing the bytecode loaded by the ClassLoader.

- **Components:**
    - **Interpreter:** Reads and executes bytecode instructions one by one. However, it is relatively slow due to the overhead of interpreting.
    - **Just-In-Time (JIT) Compiler:** Improves performance by compiling bytecode into native machine code at runtime. Once a method is compiled, the JVM calls the compiled code directly.
        - **HotSpot:** A JIT compiler that identifies “hot” methods (frequently used methods) and optimizes them.
    - **Garbage Collector (GC):** Automatically manages memory by reclaiming memory used by objects that are no longer reachable in the application. Different algorithms like Mark-and-Sweep, Generational GC, etc., are used.

### 4. Native Method Interface (JNI)

The JNI provides a way for Java code running in the JVM to call and be called by native applications and libraries written in other languages like C or C++. It allows Java applications to interact with native system resources and libraries.

### 5. Native Method Libraries

These libraries are written in other languages like C or C++ and are required for executing native methods. The JVM loads these libraries at runtime using the JNI.

### Execution Process

Here’s a step-by-step overview of how a Java program is executed within the JVM:

1. **Loading:**
    - The ClassLoader loads the .class files into the Method Area.

2. **Linking:**
    - **Verification:** Ensures the bytecode is correct and doesn’t violate Java’s security constraints.
    - **Preparation:** Allocates memory for class variables and initializes them to default values.
    - **Resolution:** Converts symbolic references to actual memory references.

3. **Initialization:**
    - The JVM initializes class variables to their proper values and initializes static blocks.

4. **Execution:**
    - The Execution Engine executes the bytecode using the interpreter or JIT compiler.
    - During execution, if a method calls a native method, the JVM uses JNI to load the necessary native libraries and execute the native method.

### Diagram of JVM Architecture

```
                   +---------------------+
                   |   Java Application  |
                   +---------------------+
                            |
                            V
+-----------------+      +------------------+
| ClassLoader     |      | Native Method    |
| Subsystem       |      | Interface (JNI)  |
+-----------------+      +------------------+
        |                        |
        V                        V
+-----------------+      +------------------+
|  Runtime Data   |      | Native Method    |
|  Areas          |      | Libraries        |
+-----------------+      +------------------+
        |
        V
+-----------------+
| Execution       |
| Engine          |
+-----------------+
| Interpreter     |
|    +            |
| JIT Compiler    |
|    +            |
| Garbage         |
| Collector       |
+-----------------+
```


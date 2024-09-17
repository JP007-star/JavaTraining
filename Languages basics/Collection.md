### 1. **Introduction to Collections Framework**

The Java Collections Framework provides a set of interfaces and classes to handle a group of objects as a single unit. It includes methods to perform common operations on data structures like adding, removing, and accessing elements.

### 2. **Interfaces**

#### 2.1. **Collection Interface**

The root interface in the collections hierarchy. It provides basic operations that all collections implement.

- **Methods**: `add()`, `remove()`, `size()`, `clear()`, `contains()`

#### 2.2. **List Interface**

An ordered collection (sequence) that allows duplicate elements. Lists can be accessed by their integer index.

- **Implementations**:
  - **ArrayList**: Resizable array implementation.
  - **LinkedList**: Doubly-linked list implementation.
  - **Vector**: Synchronized resizable array.
  - **Stack**: Last-in, first-out stack.

#### 2.3. **Set Interface**

A collection that does not allow duplicate elements. Mainly used to model mathematical sets.

- **Implementations**:
  - **HashSet**: Uses a hash table for storage.
  - **LinkedHashSet**: Maintains insertion order using a linked list.
  - **TreeSet**: Implements a Red-Black tree, sorted order.

#### 2.4. **Queue Interface**

A collection used to hold multiple elements prior to processing. Typically used for ordering elements in a specific order.

- **Implementations**:
  - **PriorityQueue**: An unbounded priority queue based on a priority heap.
  - **Deque**: Double-ended queue that allows element insertion and removal from both ends.
    - **ArrayDeque**: Resizable-array implementation of the Deque interface.

#### 2.5. **Map Interface**

Maps keys to values, with no duplicate keys allowed. Each key can map to at most one value.

- **Implementations**:
  - **HashMap**: Uses a hash table for storage.
  - **LinkedHashMap**: Maintains insertion order.
  - **TreeMap**: Implements a Red-Black tree.
  - **Hashtable**: Synchronized hash table.

### 3. **Implementations**

#### 3.1. **ArrayList**

- **Use Case**: Dynamic arrays where random access is fast.
- **Example**: Managing a list of students in a class.
- **Code**:
  ```java
  List<String> students = new ArrayList<>();
  students.add("John");
  students.add("Jane");
  ```

#### 3.2. **LinkedList**

- **Use Case**: Frequent insertions and deletions.
- **Example**: Implementing a queue or stack.
- **Code**:
  ```java
  List<String> linkedList = new LinkedList<>();
  linkedList.add("John");
  linkedList.add("Jane");
  ```

#### 3.3. **HashSet**

- **Use Case**: Storing unique elements, with no order.
- **Example**: Unique IDs for a set of users.
- **Code**:
  ```java
  Set<String> userIds = new HashSet<>();
  userIds.add("user1");
  userIds.add("user2");
  ```

#### 3.4. **TreeSet**

- **Use Case**: Storing elements in a sorted order.
- **Example**: Sorting names alphabetically.
- **Code**:
  ```java
  Set<String> sortedNames = new TreeSet<>();
  sortedNames.add("John");
  sortedNames.add("Jane");
  ```

#### 3.5. **HashMap**

- **Use Case**: Key-value pair storage with fast lookup.
- **Example**: Storing user details with unique user IDs.
- **Code**:
  ```java
  Map<String, String> userDetails = new HashMap<>();
  userDetails.put("user1", "John Doe");
  userDetails.put("user2", "Jane Doe");
  ```

#### 3.6. **LinkedHashMap**

- **Use Case**: Maintaining insertion order of elements.
- **Example**: LRU cache implementation.
- **Code**:
  ```java
  Map<String, String> linkedMap = new LinkedHashMap<>();
  linkedMap.put("user1", "John Doe");
  linkedMap.put("user2", "Jane Doe");
  ```

#### 3.7. **PriorityQueue**

- **Use Case**: Task scheduling based on priority.
- **Example**: Implementing a task manager.
- **Code**:
  ```java
  Queue<Integer> priorityQueue = new PriorityQueue<>();
  priorityQueue.add(10);
  priorityQueue.add(20);
  ```

#### 3.8. **ArrayDeque**

- **Use Case**: Resizable-array implementation of Deque interface.
- **Example**: Implementing a stack.
- **Code**:
  ```java
  Deque<String> stack = new ArrayDeque<>();
  stack.push("First");
  stack.push("Second");
  ```

### 4. **Algorithms**

The Collections Framework provides algorithms that can be used to manipulate the elements in a collection.

#### 4.1. **Sorting**

- **Method**: `Collections.sort(list)`
- **Use Case**: Sorting elements in natural order.
- **Example**:
  ```java
  List<String> list = new ArrayList<>();
  list.add("Banana");
  list.add("Apple");
  list.add("Cherry");
  Collections.sort(list);
  System.out.println(list);
  ```

#### 4.2. **Searching**

- **Method**: `Collections.binarySearch(list, key)`
- **Use Case**: Searching for a key using binary search.
- **Example**:
  ```java
  List<String> list = new ArrayList<>();
  list.add("Apple");
  list.add("Banana");
  list.add("Cherry");
  Collections.sort(list);
  int index = Collections.binarySearch(list, "Banana");
  System.out.println("Index of Banana: " + index);
  ```

#### 4.3. **Shuffling**

- **Method**: `Collections.shuffle(list)`
- **Use Case**: Randomly permuting the list elements.
- **Example**:
  ```java
  List<String> list = new ArrayList<>();
  list.add("Apple");
  list.add("Banana");
  list.add("Cherry");
  Collections.shuffle(list);
  System.out.println(list);
  ```

#### 4.4. **Reverse**

- **Method**: `Collections.reverse(list)`
- **Use Case**: Reversing the order of the elements.
- **Example**:
  ```java
  List<String> list = new ArrayList<>();
  list.add("Apple");
  list.add("Banana");
  list.add("Cherry");
  Collections.reverse(list);
  System.out.println(list);
  ```

### 5. **Performance Considerations**

#### 5.1. **ArrayList vs. LinkedList**

- **ArrayList**: Fast random access, slow insertions and deletions.
- **LinkedList**: Slow random access, fast insertions and deletions.

#### 5.2. **HashSet vs. TreeSet**

- **HashSet**: Fast access, no order.
- **TreeSet**: Slower access, maintains sorted order.

### 6. **Use Cases**

#### 6.1. **Managing Employee Data**

- **ArrayList**: Use for storing employee records if frequent access is required.
- **HashMap**: Use for storing employee ID and details for fast lookups.

#### 6.2. **Implementing a To-Do List**

- **PriorityQueue**: Use for managing tasks based on their priority.

#### 6.3. **Cache Implementation**

- **LinkedHashMap**: Use for LRU cache by overriding `removeEldestEntry()`.

### Example Code Snippets

#### ArrayList Example
```java
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List: " + list);

        // Iterating through the list
        for (String item : list) {
            System.out.println(item);
        }
    }
}
```

#### LinkedList Example
```java
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("John");
        list.add("Jane");

        // Iterating through the list
        for (String item : list) {
            System.out.println(item);
        }
    }
}
```

#### HashSet Example
```java
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("user1");
        set.add("user2");

        // Iterating through the set
        for (String item : set) {
            System.out.println(item);
        }
    }
}
```

#### TreeSet Example
```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("John");
        set.add("Jane");

        // Iterating through the set
        for (String item : set) {
            System.out.println(item);
        }
    }
}
```

#### HashMap Example
```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map

 = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 22);
        map.put("Jack", 29);

        // Iterating through the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

#### LinkedHashMap Example
```java
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("user1", "John Doe");
        map.put("user2", "Jane Doe");

        // Iterating through the map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

#### PriorityQueue Example
```java
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(15);

        // Iterating through the priority queue
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
```

#### ArrayDeque Example
```java
import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.push("First");
        deque.push("Second");

        // Iterating through the deque
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }
    }
}
```

### 1. **List**
A `List` in Java is an ordered collection that can contain duplicate elements. It provides positional access and can grow dynamically.

#### a. **ArrayList**
- **Characteristics**: Resizable array implementation, maintains insertion order, not synchronized.
- **Use Case**: Suitable for random access and fast iteration when the size is known to change frequently.
- **Common Methods**:
  - `add(E e)`: Adds an element.
  - `add(int index, E element)`: Adds an element at a specified position.
  - `remove(int index)`: Removes the element at a specified position.
  - `get(int index)`: Retrieves the element at a specified position.
  - `set(int index, E element)`: Replaces the element at a specified position.
  - `size()`: Returns the number of elements.

  ```java
  List<String> arrayList = new ArrayList<>();
  arrayList.add("A");
  arrayList.add("B");
  arrayList.add(1, "C"); // ["A", "C", "B"]
  ```

#### b. **Vector**
- **Characteristics**: Synchronized, resizable array implementation, maintains insertion order.
- **Use Case**: Suitable for thread-safe operations.
- **Common Methods**: Same as `ArrayList`, with the addition of thread safety.

  ```java
  List<String> vector = new Vector<>();
  vector.add("A");
  vector.add("B");
  vector.add(1, "C"); // ["A", "C", "B"]
  ```

#### c. **LinkedList**
- **Characteristics**: Doubly linked list implementation, maintains insertion order.
- **Use Case**: Suitable for frequent insertions and deletions.
- **Common Methods**:
  - `addFirst(E e)`: Adds an element at the beginning.
  - `addLast(E e)`: Adds an element at the end.
  - `removeFirst()`: Removes the first element.
  - `removeLast()`: Removes the last element.
  - Other methods similar to `ArrayList`.

  ```java
  LinkedList<String> linkedList = new LinkedList<>();
  linkedList.add("A");
  linkedList.add("B");
  linkedList.addFirst("C"); // ["C", "A", "B"]
  ```

### 2. **Set**
A `Set` in Java is an unordered collection that does not allow duplicate elements.

#### a. **HashSet**
- **Characteristics**: Unordered, allows null values, backed by a hash table.
- **Use Case**: Suitable for fast access, add, and removal operations.
- **Common Methods**:
  - `add(E e)`: Adds an element.
  - `remove(Object o)`: Removes an element.
  - `contains(Object o)`: Checks if an element is present.
  - `size()`: Returns the number of elements.

  ```java
  Set<String> hashSet = new HashSet<>();
  hashSet.add("A");
  hashSet.add("B");
  hashSet.add("A"); // ["A", "B"]
  ```

#### b. **TreeSet**
- **Characteristics**: Ordered, sorted based on natural ordering or a comparator, does not allow null values.
- **Use Case**: Suitable for sorted data.
- **Common Methods**:
  - `add(E e)`: Adds an element.
  - `remove(Object o)`: Removes an element.
  - `contains(Object o)`: Checks if an element is present.
  - `first()`: Retrieves the first element.
  - `last()`: Retrieves the last element.

  ```java
  Set<String> treeSet = new TreeSet<>();
  treeSet.add("B");
  treeSet.add("A");
  // ["A", "B"]
  ```

#### c. **LinkedHashSet**
- **Characteristics**: Maintains insertion order, allows null values, backed by a hash table and a linked list.
- **Use Case**: Suitable when the order of elements needs to be maintained.
- **Common Methods**: Same as `HashSet`.

  ```java
  Set<String> linkedHashSet = new LinkedHashSet<>();
  linkedHashSet.add("A");
  linkedHashSet.add("B");
  linkedHashSet.add("A"); // ["A", "B"]
  ```

### 3. **Map**
A `Map` in Java is an object that maps keys to values, with no duplicate keys allowed.


#### b. **LinkedHashMap**
- **Characteristics**: Maintains insertion order, allows one null key and multiple null values.
- **Use Case**: Suitable when the order of entries needs to be maintained.
- **Common Methods**: Same as `HashMap`.

  ```java
  Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
  linkedHashMap.put("A", 1);
  linkedHashMap.put("B", 2);
  ```

#### c. **TreeMap**
- **Characteristics**: Ordered, sorted based on natural ordering or a comparator, does not allow null keys.
- **Use Case**: Suitable for sorted key-value pairs.
- **Common Methods**:
  - `put(K key, V value)`: Adds a key-value pair.
  - `get(Object key)`: Retrieves the value for a key.
  - `remove(Object key)`: Removes a key-value pair.
  - `firstKey()`: Retrieves the first key.
  - `lastKey()`: Retrieves the last key.

  ```java
  Map<String, Integer> treeMap = new TreeMap<>();
  treeMap.put("B", 2);
  treeMap.put("A", 1); // Sorted order: {"A"=1, "B"=2}
  ```

### 4. **Cursors**
Cursors in Java provide a way to traverse through a collection.

#### a. **Iterator**
- **Characteristics**: Universal iterator for collections.
- **Use Case**: Suitable for iterating through a collection.
- **Common Methods**:
  - `hasNext()`: Checks if there is a next element.
  - `next()`: Retrieves the next element.
  - `remove()`: Removes the current element.

  ```java
  List<String> list = new ArrayList<>();
  list.add("A");
  list.add("B");
  Iterator<String> iterator = list.iterator();
  while (iterator.hasNext()) {
      System.out.println(iterator.next());
  }
  ```

#### b. **ListIterator**
- **Characteristics**: Bi-directional iterator for lists.
- **Use Case**: Suitable for iterating through a list in both directions.
- **Common Methods**:
  - `hasNext()`: Checks if there is a next element.
  - `next()`: Retrieves the next element.
  - `hasPrevious()`: Checks if there is a previous element.
  - `previous()`: Retrieves the previous element.
  - `add(E e)`: Adds an element.
  - `set(E e)`: Replaces the last element returned by `next` or `previous`.

  ```java
  List<String> list = new ArrayList<>();
  list.add("A");
  list.add("B");
  ListIterator<String> listIterator = list.listIterator();
  while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
  }
  while (listIterator.hasPrevious()) {
      System.out.println(listIterator.previous());
  }
  ```

#### c. **Enumeration**
- **Characteristics**: Legacy cursor for collections.
- **Use Case**: Suitable for older collections like `Vector` and `Hashtable`.
- **Common Methods**:
  - `hasMoreElements()`: Checks if there is a next element.
  - `nextElement()`: Retrieves the next element.

  ```java
  Vector<String> vector = new Vector<>();
  vector.add("A");
  vector.add("B");
  Enumeration<String> enumeration = vector.elements();
  while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
  }
  ```

### 5. **Java Collections (Utility Class)**
The `Collections` utility class provides static methods for operations on collections.

#### Common Methods
- `sort(List<T> list)`: Sorts a list.
- `reverse(List<?> list)`: Reverses a list.
- `shuffle(List<?> list)`: Randomly permutes a list.
- `binarySearch(List<? extends Comparable<? super T>> list, T key)`: Searches for a key in a sorted list.
- `max(Collection<? extends T> coll)`: Returns the maximum element.
- `min(Collection<? extends T> coll)`: Returns the minimum element.

  ```java
  List<String> list = new ArrayList<>();
  list.add("B");
  list.add
  Collections.sort(list); // ["A", "B"]
  Collections.reverse(list); // ["B", "A"]
  Collections.shuffle(list); // Random order
  ```

### 6. **Comparable & Comparator**
These interfaces are used for sorting collections.

#### a. **Comparable**
- **Use Case**: Used to define the natural ordering of objects.
- **Common Method**:
  - `compareTo(T o)`: Compares this object with the specified object for order.

  ```java
  public class Person implements Comparable<Person> {
      private String name;
      private int age;

      public Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      @Override
      public int compareTo(Person p) {
          return this.age - p.age; // Natural ordering by age
      }
  }
  ```

#### b. **Comparator**
- **Use Case**: Used to define custom ordering of objects.
- **Common Method**:
  - `compare(T o1, T o2)`: Compares its two arguments for order.

  ```java
  public class Person {
      private String name;
      private int age;

      public Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      // Getters
  }

  public class PersonNameComparator implements Comparator<Person> {
      @Override
      public int compare(Person p1, Person p2) {
          return p1.getName().compareTo(p2.getName()); // Custom ordering by name
      }
  }
  ```

### 7. **Collection and Generics**
Generics in Java allow you to specify types for collections, providing type safety at compile time.

#### Use Case
- **Type Safety**: Ensures that the collection contains only a specified type.
- **Common Methods**: Same as non-generic collections, but with type parameters.

  ```java
  List<String> stringList = new ArrayList<>();
  stringList.add("A");
  stringList.add("B");

  // Compilation error if trying to add an integer
  // stringList.add(1); 
  ```


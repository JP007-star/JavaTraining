import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe", "John");

        // Intermediate and Terminal Operations
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredNames);  // Output: [Jack, Jane, John]

        // Reduce operation
        String concatenatedNames = names.stream()
                .reduce("", (a, b) -> a + b);

        System.out.println(concatenatedNames);  // Output: JohnJaneJackDoeJohn

        // Count operation
        long count = names.stream().count();
        System.out.println(count);  // Output: 5

        // Parallel Stream
        List<String> parallelNames = names.parallelStream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(parallelNames);  // Output: [JOHN, JANE, JACK, DOE, JOHN]
    }
}

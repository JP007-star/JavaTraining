
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {

    public static String findDuplicates(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "Jaya Prasad";
        String duplicates = findDuplicates(input);
        System.out.println(duplicates); // Output: a
    }


    // Test cases
    @org.junit.jupiter.api.Test
    void testFindDuplicates_basic() {
        assert findDuplicates("Jaya Prasad").equals("a");
    }

    @org.junit.jupiter.api.Test
    void testFindDuplicates_noDuplicates() {
        assert findDuplicates("abcd").isEmpty();
    }

    @org.junit.jupiter.api.Test
    void testFindDuplicates_multipleDuplicates() {
        assert findDuplicates("aabbcc").equals("abc");
    }

    @org.junit.jupiter.api.Test
    void testFindDuplicates_emptyString() {
        assert findDuplicates("").isEmpty();
    }

    @org.junit.jupiter.api.Test
    void testFindDuplicates_withSpaces() {
        assert findDuplicates("  aa bb  ").equals("ab");
    }


}

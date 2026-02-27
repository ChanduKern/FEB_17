import java.util.*;

public class lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "John", "Alex");

        names.sort((a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}
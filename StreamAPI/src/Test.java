import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();

        String[] array = {"apple", "banana", "cherry"};
        Stream<String> stream1 = Arrays.stream(array);

        Stream<Integer> integerstream = Stream.of(1, 2, 3);

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        Stream<String> limit1 = Stream.generate(() -> "hello").limit(5);

        Stream<Integer> limit2 = Stream.generate(() -> (int) Math.random() * 100).limit(10);


    }
}

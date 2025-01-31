import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 0, 0, 2, 3, 4, 7, 5, 433, 5, 3, 22);
        List<Integer> filteredlist = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredlist);
        List<Integer> mappedlist = filteredlist.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mappedlist);

        List<Integer> filteredlist1 = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().collect(Collectors.toList());
        System.out.println(filteredlist1);

        List<Integer> filteredlist2 = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().sorted().collect(Collectors.toList());
        System.out.println(filteredlist2);

        List<Integer> filteredlist3 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b)->(b-a))
                .collect(Collectors.toList());
        System.out.println(filteredlist3);

        List<Integer> filteredlist4 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b)->(b-a))
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(filteredlist4);

        Stream.iterate(0,x->x+1)
                .limit(101)
                .skip(1)
                .filter(x->x%2==0)
                .map(x->x/10)
                .distinct()
                .sorted()
                .peek(x->System.out.println(x))
                .collect(Collectors.toList());

        long count = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .count();
        System.out.println(count);


    }
}


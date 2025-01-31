import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
public class ParallelStream
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.parallelStream();//apply only on large list
    }
}

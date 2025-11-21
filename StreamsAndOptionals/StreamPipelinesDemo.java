package StreamsAndOptionals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2
public class StreamPipelinesDemo {
  public static void main(String[] args) {
    // Stream pipelines
    /**
     * 3 PARTS
     * 
     * 1. Source ( List, Arrays etc that we convert into stream)
     * 2. Intermediate operation (Perform some intermidate operation on the stream
     * such as filter, map etc. Also returns a stream). Intermediate operations are
     * lazy meaning, they won't be executed till terminal operations are called
     * 3. Terminal operation (Collect the stream into a usable final state such as a
     * List
     * etc)
     */
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

    List<Integer> evenNums = nums.stream() // source
        .filter((num) -> num % 2 == 0) // intermediate operation (filtering). This is lazy operation, it will not be
                                       // executed till terminal operation is called.
        .collect(Collectors.toList()); // terminal operation (collecting)
    System.out.println(evenNums); // [2, 4, 6, 8]

    System.out.println(nums); // [1, 2, 3, 4, 5, 6, 7, 8] Original list is un modified
  }
}

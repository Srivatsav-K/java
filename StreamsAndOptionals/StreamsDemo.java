package StreamsAndOptionals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1
public class StreamsDemo {
  public static void main(String[] args) {
    // Streams --> Assembly line / pipeline

    List<String> fruits = Arrays.asList("Apple", "Mango", "Banana");

    // Iterating using for of loop
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    // Stream -> A sequence of elements supporting sequential and parallel aggregate
    // operations

    // Iterate using streams
    Stream<String> stream = fruits.stream(); // a stream once created cannot be reused for any other operations, we need
                                             // to create a new stream if needed
    stream.forEach((fruit) -> System.out.println(fruit));

    // Filtering using streams
    Stream<String> fruitsStartingWithA = fruits.stream()
        .filter((fruit) -> fruit.startsWith("A"));
    fruitsStartingWithA.forEach((fruit) -> System.out.println("Fruit starting with A : " + fruit));

    /**
     * USE CASES
     * 1. Filtering
     * 2. Mapping
     * 3. Aggregation (Ex. add all elements in a list etc)
     * 4. Searching
     * 5. Iteration (Iterate & perform any action on each element)
     */

  }

}

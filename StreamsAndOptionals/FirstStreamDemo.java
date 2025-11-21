package StreamsAndOptionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//3
public class FirstStreamDemo {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    // Iteration 1 : Filter even numbers traditionally
    List<Integer> evenNumbers1 = new ArrayList<>();
    for (Integer num : numbers) {
      if (num % 2 == 0) {
        evenNumbers1.add(num);
      }
    }
    System.out.println(evenNumbers1);

    // Iteration 2
    Stream<Integer> numsStream = numbers.stream();
    Predicate<Integer> isEven = (num) -> num % 2 == 0;
    Stream<Integer> filteredNumsStream = numsStream.filter(isEven);
    List<Integer> evenNumbers2 = filteredNumsStream.toList();
    System.out.println(evenNumbers2);

    // Iteration 3
    List<Integer> evenNumbers3 = numbers.stream()
        .filter((num) -> num % 2 == 0)
        .toList();
    System.out.println(evenNumbers3);
  }
}

package StreamsAndOptionals.Terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperationsDemo {
  // Terminal operations run after intermediate operations
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 5);

    // reduce
    int sum = nums.stream().reduce(0, (acc, curr) -> {
      return acc + curr;
    });
    System.out.println(sum);

    int sumMethodReference = nums.stream().reduce(0, Integer::sum);
    System.out.println(sumMethodReference);

    // collect
    Set<Integer> evenNumsSet = nums.stream()
        .filter((num) -> num % 2 == 0)
        .collect(Collectors.toSet()); // the additional 2 in the original list wont be printed as set removes
                                      // duplicate values
    System.out.println(evenNumsSet);

    // findFirst
    // (Returns an Optional describing the first element of this stream,
    // or an empty Optional if the stream is empty. If the stream has no encounter
    // order, then any element may be returned.)
    int firstEleOfStream = nums.stream().findFirst().get();
    System.out.println(firstEleOfStream);

    // findAny
    // (Returns an Optional describing some element of the stream, or an
    // empty Optional if the stream is empty.)
    // The behavior of this operation is explicitly nondeterministic; it is free to
    // select any element in the stream. This is to allow for maximal performance in
    // parallel operations for ex. in nums.parallelStream();
    int anyEleOfStream = nums.stream().findAny().get();
    System.out.println(anyEleOfStream);

    // match
    // Returns whether any elements of this stream match the provided predicate
    boolean has3 = nums.stream().anyMatch((n) -> n == 2);
    System.out.println(has3);

    // allMatch
    // Returns whether all elements of this stream match the provided predicate
    boolean isAllDivisibleBy1 = nums.stream().allMatch(n -> n % 1 == 0);
    System.out.println(isAllDivisibleBy1);

    // noneMatch
    // Returns whether no elements of this stream match the provided predicate
    boolean isAllNotNull = nums.stream().noneMatch(n -> n == null);
    System.out.println(isAllNotNull);

    // forEach
    nums.stream().forEach(System.out::println);

  }

}

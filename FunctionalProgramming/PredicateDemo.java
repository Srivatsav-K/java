package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) {
    // Represents a predicate (boolean-valued function) of one argument.
    Predicate<Integer> isEven = (num) -> num % 2 == 0;
    System.out.println(isEven.test(2)); // true
    System.out.println(isEven.test(3)); // false

    BiPredicate<String, String> textContainsWord = (text, word) -> {
      List<String> words = Arrays.asList(text.toLowerCase().split(" "));
      return words.contains(word.toLowerCase());
    };
    System.out.println(textContainsWord.test("Sun rises in the east", "sun"));
  }
}

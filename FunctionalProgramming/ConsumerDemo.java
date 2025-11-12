package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    // Represents an operation that accepts a single input argument and returns no
    // result
    Consumer<String> logger = (s) -> System.out.println("Logger is logging : " + s);
    logger.accept("Hello world");

    Consumer<String> consumer = System.out::println;
    consumer.accept("Method reference consumer");

    List<Integer> nums = Arrays.asList(1, 2, 3, 4);
    Consumer<Integer> multiplyBy2 = (num) -> System.out.println(num * 2);
    // forEach takes in a consumer
    nums.forEach(multiplyBy2);

    BiConsumer<Integer, Integer> add = (a, b) -> System.out.println("The sum of bi consumer is " + (a + b));
    add.accept(1, 2);
  }
}

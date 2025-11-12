package FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceDemo {
  // Docs :
  // https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

  // Function interface (Represents a function that accepts one argument and
  // produces a result). It has an abstract method apply that needs to be
  // implemented via a lambda or traditionally
  public static Function<Integer, Integer> addTwo = (a) -> a + 2;

  // Represents a function that accepts two arguments and produces a result. This
  // is the two-arity specialization of Function interface
  public static BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

  // You can chain multiple Functions as well by using `andThen`
  public static Function<Integer, Integer> subOne = (a) -> a - 1;
  public static Function<Integer, Integer> combinedFunction = addTwo.andThen(subOne);

  public static void main(String[] args) {
    System.out.println(addTwo.apply(5)); // 7

    System.out.println(add.apply(1, 2)); // 3

    System.out.println(combinedFunction.apply(3)); // 4
  }
}

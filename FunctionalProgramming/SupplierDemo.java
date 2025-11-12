package FunctionalProgramming;

import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) {
    // Takes no argument but returns a value whose type is specified
    Supplier<Double> getRandomNumberBetween0And1 = Math::random;
    System.out.println(getRandomNumberBetween0And1.get());
  }
}

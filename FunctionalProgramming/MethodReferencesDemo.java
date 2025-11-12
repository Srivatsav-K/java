package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesDemo {
  public static void main(String[] args) {
    // ::

    List<String> names = Arrays.asList("Jack", "Bob", "Alice");

    // Regular for loop
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    // Enhanced for loop
    for (String name : names) {
      System.out.println(name);
    }

    // for each loop
    names.forEach(new Consumer<String>() {
      @Override
      public void accept(String name) {
        System.out.println(name);
      };
    });

    names.forEach((name) -> System.out.println(name));

    // Method reference
    names.forEach(System.out::println);
  }

}

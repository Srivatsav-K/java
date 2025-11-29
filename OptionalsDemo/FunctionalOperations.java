package OptionalsDemo;

import java.util.Optional;

public class FunctionalOperations {
  public static void main(String[] args) {
    Optional<String> name = Optional.ofNullable("Sri");
    Optional<String> empty = Optional.ofNullable(null);

    // ifPresent()
    name.ifPresent((value) -> {
      System.out.println(value);
    });

    // map()
    Optional<String> upppercasedName = name.map((value) -> value.toUpperCase());
    System.out.println(upppercasedName.orElse("No value")); // SRI

    Optional<String> upppercasedEmptyName = empty.map((value) -> value.toUpperCase());
    System.out.println(upppercasedEmptyName.orElse("No value")); // No value

    // filter
    Optional<String> result = name.filter((value) -> value.startsWith("S"));
    result.ifPresent(System.out::println); // Stri

    // Combined operation
    name
        .filter((value) -> value.startsWith("S"))
        .map((value) -> value.toUpperCase())
        .ifPresentOrElse(System.out::println, () -> {
          System.out.println("No value present");
        });
  }
}

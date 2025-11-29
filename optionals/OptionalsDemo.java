package optionals;

import java.util.Optional;

public class OptionalsDemo {
  public static void main(String[] args) {
    // Optionals
    // A container object which may or may not contain a non-null value. If a value
    // is present, isPresent() returns true

    // Creating optionals
    Optional<String> optionalString = Optional.of("Java");
    System.out.println(optionalString); // Optional[Java]

    // throws java.lang.NullPointerException
    // Optional<String> optionalString1 = Optional.of(null);
    // System.out.println(optionalString1);

    Optional<String> emptyOptional = Optional.empty();
    System.out.println(emptyOptional); // Optional.empty

    Optional<String> maybe = Optional.ofNullable(null);
    System.out.println(maybe); // Optional.empty

    Optional<String> maybe1 = Optional.ofNullable("hello");
    System.out.println(maybe1); // Optional[hello]

    // Checking values
    System.out.println(optionalString.isPresent()); // true
    System.out.println(maybe.isPresent()); // false
    System.out.println(emptyOptional.isEmpty()); // true

    // Retrieve values
    // get()
    System.out.println(optionalString.get()); // Java

    // java.util.NoSuchElementException: No value present
    // ! System.out.println(maybe.get());

    // orElse() -> If a value is present, returns the value, otherwise returns other
    System.out.println(optionalString.orElse("Default value")); // Java
    System.out.println(maybe.orElse("Default value")); // Default value

    String temp = emptyOptional.orElse("Default value"); // Default value
    System.out.println(temp);

    // orElseGet(<Supplier>)
    String result = maybe.orElseGet(() -> {
      System.out.println("Generating default value");
      return "Default";
    });
    System.out.println(result); // Default

    // orElseThrow()
    String result1 = maybe.orElseThrow(() -> {
      throw new RuntimeException("No element found");
    });
    System.out.println(result1);

  }
}

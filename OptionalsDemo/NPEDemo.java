package OptionalsDemo;

import java.util.Optional;

public class NPEDemo {
  public static void main(String[] args) {
    String name = null;

    System.out.println(name);

    // throws null pointer exception
    // System.out.println(name.length());

    // Before Optionals
    if (name != null) {
      System.out.println(name.length());
    } else {
      System.out.println("No name value");
    }

    // After Optionals
    Optional<String> nameOptional = Optional.ofNullable(name);
    System.out.println(nameOptional.orElse("No name value"));

  }
}

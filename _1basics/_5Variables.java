public class _5Variables {
  public static void main(String[] args) {
    // Syntax : <dataType> <variableName> = <value>;
    String name = "Sri";
    System.out.println(name);

    // Variables can be reassigned
    name = "John";
    System.out.println(name);

    // ! variables cannot be re-declared
    // String name = "Doe"

    // final variables must be initialized, cannot be reassigned, cannot be
    // re-declared
    final int age = 20;
    // age = 10; //! error: cannot assign a value to final variable age
    System.out.println(age);
  }
}

public class _3Strings {
  public static void main(String[] args) {
    // Strings are immutable

    String name = "Sri";
    System.out.println(name);

    // length()
    System.out.println(name.length()); // 3

    // chatAt()
    System.out.println(name.charAt(2)); // i

    // subString()
    System.out.println(name.substring(0, 2)); // Sr (excludes endIndex)
    System.out.println(name.substring(0)); // Sri

    // concatination
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName + " " + lastName);

    // equals()
    String goat = "messi";
    String messi = "messi";
    System.err.println(goat.equals(messi)); // true
    System.err.println(goat == messi); // true
  }
}

public class _9ExceptionHandling {
  public static void main(String[] args) {
    try {
      System.out.println(10 / 0);
    } catch (Exception e) {
      // If you are sure it is an ArithmeticException, you can write it as
      // ArithmeticException instead of Exception

      System.out.println(e); // "java.lang.ArithmeticException: / by zero"
    } finally {
      System.out.println("Finally block"); // This block will always be executed, even if an exception is thrown
    }
  }
}

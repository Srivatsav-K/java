public class _8Loops {
  public static void main(String[] args) {
    // for loop
    System.out.println("for loop");
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    // while loop
    System.out.println("while loop");
    int num = 10;
    while (num > 0) {
      System.out.println(num);
      num--;
    }

    // do while loop (will execute at least once. Use break statement inside do
    // block if you need to stop and exit execution)
    System.out.println("do while loop");
    int num2 = 5;
    do {
      System.out.println(num2);
      num2--;
    } while (num2 > 0);

    // for each loop (can be used only on a java iterable not on strings)
    System.out.println("for each loop");
    String[] cities = { "London", "Paris", "Delhi" };
    for (String city : cities) {
      System.out.println(city);
    }
  }
}

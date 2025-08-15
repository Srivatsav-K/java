public class _7ConditionalStatements {
  public static void main(String[] args) {
    int age = 20;
    if (age >= 18) {
      System.out.println("You are an adult");
    } else {
      System.out.println("You are not an adult");
    }

    // Ternary operator
    String message = age >= 18 ? "You are an adult" : "You are not an adult";
    System.out.println(message);

    // Switch statement
    int weekDay = 5;
    switch (weekDay) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break; // Without break, the code will fall through to the next case (if weekDay is 2,
               // it will print this and the remaining cases as well)
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid week day");
        break;
    }
  }
}

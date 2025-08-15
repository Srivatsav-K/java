import java.util.Scanner;

class _4InputOutput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Always close scanner once done

    System.out.print("Enter a number: ");
    int num = scanner.nextInt(); // Reads the number and assigns it to num variable
    System.out.println("Entered number is : " + num);

    System.out.print("Enter a message: ");
    scanner.nextLine(); // consume the leftover newline
    String message = scanner.nextLine();
    System.out.println("Entered message is : " + message);

    System.out.print("Enter your full name: ");
    // Input -> john doe (automatically splits into fName and lName by space)
    String fName = scanner.next();
    String lName = scanner.next();
    System.out.println("Full name is : " + fName + " " + lName);

    scanner.close(); // Always close scanner once done
  }
}

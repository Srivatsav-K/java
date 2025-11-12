package FunctionalProgramming;

// A functional interface has exactly one abstract method
@FunctionalInterface // We can annotate a functional iterface with this for better compiler support
interface BookAction {
  void perform();
}

// Functional interface with parameters
@FunctionalInterface
interface AdditionOperation {
  Integer add(Integer a, Integer b);
}

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    // Step 1 (Here we are providing the implementation of functional interface's
    // perform() method inline on the
    // fly
    // while initialising the class)
    BookAction action = new BookAction() {
      @Override
      public void perform() {
        System.out.println("Step 1 : Action performed");

      }
    };
    action.perform();

    // Step 2 (Since we know that all functional interfaces can have only one method
    // we can provide the implementation using lambdas thereby reducing boilerplate
    // code)
    BookAction action2 = () -> {
      System.out.println("Step 2 : Action performed");
    };
    action2.perform();

    // Step 3 (We can provide the impl in single line if the operation is simple)
    BookAction action3 = () -> System.out.println("Step 3 : Action performed");
    action3.perform();

    // Functional interface with parameters
    AdditionOperation additionOperation = (a, b) -> a + b;
    System.out.println(additionOperation.add(2, 3));

    // Implementing the built in Functional interface (Runnable)
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("New thread created");
      };
    }).start();

    System.out.println("Test 1");

    new Thread(() -> System.out.println("New thread created by using lambda")).start();

    System.out.println("Test 2");

    // Order of exec
    // Test 1
    // New thread created
    // Test 2
    // New thread created by using lambda
  }

}

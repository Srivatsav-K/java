package Threads;

class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }
}

class Dog extends Animal implements Runnable {

  Dog(String name) {
    super(name);
  }

  void bark() {
    System.out.println(this.name + " is " + "barking :");

    for (int i = 0; i < 100; i++) {
      System.out.println("Barking..");
    }
  }

  @Override
  public void run() {
    this.bark();
  }

}

class Cat extends Animal implements Runnable {

  Cat(String name) {
    super(name);
  }

  void bark() {
    System.out.println(this.name + " is " + "meowing :");

    for (int i = 0; i < 100; i++) {
      System.out.println("meowing..");
    }
  }

  @Override
  public void run() {
    this.bark();
  }

}

public class RunnableDemo {
  // If a class extends Thread, then it cannot extend anything else as multiple
  // inheritance is not allowed in java. Therefore we can use Runnable interface

  public static void main(String[] args) {
    Dog tommy = new Dog("Tommy");
    Cat milo = new Cat("Milo");

    Thread t1 = new Thread(tommy); // takes in a Runnable
    Thread t2 = new Thread(milo);

    t1.start();
    t2.start();

    // We can use lamda as Runnable is a Functional interface
    Thread t3 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println("Printing from t3");
        }
      }
    });
    t3.start();

    Thread t4 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Printing from t4");
      }
    });
    t4.start();

  }

}

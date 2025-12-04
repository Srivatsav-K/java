package Threads;

class C extends Thread {

  public void run() {
    for (int i = 0; i <= 100; i++) {
      System.out.println("Hi");
    }
  }

}

class D extends Thread {

  public void run() {
    for (int i = 0; i <= 100; i++) {
      System.out.println("Hello");
    }
  }

}

public class ThreadPriorityAndSleep {

  public static void main(String[] args) {
    C c = new C();
    D d = new D();

    System.out.println(c.getPriority()); // Default Priority is 5. (max priority is 10 and min priority is 1)
    System.out.println(d.getPriority()); // 5

    // We can set priority but it is not guaranteed
    c.setPriority(1);
    d.setPriority(Thread.MAX_PRIORITY);

    c.start();

    // We can delay execution using Thread.sleep()
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    d.start();

  }

}

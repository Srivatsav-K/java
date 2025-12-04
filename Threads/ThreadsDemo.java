package Threads;

class A extends Thread {

  public void run() {
    for (int i = 0; i <= 100; i++) {
      System.out.println("Hi");
    }
  }

}

class B extends Thread {

  public void run() {
    for (int i = 0; i <= 100; i++) {
      System.out.println("Hello");
    }
  }

}

public class ThreadsDemo {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();

    /*
     * An operation will run in a separate Thread if a class extends Thread class
     * - The class should have a run() method
     * - Can be invoked by calling the start() method. This will exceute the
     * implementation defined in run() method in a thread
     * 
     * - The thread will execute independently of the current thread.
     * - A thread can be started at most once. In particular, a thread can not be
     * restarted after it has terminated. (throws IllegalThreadStateException - if
     * the thread was already started)
     * 
     * It is the Scheduler's job to allocate threads and run the code in multiple
     * threads
     */

    a.start();
    // a.start(); //throws IllegalThreadStateException

    b.start();

    System.out.println("Executing in multiple threads");

  }
}

package Threads;

class Counter {
  int count;

  void increment() {
    count++;
  }
}

class ThreadSafeCounter {
  int count;

  synchronized void increment() {
    count++;
  }
}

public class RaceCondition {
  public static void main(String[] args) {
    Counter c = new Counter();

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        c.increment();
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        c.increment();
      }
    });

    t1.start();
    t2.start();

    System.out.println(c.count); // might not print 2000 as expected as this might run before both the threads
                                 // complete execution

    // You can wait for the execution to get completed before executing anthing else
    try {
      t1.join();
      t2.join();

      System.out.println(c.count); // Even now it is not 2000 as while doing count = count + 1, Two threads might
                                   // get the same count when they try to acess it at the same time.
                                   // For ex : t1 -> count = 2(got same count) + 1
                                   // and t2 -> count = 2(got same count) +1

      // To avoid this we should make only one thread work with a resource at a given
      // time by adding `synchronized` to the method. See below
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Thread safe counter

    ThreadSafeCounter c1 = new ThreadSafeCounter();
    Thread t3 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        c1.increment();
      }
    });

    Thread t4 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        c1.increment();
      }
    });

    t3.start();
    t4.start();

    System.out.println("Thread safe counter before awaiting both the threads : " + c1.count);

    try {
      t3.join();
      t4.join();
      System.out.println("Thread safe counter after awaiting both the threads : " + c1.count); // 2000
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

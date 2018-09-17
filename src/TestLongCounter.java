public class TestLongCounter {
  public static void main(String[] args) {
    final int range = 100_000_000;
    final LongCounter lc = new LongCounter();
    final int threadCount = 10;
    final int perThread = range / threadCount;
    Thread[] threads = new Thread[threadCount];
    for (int t=0; t<threadCount; t++) {
      final int from = perThread * t, to = (t+1==threadCount) ? range : perThread * (t+1); 
      threads[t] = new Thread(() -> {
        System.out.println("Thread from " + from + " to: " + to);
        for (int i=from; i<to; i++) {
            lc.increment();
        }
      });
    }

    for (Thread t : threads) {
        t.start();
    }
    for (Thread t : threads) {
        try {
            t.join();
        } catch(Exception e) {}
    }
    System.out.println("Count is: " + lc.get() + " and should be " + range);
  }
}

class LongCounter {
  private long count = 0;
  public synchronized void increment() {
    count = count + 1;
  }

  public void decrement() {
    count -= 1;
  }

  public  long get() { 
    return count; 
  }
}
public class TestLongCounter {
  public static void main(String[] args) {
    LongCounter lc = new LongCounter();
    lc.printMyName();
  }
}

class LongCounter {
  private long count = 0;
  public void decrement() {
      count = count - 1;
  }
  public void minmetode() {int i = 100;}

  public  long get() { 
    return count; 
  }

  public void printMyName() {
    for(int i = 1; i<=100; i++) {
      if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
      else if(i % 3 == 0) System.out.println("Fizz");
      else if(i % 5 == 0) System.out.println("Buzz");
      else System.out.println(i);
    }
  }
}


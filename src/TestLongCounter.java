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
    System.out.print("Morten");
  }
}

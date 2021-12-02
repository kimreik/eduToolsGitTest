import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() throws InterruptedException {

    AtomicInteger counter = new AtomicInteger();
    TestRunnable command = new TestRunnable(counter);
    new CustomThreadPoolExecutor(10)
        .execute(command);
    Thread.sleep(100);
    assertEquals(42, counter.get());
  }
}

@Repeat(42)
class TestRunnable implements Runnable{

  final AtomicInteger counter;

  TestRunnable(AtomicInteger counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    counter.incrementAndGet();
  }
}
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void constructorCreatesArrayOfSpecifiedSize() {
    assertEquals(42, new CircularQueue(42).queue.length);
  }

  @Test
  public void enQueueReturnsFalseIfQueueIsFull(){
    CircularQueue queue = new CircularQueue(1);
    queue.enQueue(1);
    assertFalse(queue.enQueue(2));
  }

  @Test
  public void deQueueReturnsFalseIfQueueIsEmpty(){
    CircularQueue queue = new CircularQueue(1);
    assertFalse(queue.deQueue());
  }

  @Test
  public void deQueueDoesNotMoveTheElementsOfInternalArray(){
    CircularQueue queue = new CircularQueue(3);
    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);

    assertEquals(1, queue.queue[0]);
    assertEquals(2, queue.queue[1]);
    assertEquals(3, queue.queue[2]);

    queue.deQueue();

    assertEquals(1, queue.queue[0]);
    assertEquals(2, queue.queue[1]);
    assertEquals(3, queue.queue[2]);

    queue.enQueue(4);

    assertEquals(4, queue.queue[0]);
    assertEquals(2, queue.queue[1]);
    assertEquals(3, queue.queue[2]);


  }

}
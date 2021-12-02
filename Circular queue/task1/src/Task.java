public class Task {

  public static void main(String[] args) {
    CircularQueue queue = new CircularQueue(3);
    assert queue.isEmpty();
    assert !queue.isFull();

    assert !queue.deQueue();

    queue.enQueue(1);
    assert !queue.isEmpty();
    assert !queue.isFull();

    queue.enQueue(2);
    assert !queue.isEmpty();
    assert !queue.isFull();

    queue.enQueue(3);
    assert !queue.isEmpty();
    assert queue.isFull();

    assert !queue.enQueue(4);

    assert queue.front() == 1;
    assert queue.rear() == 3;

    queue.deQueue();

    assert queue.front() == 2;
    assert queue.rear() == 3;
    assert !queue.isFull();

  }

}
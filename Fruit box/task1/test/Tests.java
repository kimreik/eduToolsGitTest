import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
  @Test
  public void canNotAddAppleToOrangesBox() {

    Box<Orange> orangeBox = new Box<>();
    orangeBox.add(new Orange(), new Orange());

    Box<Orange> newOrangeBox = new Box<>();

    orangeBox.sendFruits(newOrangeBox);

    assertEquals(0, orangeBox.getFruits().size());
    assertEquals(2, newOrangeBox.getFruits().size());

  }
}
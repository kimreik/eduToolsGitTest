import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

  @Test
  public void defaultConstructor(){
    Square square = new Square();
    Assert.assertEquals(1.0, square.getWidth(), 0.01);
    Assert.assertEquals(1.0, square.getLength(), 0.01);
  }

  @Test
  public void widthLengthConstructor(){
    Square square = new Square(42.0);
    Assert.assertEquals(42.0, square.getWidth(), 0.01);
    Assert.assertEquals(42.0, square.getLength(), 0.01);
  }

  @Test
  public void allArgsConstructor() {
    Square square = new Square(42.0, "green", false);
    Assert.assertEquals("green", square.getColor());
    Assert.assertFalse(square.isFilled());
    Assert.assertEquals(42.0, square.getWidth(), 0.01);
    Assert.assertEquals(42.0, square.getLength(), 0.01);
  }

  @Test
  public void squareToString(){
    Square redFilled5 = new Square(5, "red", true);
    Square greenUnfilled10 = new Square(10, "green", false);

    Assert.assertEquals("Square[Rectangle[Shape[color=red,filled=true],width=5.0,length=5.0]]", redFilled5.toString());
    Assert.assertEquals("Square[Rectangle[Shape[color=green,filled=false],width=10.0,length=10.0]]", greenUnfilled10.toString());
  }

  @Test
  public void area(){
    Square square = new Square(5.0);

    assertEquals(25.0, square.getArea(), 0.01);
  }

  @Test
  public void perimeter(){
    Square square = new Square(9.0);

    assertEquals(36, square.getPerimeter(), 0.01);
  }
  
  @Test
  public void setWidth(){
    Square square = new Square();
    square.setWidth(42.0);
    Assert.assertEquals(42.0, square.getLength(), 0.01);
  }

  @Test
  public void setLength(){
    Square square = new Square();
    square.setLength(42.0);
    Assert.assertEquals(42.0, square.getWidth(), 0.01);
  }

}
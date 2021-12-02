import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

  @Test
  public void defaultConstructor(){
    Rectangle rectangle = new Rectangle();
    Assert.assertEquals(1.0, rectangle.getWidth(), 0.01);
    Assert.assertEquals(1.0, rectangle.getLength(), 0.01);
  }

  @Test
  public void widthLengthConstructor(){
    Rectangle rectangle = new Rectangle(42.0, 21.0);
    Assert.assertEquals(42.0, rectangle.getWidth(), 0.01);
    Assert.assertEquals(21.0, rectangle.getLength(), 0.01);
  }

  @Test
  public void allArgsConstructor() {
    Rectangle rectangle = new Rectangle(42.0, 21.0, "green", false);
    Assert.assertEquals("green", rectangle.getColor());
    Assert.assertFalse(rectangle.isFilled());
    Assert.assertEquals(42.0, rectangle.getWidth(), 0.01);
    Assert.assertEquals(21.0, rectangle.getLength(), 0.01);
  }

  @Test
  public void rectangleToString(){
    Rectangle redFilled5to10 = new Rectangle(5, 10, "red", true);
    Rectangle greenUnfilled10to20 = new Rectangle(10, 20, "green", false);

    Assert.assertEquals("Rectangle[Shape[color=red,filled=true],width=5.0,length=10.0]", redFilled5to10.toString());
    Assert.assertEquals("Rectangle[Shape[color=green,filled=false],width=10.0,length=20.0]", greenUnfilled10to20.toString());
  }

  @Test
  public void area(){
    Rectangle rectangle = new Rectangle(5.0, 10.0);

    assertEquals(50.0, rectangle.getArea(), 0.01);
  }

  @Test
  public void perimeter(){
    Rectangle rectangle = new Rectangle(5.0, 10.0);

    assertEquals(30, rectangle.getPerimeter(), 0.01);
  }

}
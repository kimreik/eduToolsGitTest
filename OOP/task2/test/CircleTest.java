import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

  @Test
  public void defaultConstructor(){
    Circle circle = new Circle();
    Assert.assertEquals(1.0, circle.getRadius(), 0.01);
  }

  @Test
  public void radiusConstructor(){
    Circle circle = new Circle(42.0);
    Assert.assertEquals(42.0, circle.getRadius(), 0.01);
  }

  @Test
  public void allArgsConstructor() {
    Circle circle = new Circle(42.0, "green", false);
    Assert.assertEquals("green", circle.getColor());
    Assert.assertFalse(circle.isFilled());
    Assert.assertEquals(42.0, circle.getRadius(), 0.01);
  }

  @Test
  public void  circleToString(){
    Circle redFilled5 = new Circle(5, "red", true);
    Circle greenUnfilled10 = new Circle(10, "green", false);

    Assert.assertEquals("Circle[Shape[color=red,filled=true],radius=5.0]", redFilled5.toString());
    Assert.assertEquals("Circle[Shape[color=green,filled=false],radius=10.0]", greenUnfilled10.toString());
  }

  @Test
  public void area(){
    Circle circle = new Circle(2.0);

    //2*2*PI
    assertEquals(12.56, circle.getArea(), 0.01);
  }

  @Test
  public void perimeter(){
    Circle circle = new Circle(5.0);

    //2*5*PI
    assertEquals(31.41, circle.getPerimeter(), 0.01);
  }

}
import static org.junit.Assert.assertEquals;

import java.awt.Color;
import org.junit.Test;

public class Tests {

  @Test
  public void defaultConstructorShouldCreateRedCircleWithRadiusOf1() {
    Circle circle = new Circle();
    assertEquals(1.0, circle.getRadius(), 0.0);
    assertEquals(Color.RED, circle.getColor());
  }

  @Test
  public void constructorWithRadiusParameter(){
    double radius = 42.0;
    Circle circle = new Circle(radius);
    assertEquals(radius, circle.getRadius(), 0.01);
    assertEquals(Color.RED, circle.getColor());
  }

  @Test
  public void constructorWithRadiusAndColorParameters(){
    double radius = 42.0;
    Color color = Color.BLACK;

    Circle circle = new Circle(radius, color);
    assertEquals(radius, circle.getRadius(), 0.01);
    assertEquals(color, circle.getColor());
  }

  @Test
  public void areaCalculationTest() {
    Circle circle = new Circle(2.0);


    //2*2*PI
    assertEquals(12.56, circle.getArea(), 0.01);
  }
}
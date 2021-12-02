import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {

  @Test
  public void defaultConstructor(){
    Shape shape = new Shape();
    Assert.assertEquals("red", shape.getColor());
    Assert.assertTrue(shape.isFilled());
  }

  @Test
  public void allArgsConstructor() {
    Shape shape = new Shape("green", false);
    Assert.assertEquals("green", shape.getColor());
    Assert.assertFalse(shape.isFilled());
  }

  @Test
  public void  shapeToString(){
    Shape redFilled = new Shape("red", true);
    Shape greenUnfilled = new Shape("green", false);

    Assert.assertEquals("Shape[color=red,filled=true]", redFilled.toString());
    Assert.assertEquals("Shape[color=green,filled=false]", greenUnfilled.toString());
  }
}

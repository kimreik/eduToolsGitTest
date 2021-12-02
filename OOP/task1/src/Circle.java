import java.awt.Color;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
  // private instance variable, not accessible from outside this class
  private double radius;
  private Color color;

  // Constructors (overloaded)
  /** Constructs a Circle instance with default value for radius and color */
  public Circle() {  // 1st (default) constructor
    radius = 1.0;
    color = Color.RED;
  }

  /** Constructs a Circle instance with the given radius and default color */
  public Circle(double r) {  // 2nd constructor
    radius = r;
    color = Color.RED;
  }
  /** Constructs a Circle instance with the given radius and color */
  public Circle(double r, Color c) {
    radius = r;
    color = c;
  }

  /** Returns the radius */
  public double getRadius() {
    return radius;
  }

  /** Returns the area of this Circle instance */
  public double getArea() {
    return radius*radius*Math.PI;
  }

  public Color getColor() {
    return color;
  }
}
public class Task {

  public static void main(String[] args) {
    Shape shape = new Shape();

    Shape unfilledBlackShape = new Shape("black", false);

    Circle filledBlueCircle = new Circle(7.0, "blue", true);

    Rectangle unfilledBrownRectangle = new Rectangle(1, 2, "brown", false);

    Square filledYellowSquare = new Square(42, "yellow", true);

    System.out.println(shape); //Shape[color=red,filled=true]
    System.out.println(unfilledBlackShape);//Shape[color=black,filled=false]
    System.out.println(filledBlueCircle);//Circle[Shape[color=blue,filled=true],radius=7.0]
    System.out.println(unfilledBrownRectangle); //Rectangle[Shape[color=brown,filled=false],width=1.0,length=2.0]
    System.out.println(filledYellowSquare); //Square[Rectangle[Shape[color=yellow,filled=true],width=42.0,length=42.0]]
    System.out.println(filledBlueCircle.getArea()); //153.93804002589985
    System.out.println(filledYellowSquare.getPerimeter()); //168.0
  }
}
public class Task {

  public static void main(String[] args) {
    Box<Apple> appleBox = new Box<>();
    appleBox.add(new Apple(), new Apple(), new Apple());

    System.out.println("appleBox.getWeight: " + appleBox.getWeight());

    Box<Apple> appleBox1 = new Box<>();
    appleBox1.add(new Apple(), new Apple(), new Apple(), new Apple());

    System.out.println("appleBox1.getWeight: " + appleBox1.getWeight());
    System.out.println("appleBox weight equals appleBox1 weight: " + appleBox.isEqualWeight(appleBox1));

    Box<Orange> orangeBox = new Box<>();
    orangeBox.add(new Orange(), new Orange());
    System.out.println(orangeBox.getWeight());

    Box<Orange> newOrangeBox = new Box<>();
    System.out.println("orangeBox weight: " + orangeBox.getWeight());
    System.out.println("newOrangeBox weight: " + newOrangeBox.getWeight());
    orangeBox.sendFruits(newOrangeBox);
    System.out.println("orangeBox weight: " + orangeBox.getWeight());
    System.out.println("newOrangeBox weight: " + newOrangeBox.getWeight());
  }
}
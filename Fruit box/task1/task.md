Use generics to create an implementation of a fruit basket.

1. Create class Box in which you can put Fruit. Boxes are sorted by a type of fruit, so you can't put Apples in the
   same box as Oranges.
2. To keep fruit inside the box use ArrayList.
3. Create a method getWeight(), which counts box's weight. Weight of the apple is 1.0f and orange is 1.5f.
4. Inside the Box create a method isEqualWeight(Box box), which allows you to compare current Box with the Box that is
   in the argument. Return true if weight is the same, false if weight it different. You can't compare apple boxes with
   orange boxes.
5. Add a method, which allows to send all fruit from one Box to another.
6. Add a method that adds a fruit to the Box.
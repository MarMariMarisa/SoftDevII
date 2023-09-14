Part 1 (60 %):

A Shape has a name (e.g. “circle”) and an area (a method that returns a double value). There are two kinds of shapes: circular and non-circular. All circular shapes have a radius. All non-circular shapes have a width and height.

 - A Circle is a circular shape with an area equal to Pi times its radius squared.

 - A Sphere is a circular shape with an area equal to 4 times Pi times its radius squared.

 - A Rectangle is a shape with an area equal to the product of its width and height.

 - A Triangle is a shape with an area equal to half of the product of its width and height.

Create a Java class hierarchy that implements the above described problem. Your solution MUST

1. Include one interface and at least one abstract class
2. Maximize code reuse rather than copying & pasting.
3. Use the exact same nouns as those used in the problem statement whenever possible.

Part 2 (30 %):

 - When converted to a string, a Shape should include its name and area. Implement the method(s) required to convert a Shape to a string.
 - Two Shapes are considered equal if they have the same name and state. For example, two Rectangles are equal if they have the same width and height. Implement the special method(s) to allow your Shapes to be compared for equality.
 - Write a Junit unit test for the equality functionality. 

Part 3 (10 %):

Create a file named Main.java. In a main method, create four shape objects of all different types (e.g. Shape circle = new Circle(…)) with radius/height/width equal to 1. Create an array containing all of the shape objects. Loop through the array and print each element and compute the sum of all areas. Print the sum in the end.

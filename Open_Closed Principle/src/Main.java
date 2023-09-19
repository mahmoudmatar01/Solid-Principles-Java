
public class Main {
    public static void main(String[] args) {

//        - Open and Closed Principle : software entities ( classes -modules - functions ) should be
//                                     open for extension ,but closed for modification
//        - we need some knowledge about Abstraction and Polymorphism to understand this principle
    }
}


class Rectangle{
    private int width;
    private int height;
}

class Square{
    private int side;
}

// this class violate Open/Closed Principle because if add another shape class ,you should to modify ShapePrinter class to add
//  a new class .
class ShapePrinter {
    public void drawShape(Object shape){
        if(shape instanceof Rectangle){
            System.out.println("Rectangle");
        }else if(shape instanceof  Square){
            System.out.println("Square");
        }
    }
}

//  what should i do ?

// Create Abstract Shape Class with its method drawShape

abstract class Shape{
    abstract void draw();
}

// make all shape type extend Shape class and implement shawShape Method

class Rectangle2 extends Shape{
    private int width;
    private int height;

    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}

class Square2 extends Shape {
    private int side;

    @Override
    void draw() {
        System.out.println("Square");
    }
}

// make drawShape Method in class Shape Printer depend on draw Method on Shape Class
class ShapePrinter2 {

    // get Shape reference as a parameter to use its draw method
    public void drawShape(Shape shape){
        shape.draw();
    }
}

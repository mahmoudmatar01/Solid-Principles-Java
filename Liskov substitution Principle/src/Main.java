public class Main {
    public static void main(String[] args) {


//        Liskov substitution Principle :-  if class S is a Subtype of class T ,then Objects of type T in a program may be replaced
//                                          with objects of type S without altering any of the desirable properties of that program .

//        make =>  [  T t = new T();    =     T t = new S();  ]


        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(2);
        rectangle.setWidth(5);

        if(rectangle.getArea()==10){
            System.out.println(rectangle.getArea());
        }

        ////// this code violate LS principle
        Rectangle square=new Square();
        square.setWidth(2);
        square.setHeight(5);
        if(square.getArea()==10){
            System.out.println(square.getArea());
        }
    }
}

// this design violate Ls Principle
class Rectangle{
    private int width;
    private int height;
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return width*height;
    }
}

class Square extends  Rectangle{

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);    }

}

// what should I do ?

// create a Shape interface for each shape class

interface Shape{
    int getArea();
}

// Make Square class implement Shape interface and its method
class Square1 implements Shape{

    public int side;
    @Override
    public int getArea() {
        return side*side;
    }
}
// Make Rectangle class implement Shape interface and its method
class Rectangle1 implements Shape{
    public int width;
    public int height;
    @Override
    public int getArea() {
        return width*height;
    }
}
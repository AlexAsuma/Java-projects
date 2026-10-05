package OOP.ABSTRACT;

public class Rectangle extends Shape
{
    double height;
    double length;

    public Rectangle(double height, double length)
    {
        this.height = height;
        this.length = length;
    }

    @Override
    double area(){
        return length*height;
    }
     @Override
    double perimeter(){
        return 2*length*height;
     }
}

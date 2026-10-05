package OOP.ABSTRACT;

public class Circle extends Shape {

    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return Math.PI * (radius*2) ;
    }


}

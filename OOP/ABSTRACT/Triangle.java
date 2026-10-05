package OOP.ABSTRACT;

public class Triangle extends Shape {
    double base;
    double height;
    double hypotenuse;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height, double hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }


    @Override
    double area(){
        return 0.5 * base * height;
    }

    @Override
    double perimeter(){
        return base+hypotenuse+height;
    }
}

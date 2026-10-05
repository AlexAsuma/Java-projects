package OOP.ABSTRACT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************************************************");
        System.out.println("WELCOME TO THE SHAPE PERIMETER AND AREA CALCULATOR");
        System.out.println("***************************************************");
        System.out.println("To continue please select a shape");
        System.out.println("1. Circle\n 2. Rectangle\n 3. Triangle\n 4. Square");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter the radius of the circle");
                double radius = scanner.nextDouble();

                if (radius > 0) {
                    Circle circle = new Circle(radius);
                } else {
                    System.out.println("Please enter a positive number!!");
                    break;
                }

                System.out.println("What do you want to calculate:\n 1. Area\n  2. Perimeter");
                int choice2 = scanner.nextInt();
                switch (choice2) {
                    case 1: {
                        break;

                    }
                    case 2: {
                        break;
                    }
                    default: {
                        System.out.println("Please enter either 1 or 2");
                        break;
                    }

                }
                break;
            }
            case 2: {
                System.out.println("Enter the length of the rectangle");
                double length = scanner.nextDouble();
                System.out.println("Enter the height of the rectangle");
                double height = scanner.nextDouble();

                if (length > 0 && height > 0) {
                    Rectangle rectangle = new Rectangle(height, length);

                } else {
                    System.out.println("Please enter a positive number!!");
                    break;
                }

                System.out.println("What do you want to calculate:\n 1. Area\n  2. Perimeter");
                int choice3 = scanner.nextInt();
                switch (choice3) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        System.out.println("Please enter either 1 or 2");
                        break;

                    }

                }
                break;
            }
            case 3: {
                System.out.println("What do you want to calculate: \n 1. Area\n  2. Perimeter");
                int choice4 = scanner.nextInt();

                switch (choice4) {
                    case 1: {
                        System.out.println("Enter the Height of the Triangle");
                        double height = scanner.nextDouble();

                        System.out.println("Enter the Base of the Triangle");
                        double base = scanner.nextDouble();

                        if (base > 0 && height > 0) {
                            Triangle triangle = new Triangle(base, height);
                            double area = triangle.area();
                            System.out.printf("The area of your triangle is %,.2f", area);
                        } else {
                            System.out.println("Please enter a positive number!!");
                            break;
                        }

                        break;
                    }
                    case 2: {
                        System.out.println("Enter the Base of the Triangle");
                        double base = scanner.nextDouble();

                        System.out.println("Enter the Height of the Triangle");
                        double height = scanner.nextDouble();

                        System.out.println("Enter the Hypotenuse of the Triangle");
                        double hypotenuse = scanner.nextDouble();

                        if (hypotenuse > 0 && height > 0 && base > 0) {
                            Triangle triangle = new Triangle(base, height, hypotenuse);
                            double perimeter = triangle.perimeter();
                            System.out.printf("The perimeter of the triangle is %,.2f", perimeter);
                        }

                        else {
                            System.out.println("Please enter a positive number!!");
                            break;
                        }
                        break;
                    }
                    default: {
                        System.out.println("Please enter either 1 or 2");
                        break;
                    }
                }
            }

        }
    }
}

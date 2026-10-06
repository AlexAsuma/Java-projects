package OOP.ABSTRACT;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************************************************");
        System.out.println("WELCOME TO THE SHAPE PERIMETER AND AREA CALCULATOR");
        System.out.println("***************************************************");
        System.out.println("To continue please select a shape");
        System.out.println(" 1. Circle\n 2. Rectangle\n 3. Triangle\n 4. Square\n 5. Exit");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        boolean toContinue = false;
        do {
            switch (choice) {
                case 1: {
                    System.out.println("Enter the radius of the circle");
                    double radius = scanner.nextDouble();

                    if (radius > 0) {
                        Circle circle = new Circle(radius);

                        System.out.println("What do you want to calculate:\n  1. Area\n  2. Perimeter");
                        int choice2 = scanner.nextInt();
                        switch (choice2) {
                            case 1: {
                                double area = circle.area();
                                System.out.printf("The area of the circle is %,.2f\n", area);
                                break;

                            }
                            case 2: {
                                double perimeter = circle.perimeter();
                                System.out.printf("The perimeter of the circle is %,.2f\n", perimeter);
                                break;
                            }
                            default: {
                                System.out.println("Please enter either 1 or 2");
                                break;
                            }

                        }
                    } else {
                        System.out.println("Please enter a positive number!!");
                        break;
                    }
                    System.out.println("Would you like to continue? (Y,N)");
                    char userChoice = scanner.next().charAt(0);
                    userChoice = Character.toUpperCase(userChoice);
                    if (userChoice == 'Y') {
                        toContinue = true;
                        break;
                    } else if (userChoice == 'N') {
                        System.out.println("\n********************GOODBYE***********************");
                        break;
                    } else {
                        System.out.println("Please enter either Y or N");
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

                        System.out.println("What do you want to calculate:\n  1. Area\n  2. Perimeter");
                        int choice3 = scanner.nextInt();
                        switch (choice3) {
                            case 1: {
                                double area = rectangle.area();
                                System.out.printf("The area of the rectangle is %,.2f\n", area);
                                break;
                            }
                            case 2: {
                                double perimeter = rectangle.perimeter();
                                System.out.printf("The perimeter of the rectangle is %,.2f\n", perimeter);
                                break;
                            }
                            default: {
                                System.out.println("Please enter either 1 or 2");
                                break;

                            }

                        }
                    } else {
                        System.out.println("Please enter a positive number!!");
                        break;
                    }
                    System.out.println("Would you like to continue? (Y,N)");
                    char userChoice = scanner.next().charAt(0);
                    userChoice = Character.toUpperCase(userChoice);
                    if (userChoice == 'Y') {
                        toContinue = true;
                        break;
                    } else if (userChoice == 'N') {
                        System.out.println("\n********************GOODBYE***********************");
                        break;
                    } else {
                        System.out.println("Please enter either Y or N");
                    }
                    break;
                }
                case 3: {
                    System.out.println("What do you want to calculate: \n  1. Area\n  2. Perimeter");
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
                            } else {
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
                    System.out.println("Would you like to continue? (Y,N)");
                    char userChoice = scanner.next().charAt(0);
                    userChoice = Character.toUpperCase(userChoice);
                    if (userChoice == 'Y') {
                        toContinue = true;
                        break;
                    } else if (userChoice == 'N') {
                        System.out.println("\n********************GOODBYE***********************");
                        break;
                    } else {
                        System.out.println("Please enter either Y or N");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter the width of the square: ");
                    double side = scanner.nextDouble();

                    if (side > 0) {
                        Square square = new Square(side);

                        System.out.println("What do you want to calculate: \n  1. Area\n  2. Perimeter");
                        int choice5 = scanner.nextInt();
                        switch (choice5) {
                            case 1: {
                                double area = square.area();
                                System.out.printf("The area of the square is %,.2f\n", area);
                                break;
                            }
                            case 2: {
                                double perimeter = square.perimeter();
                                System.out.printf("The perimeter of the square is %,.2f\n", perimeter);
                                break;
                            }
                            default: {
                                System.out.println("Please enter a positive number!!");
                            }
                        }
                    } else {
                        System.out.println("Please enter a positive number!!");
                        break;
                    }
                    System.out.println("Would you like to continue? (Y,N)");
                    char userChoice = scanner.next().charAt(0);
                    userChoice = Character.toUpperCase(userChoice);
                    if (userChoice == 'Y') {
                        toContinue = true;
                        break;
                    } else if (userChoice == 'N') {
                        System.out.println("\n********************GOODBYE***********************");
                        break;
                    } else {
                        System.out.println("Please enter either Y or N");
                    }
                    break;
                }
                case 5: {
                    System.out.println("\n********************GOODBYE***********************");
                    break;
                }
                default: {
                    System.out.println("Please enter a positive number between and including 1 and 5!!");
                    System.out.println("Would you like to continue? (Y,N)");
                    char userChoice = scanner.next().charAt(0);
                    userChoice = Character.toUpperCase(userChoice);
                    if (userChoice == 'Y') {
                        toContinue = true;
                        break;
                    } else if (userChoice == 'N') {
                        System.out.println("\n********************GOODBYE***********************");
                        break;
                    } else {
                        System.out.println("Please enter either Y or N");
                    }
                    break;
                }
            }
        } while (toContinue);

        scanner.close();
    }
}
// Practical No. -- 6 (i)
// Abstract Class - Area of Circle, Triangle and Rectangle


import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Prac6_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the Triangle: ");
        double height = sc.nextDouble();
        Shape triangle = new Triangle(base, height);

        System.out.print("Enter the width of the Rectangle: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of the Rectangle: ");
        double rectHeight = sc.nextDouble();
        Shape rectangle = new Rectangle(width, rectHeight);

        System.out.print("Enter the radius of the Circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);

        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}

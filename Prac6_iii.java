// Practical No. -- 6 (iii)
// Interface - Area of Circle, Triangle and Rectangle

import java.util.Scanner;

public class Prac6_iii {
    public interface Shape {
        double getArea();
    }

    public static class Rectangle implements Shape {
        private double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double getArea() {
            return width * height;
        }
    }

    public static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class Triangle implements Shape {
        private double base, height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Rectangle:");
        System.out.print("Width: ");
        double rectWidth = sc.nextDouble();
        System.out.print("Height: ");
        double rectHeight = sc.nextDouble();
        Shape rectangle = new Rectangle(rectWidth, rectHeight);

        System.out.println("\nEnter details for Circle:");
        System.out.print("Radius: ");
        double circleRadius = sc.nextDouble();
        Shape circle = new Circle(circleRadius);

        System.out.println("\nEnter details for Triangle:");
        System.out.print("Base: ");
        double triBase = sc.nextDouble();
        System.out.print("Height: ");
        double triHeight = sc.nextDouble();
        Shape triangle = new Triangle(triBase, triHeight);

        System.out.println("\nShape Areas:");
        System.out.printf("Rectangle Area: %.2f%n", rectangle.getArea());
        System.out.printf("Circle Area: %.2f%n", circle.getArea());
        System.out.printf("Triangle Area: %.2f%n", triangle.getArea());

    }
}

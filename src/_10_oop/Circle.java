package _10_oop;


public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static double perimeter(Circle c) {
        return 2 * Math.PI * c.radius;
    }

    public static double area(Circle c) {
        return Math.PI * Math.pow(c.radius, 2);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println("Circle with radius: " + circle1.getRadius());
        System.out.println("Perimeter: " + Circle.perimeter(circle1));
        System.out.println("Area: " + Circle.area(circle1));
        System.out.println();
        Circle circle2 = new Circle(5);
        System.out.println("Circle with radius: " + circle2.getRadius());
        System.out.println("Perimeter: " + Circle.perimeter(circle2));
        System.out.println("Area: " + Circle.area(circle2));
    }
}

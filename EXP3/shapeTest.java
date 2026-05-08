import java.util.Scanner;

abstract class Shape {
    protected double dim1, dim2;

    Shape(double d1, double d2) {
        this.dim1 = d1;
        this.dim2 = d2;
    }

    abstract double area();
}

class Rectangle extends Shape {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    Triangle(double d1, double d2) {
        super(d1, d2);
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class shapeTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rectangle dimensions: ");
            double r1 = sc.nextDouble();
            double r2 = sc.nextDouble();
            
            System.out.print("Enter triangle dimensions: ");
            double t1 = sc.nextDouble();
            double t2 = sc.nextDouble();
            
            Shape rect = new Rectangle(r1, r2);
            Shape tri = new Triangle(t1, t2);
            
            System.out.println("Rectangle Area: " + rect.area());
            System.out.println("Triangle Area: " + tri.area());
        }
    }
}

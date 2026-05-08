import java.util.Scanner;

class Area {
    private int length;
    private int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Area rect = new Area();

            System.out.print("Enter length: ");
            int l = sc.nextInt();
            System.out.print("Enter breadth: ");
            int b = sc.nextInt();

            rect.setDim(l, b);
            System.out.println("Area of rectangle = " + rect.getArea());
        }
    }
}

package OpenClosedPrinciple;
//create an shape interface with method getArea()
public class OCPCorrection {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5.0,7.1);
        Rectangle rec2 = new Rectangle(8.0,11.2);
        Circle circle1 = new Circle(20.0);
        Circle circle2 = new Circle(27.5);

        System.out.println(compare(rec1,rec2));
        System.out.println(compare(circle1,circle2));
        System.out.println(compare(rec1,circle2));
    }

    public static double compare(Shape shape1,Shape shape2 ) {
        return shape2.getArea() - shape1.getArea();
    }


    public static class Circle implements Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle implements Shape {
        double width;
        double length;

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public double getArea() {
            return width * length;
        }
    }
}
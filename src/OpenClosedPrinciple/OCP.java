package OpenClosedPrinciple;

public class OCP {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(2.22,5.1);
        Rectangle rec2 = new Rectangle(3.12,7.5);
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);
        System.out.println(compare(rec1,rec2));
        System.out.println(compare(circle1,circle2));
        System.out.println(compare(rec1,circle2));
    }
    public static double compare(Rectangle rec1,Rectangle rec2){
        return rec2.getArea()-rec1.getArea();
    }
    public static double compare(Circle circle1,Circle circle2){
        return circle2.getArea()- circle1.getArea();
    }
//Now if i want to compare between a circle and rectangle then i need to edit on this and make a new compare()
//which accepts the instance of object circle and rectangle
    public static double compare(Rectangle rec1,Circle circle2){
        return circle2.getArea()- rec1.getArea();
    }
    public static  class Circle{
        double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double getArea(){
            return Math.PI*radius*radius;
        }
    }
    public static class Rectangle{
        double width;
        double length;

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }
        public double getArea(){
            return width*length;
        }
    }
}

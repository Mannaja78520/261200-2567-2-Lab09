package OCP;

public class Main {
    public static void main(String[] args){
        AreaCalculator areaCal = new AreaCalculator();
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + areaCal.calculateArea(circle));

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + areaCal.calculateArea(rectangle));

        Ellipse ellipse = new Ellipse(5, 10);
        System.out.println("Area of Ellipse: " + areaCal.calculateArea(ellipse));
    }
}

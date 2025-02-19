import DIP.*;
import LSP.*;
import OCP.*;

public class Main {
    public static void main(String[] args){
        // Run OCP Program
        AreaCalculator areaCal = new AreaCalculator();
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + areaCal.calculateArea(circle));

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + areaCal.calculateArea(rectangle));

        Ellipse ellipse = new Ellipse(5, 10);
        System.out.println("Area of Ellipse: " + areaCal.calculateArea(ellipse));
        
        System.out.println();

        // RUN LSP Program
        Penguin penguin = new Penguin();
        penguin.move();
        
        Ostrich ostrich = new Ostrich();
        ostrich.move();
        
        Sparrow juad = new Sparrow();
        juad.fly();
        juad.move();
        
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.move();

        System.out.println();

        // RUN DIP Program
        OrderProcessor emailOrder = new OrderProcessor(new EmailNotifier());
        emailOrder.processOrder(new Order());

        OrderProcessor smsOrder = new OrderProcessor(new SMSNotifier());
        smsOrder.processOrder(new Order());

    }
}

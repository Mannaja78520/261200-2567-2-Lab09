package DIP;

public class Main {
    public static void main(String[] args){
        OrderProcessor emailOrder = new OrderProcessor(new EmailNotifier());
        emailOrder.processOrder(new Order());

        OrderProcessor smsOrder = new OrderProcessor(new SMSNotifier());
        smsOrder.processOrder(new Order());
    }
}

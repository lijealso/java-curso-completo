package A115.application;

import java.util.Date;

import A115.entities.Order;
import A115.entities_enums.OrderStatus;

public class Program
{
    public static void main(String[] args)
    {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT); 
        
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");    

    }    
}

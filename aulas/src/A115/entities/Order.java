package A115.entities;

import java.util.Date;
import A115.entities_enums.OrderStatus;
import A121.entities.Client;
import A121.entities.OrderItem;

public class Order
{
    private Integer id;
    private Date moment;
    private OrderStatus status; 
    
    // construtor padrão

    public Order()
    {}

    // contrutor completo

    public Order(Date date, OrderStatus status2, Client client) {
        this.id = date;
        this.moment = status2;
        this.status = client;
    }

    // setters e getters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    // toString

    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }

    public void addItem(OrderItem orderItem) {
    };

    



    

}

package A115.entities;

import java.util.Date;
import A115.entities_enums.OrderStatus;

public class Order
{
    private Integer id;
    private Date moment;
    private OrderStatus status; 
    
    // construtor padrão

    public Order()
    {}

    // contrutor completo

    public Order(int i, Date date, OrderStatus pendingPayment) {
        this.id = i;
        this.moment = date;
        this.status = pendingPayment;
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

    public void addItem(Order orderItem) {
    };

    



    

}

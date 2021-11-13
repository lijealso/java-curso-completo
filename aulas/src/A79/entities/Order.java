package A79.entities;

import java.util.Date;

public class Order
{
    private Date date;
    private A79Produto product;


    public Order(Date date, A79Produto product)
    {
        this.date = date;
        this.product = product;
        
        // como está no mesmo pacote, esta classe pode
        // aceder ao nome do produto
        this.product.name = "TV";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public A79Produto getProduct() {
        return product;
    }

    public void setProduct(A79Produto product) {
        this.product = product;
    }
}

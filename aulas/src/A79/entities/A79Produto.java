package A79.entities;

import java.util.Locale;


public class A79Produto
{
    String name;
    private double price;
    private int quantity;

    // construtor padrão
    public A79Produto()
    {    
    }

    // construtor com 3 argumentos
    public A79Produto(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // construtor com 2 argumentos
    public A79Produto(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    // para a quantidade, só se faz o get
    // a alteração da quantidade faz pelos métodos abaixo

    public int getQuantity()
    {
        return quantity;
    }


    public double TotalValueInStock()
    {
        Locale.setDefault(Locale.US);
        double valor = price * quantity;
        return valor; 
    }

    public void AddProducts(int n)
    {
        this.quantity += n;
    }

    public void RemoveProducts(int n)
    {
        this.quantity -= n;
    }

    public String toString()
    {
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " unidades, Total: $ "
            + String.format("%.2f", TotalValueInStock());
    }
    
}

/*
Product:
    - Name : string
    - Price : double
    - Quantity : int

    + TotalValueInStock() : double
    + AddProducts(quantity : int) : void
    + RemoveProducts(quantity: int) : void
*/
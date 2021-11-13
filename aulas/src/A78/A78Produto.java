package A78;

import java.util.Locale;


public class A78Produto
{
    String name;
    double price;
    int quantity;

    // construtor padrão
    public A78Produto()
    {
        
    }

    // construtor com 3 argumentos
    public A78Produto(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // construtor com 2 argumentos
    public A78Produto(String name, double price)
    {
        this.name = name;
        this.price = price;
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
package A79.application;
import java.util.Locale;
import java.util.Scanner;
import A79.entities.A79Produto;

public class A79Programa
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int unidades;

        System.out.println("Dados do produto: ");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Preço: ");
        double price = sc.nextDouble();
        sc.nextLine();

        A79Produto produto = new A79Produto(name, price);

        System.out.println(produto);

        System.out.println("Número de unidades a adicionar: ");
        unidades = sc.nextInt();
        sc.nextLine();
        produto.AddProducts(unidades);

        System.out.println(produto);
        
        System.out.println("Número de unidades a remover: ");
        unidades = sc.nextInt();
        sc.nextLine();
        produto.RemoveProducts(unidades);

        produto.setName("Computador");
        System.out.println("Nome atualizado: " + produto.getName());

        produto.setPrice(980.00);
        System.out.println("Preço atualizado: " + produto.getName());

        System.out.println(produto);

        //System.out.println(produto.name);

        sc.close();
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
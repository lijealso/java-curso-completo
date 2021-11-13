package A76;
import java.util.Locale;
import java.util.Scanner;

public class A76Programa
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
        System.out.println("Quantidade");
        int quantity = sc.nextInt();
        sc.nextLine();

        A76Produto produto = new A76Produto(name, price, quantity);

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

        System.out.println(produto);

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
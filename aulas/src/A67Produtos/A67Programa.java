package A67Produtos;
import java.util.Locale;
import java.util.Scanner;

public class A67Programa
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        A67Produto produto;
        int unidades;

        produto = new A67Produto();

        System.out.println("Dados do produto: ");
        System.out.println("Nome: ");
        produto.name = sc.nextLine();
        System.out.println("Preço: ");
        produto.price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Quantidade");
        produto.quantity = sc.nextInt();
        sc.nextLine();

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
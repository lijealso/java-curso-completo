package A73;

import java.util.Locale;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar: ");
        double valorDolar = sc.nextDouble();
        sc.nextLine();
        System.out.println("Quantos dólares a comprar: ");
        double quantidadeDolares = sc.nextDouble();
        sc.nextLine();

        double recebido = CurrencyConverter.ValorRecebido(valorDolar, quantidadeDolares);
    
        System.out.println("Quantia a pagar em reais: " + recebido);

        sc.close();
    }    
}

package A82.application;
import java.util.Locale;
import java.util.Scanner;
import A82.entities.Conta;

public class Programa
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("Número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Titular: ");
        String nome = sc.nextLine();

        System.out.println("Há depósito inicial? (s/n)");

        char dep_inicial = sc.nextLine().charAt(0);

        if (dep_inicial == 's')
        {
            System.out.println("Valor do depósito inicial: ");
            double saldo = sc.nextDouble();
            sc.nextLine();
            conta = new Conta(numeroConta, nome, saldo);
        }
        else
        {
            conta = new Conta(numeroConta, nome);
        }

        System.out.println(conta);

        System.out.println("Valor a depositar: ");
        double deposito = sc.nextDouble();
        sc.nextLine();
        conta.Deposito(deposito);
        System.out.println(conta);

        System.out.println("Valor a levantar: ");
        double levantamento = sc.nextDouble();
        sc.nextLine();
        conta.Levantamento(levantamento);
        System.out.println(conta);

        conta.setNome("Joao Carlos");
        System.out.println("Nome atualizado: " + conta.getNome());

        conta.getNumeroConta();
        // conta.setNumeroConta();

        sc.close();
    } 
}

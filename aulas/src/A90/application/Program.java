package A90.application;

import java.util.Locale;
import java.util.Scanner;

import A90.entities.Produto;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int N;
        double soma = 0;
        
        System.out.println("Número de produtos:");
        N = sc.nextInt();
        sc.nextLine();

        Produto[] vetor = new Produto[N];

        for (int i = 0 ; i < vetor.length ; i++)
        {
            String nome;
            double preco;
            System.out.println("Nome: ");
            nome = sc.nextLine();
            System.out.println("Preço: ");
            preco = sc.nextDouble();
            sc.nextLine();

            vetor[i] = new Produto(nome, preco);

            soma = soma + vetor[i].getPreco();
        }

        double media = soma / vetor.length ;
        System.out.println("Média = " + media);

        sc.close();
    }    
}

package A91.application;

import java.util.Locale;
import java.util.Scanner;
import A91.entities.Aluguer;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int N;

        Aluguer[] vetor = new Aluguer[10];

        System.err.println("Quantos quartos a alugar:");
        N = sc.nextInt();
        sc.nextLine();


        for (int i = 0 ; i < N ; i++)
        {
            System.out.println("Aluguer numero " + (i + 1) + " :");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Qual o quarto (0 a 9): ");
            int quarto = sc.nextInt();
            sc.nextLine();

            vetor[quarto] = new Aluguer(nome, email); 
        }

        System.out.println("Quartos ocupados, ordem crescente: ");

        for (int i = 0; i < vetor.length; i++)
        {
            if (vetor[i] != null)
            {
                System.out.println( i + ": " + vetor[i].getNome() + ", " + vetor[i].getEmail());
            }
        }

        sc.close();


    }
    
}

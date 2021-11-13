import java.util.Scanner;
import java.util.Locale;

public class A89Vetores
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int N;
        double soma = 0;
        System.out.println("Número de pessoas: ");
        N = sc.nextInt();
        sc.nextLine();

        
        double[] vetor = new double[N];

        for (int i = 0 ; i < N ; i++)
        {
            System.out.println("Altura: ");
            vetor[i] = sc.nextDouble();
            soma = soma + vetor[i];
        }

        double media = soma / vetor.length;
       System.out.printf("Média = %.3f", media); 

        sc.close();
    }    
}

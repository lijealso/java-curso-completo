import java.io.IOException;
import java.util.Scanner;

public class Testes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;

        do
        {
            nota1 = sc.nextDouble();

            if(nota1 < 0)
            {
                System.out.println("nota invalida");
            }

            nota2 = sc.nextDouble();
    
            if(nota2 < 0)
            {
                System.out.println("nota invalida");
            }

        } while(nota1 < 0 || nota2 < 0);   
        
        System.out.printf("media = %.2f", (nota1 + nota2) / 2.0);



        sc.close();
    }
 
}
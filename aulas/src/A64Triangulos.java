import java.util.Scanner;

public class A64Triangulos
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lados do triângulo X:");
        double t1x = sc.nextDouble();
        sc.nextLine();
        double t1y = sc.nextDouble();
        sc.nextLine();
        double t1z = sc.nextDouble();
        sc.nextLine();

        double p = (t1x + t1y + t1z) / 2.0;
        double areat1 = Math.sqrt(p*(p-t1x)*(p - t1y)*(p-t1z));

        System.out.printf("Área do triângulo X: %.4f%n", areat1);

        System.out.println("Lados do triângulo Y:");
        double t2x = sc.nextDouble();
        sc.nextLine();
        double t2y = sc.nextDouble();
        sc.nextLine();
        double t2z = sc.nextDouble();
        sc.nextLine();

        double q = (t2x + t2y + t2z) / 2.0;
        double areat2 = Math.sqrt(q * (q - t2x) * (q - t2y) * (q - t2z));

        System.out.printf("Área do triângulo 2: %.4f%n", areat2);

        if(areat1 > areat2)
        {
            System.out.println("Triângulo maior = X");
        }
        else if(areat1 < areat2)
        {
            System.out.println("Triângulo maior = Y");
        }
        else
        {
            System.out.println("Têm áreas iguais");
        }



        sc.close();
    }
}

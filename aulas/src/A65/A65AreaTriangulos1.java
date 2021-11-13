package A65;
import java.util.Scanner;

public class A65AreaTriangulos1
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        A65Triangulo X, Y;

        X = new A65Triangulo();
        Y = new A65Triangulo();

        System.out.println("Lados do triângulo X:");
        X.a = sc.nextDouble();
        sc.nextLine();
        X.b = sc.nextDouble();
        sc.nextLine();
        X.c = sc.nextDouble();
        sc.nextLine();

        double p = (X.a + X.b + X.c) / 2.0;
        double areat1 = Math.sqrt(p*(p-X.a)*(p - X.b)*(p-X.c));

        System.out.printf("Área do triângulo X: %.4f%n", areat1);

        System.out.println("Lados do triângulo Y:");
        Y.a = sc.nextDouble();
        sc.nextLine();
        Y.b = sc.nextDouble();
        sc.nextLine();
        Y.c = sc.nextDouble();
        sc.nextLine();

        double q = (Y.a + Y.b + Y.c) / 2.0;
        double areat2 = Math.sqrt(q * (q - Y.a) * (q - Y.b) * (q - Y.c));

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

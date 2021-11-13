package A66;
import java.util.Scanner;

public class A66AreaTriangulos
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        A66Triangulo X, Y;

        X = new A66Triangulo();
        Y = new A66Triangulo();

        System.out.println("Lados do triângulo X:");
        X.a = sc.nextDouble();
        sc.nextLine();
        X.b = sc.nextDouble();
        sc.nextLine();
        X.c = sc.nextDouble();
        sc.nextLine();

        double areat1 = X.area();

        System.out.printf("Área do triângulo X: %.4f%n", areat1);

        System.out.println("Lados do triângulo Y:");
        Y.a = sc.nextDouble();
        sc.nextLine();
        Y.b = sc.nextDouble();
        sc.nextLine();
        Y.c = sc.nextDouble();
        sc.nextLine();

        
        double areat2 = Y.area();

        System.out.printf("Área do triângulo Y: %.4f%n", areat2);

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

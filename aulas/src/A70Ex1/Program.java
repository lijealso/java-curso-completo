package A70Ex1;
import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double altura;
        double largura;
        Retangulo ret;
        ret = new Retangulo();

        System.out.println("Introduza a largura e altura: ");
        System.out.println("Largura: ");
        largura = sc.nextDouble();
        sc.nextLine();
        altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("AREA = " + ret.Area(largura, altura));
        System.out.println("PERIMETRO = " + ret.Perimetro(largura, altura));
        System.out.println("DIAGONAL = " + ret.Diagonal(largura, altura));

        sc.close();
    }   
}

import java.util.Locale;
import java.util.Scanner;

public class A26EntradaDados1 {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* imprimir string
		String x;
		x = sc.nextLine();
		System.out.println("Texto inserido: " + x);
		
		
		// imprimir inteiro
		int inteiro = sc.nextInt();
		System.out.println(inteiro);
		
		// imprimir double;
		System.out.println("Insira double:");
		double y = sc.nextDouble();
		System.out.printf("Numero: %.2f%n", y);
		
		
		// imprime caractere
		System.out.println("Insira letra:");
		char letra = sc.next().charAt(0);
		System.out.println(letra);
		*/
		
		// imprimir vários na mesma linha
		String palavra;
		int x;
		double d;
		
		palavra = sc.next();
		x = sc.nextInt();
		d = sc.nextDouble();
		
		System.out.println("Palavra = " + palavra + "Inteiro = " + x + "Double = " + d);
		
		sc.close();

	}

}

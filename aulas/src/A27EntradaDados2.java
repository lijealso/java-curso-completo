import java.util.Locale;
import java.util.Scanner;

public class A27EntradaDados2 
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// ler texto at� mudar linha
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt(); // tem quebra de linha pendente
		sc.nextLine(); // solu��o � colocar nextline
		s1 = sc.nextLine(); // consome a quebra de linha anterior
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("N�mero e Textos Escritos: ");
		System.out.println("N�mero: " + x);
		System.out.println("Texto 1: " + s1);
		System.out.println("Texto 2: " + s2);
		System.out.println("Texto 3: " + s3);
		

		sc.close();

	}

}

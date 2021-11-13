import java.util.Scanner;

public class A61Funcoes {
	
	
	
	public static int Maior(int x, int y, int z)
	{	
		int maior;
		if((x > y) && (x > z))
		{
			maior = x;
		}
		else if(y > z)
		{
			maior = y;
		}
		else
		{
			maior = z;
		}
		return maior;
	}
	
	public static void MostraResultado(int x)
	{
		System.out.println("Maior = " + x);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3 , maior;
		
		System.out.println("Introduza 3 numeros:");
		n1 = sc.nextInt();
		sc.nextLine();
		n2 = sc.nextInt();
		sc.nextLine();
		n3 = sc.nextInt();
		sc.nextLine();
		
		maior = Maior(n1, n2, n3);
		
		MostraResultado(maior);
	
		sc.close();
	}
}

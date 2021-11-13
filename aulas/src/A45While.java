import java.util.Scanner;

public class A45While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		int x = sc.nextInt();
		sc.nextLine();
		soma += x;
		System.out.println("Soma = " + soma);
		
		while (x != 0)
		{
			x = sc.nextInt();
			soma += x;
			System.out.println("Soma = " + soma);
		}
			
		
		sc.close();

	}

}

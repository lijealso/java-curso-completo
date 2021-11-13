import java.util.Scanner;

public class A30Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigo1;
		int codigo2;
		int quantidade1;
		int quantidade2;
		double preco1;
		double preco2;
		
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		preco1 = sc.nextDouble();
		sc.nextLine();
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		preco2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",( ((double)quantidade1*preco1) + ((double)quantidade2*preco2) ) );
		
		sc.close();

	}

}
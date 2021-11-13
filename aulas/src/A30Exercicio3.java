import java.util.Scanner;

public class A30Exercicio3 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.nextLine();
		int B = sc.nextInt();
		sc.nextLine();
		int C = sc.nextInt();
		sc.nextLine();
		int D = sc.nextInt();
		sc.nextLine();
		
		int calculo = ( (A*B) - (C*D) );
		
		System.out.println("DIFERENCA = " + calculo);
		
		sc.close();

	}

}

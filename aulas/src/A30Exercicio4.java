import java.util.Scanner;

public class A30Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		int horas = sc.nextInt();
		sc.nextLine();
		double valorHora = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f%n", ((double)horas * valorHora)    );
		
		sc.close();

	}

}

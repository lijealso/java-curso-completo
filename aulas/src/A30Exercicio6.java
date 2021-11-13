import java.util.Scanner;

public class A30Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		sc.nextLine();
		
		System.out.printf("TRIANGULO: %.3f%n", (A*C)/2.0 );
		System.out.printf("CIRCULO: %.3f%n", pi*C*C);
		System.out.printf("TRAPEZIO: %.3f%n", ( ((A+B)/2.0)*C ));
		System.out.printf("QUADRADO: %.3f%n", B*B);
		System.out.printf("RETANGULO: %.3f%n", A*B);

		sc.close();

	}
}
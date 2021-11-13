
public class A28FuncoesMatematicas
{

	public static void main(String[] args)
	{
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz de " + x + " = " + A);
		System.out.println("Raiz de " + y + " = " + B);
		System.out.println("Raiz de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " igual a " + A);
		System.out.println(x + " elevado ao quadrado igual a " + B);
		System.out.println("5 elevado ao quadrado igual a " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Absoluto de " + y + " igual a " + A);
		System.out.println("Absoluto de " + z + " igual a " + B);
		

	}

}

import java.util.Scanner;

public class A58Bitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mascara = 0b00100000;
		int n = sc.nextInt();
		
		if( (n & mascara) == 0) 
		{
			System.out.println("sexto bit é 0");
		}
		else
		{
			System.out.println("sexto bit é 1");
		}
		
		
		
		
		sc.close();

	}

}

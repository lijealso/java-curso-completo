package A70Ex3;

import java.util.Scanner;

public class Program
{

    public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);

        Aluno aluno;
        aluno = new Aluno();

        System.out.println("nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nota 3: ");
        aluno.nota3 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Nota final: " + aluno.NotaFinal());

        System.out.println(aluno.Passou());

        if(aluno.Passou() == "Não passou")
        System.out.printf("Não passou por %.2f valores", (60.00 - aluno.NotaFinal()));
		
		sc.close();
	}
    
}

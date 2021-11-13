package A70Ex2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empregado empregado;
        empregado = new Empregado();
        double percentagem;


        System.out.println("Nome: ");
        empregado.nome = sc.nextLine();
        System.out.println("Salário bruto: ");
        empregado.salarioBruto = sc.nextDouble();
        sc.nextLine();
        System.out.println("Imposto: ");
        empregado.imposto = sc.nextDouble();
        sc.nextLine();

        System.out.println("Empregado: " + empregado.nome + ", $ " + empregado.SalarioLiquido());

        System.out.println("Percentagem de aumento: ");
        percentagem = sc.nextDouble();
        empregado.AumentaSalario(percentagem);
        sc.nextLine();

        System.out.println("Dados: " + empregado.nome + ", $ " + empregado.SalarioLiquido());



         sc.close();
        
    }
    
}

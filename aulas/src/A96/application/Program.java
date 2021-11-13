package A96.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import A96.entities.Empregado;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Empregado> empregados = new ArrayList<Empregado>();

        System.out.println("Quantos empregados: ");
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++)
        {
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            Double salario = sc.nextDouble();
            sc.nextLine();

            Empregado empregado = new Empregado(id, nome, salario);
            empregados.add(empregado);
        }

        System.out.println("Empregado (id) com salário aumentado: ");
        Integer id_aum = sc.nextInt();
        sc.nextLine();

        for (Empregado item: empregados)
        {
            if(item.getId() == id_aum )
            {
                System.out.println("Qual a percentagem: ");
                Double perc = sc.nextDouble();
                sc.nextLine();
                item.Aumento(perc);
                break;
            }
            else if (empregados.indexOf(item) + 1 == empregados.size())
            {
                System.out.println("Id Não encontrado");
            }
        }

 
        System.out.println("Lista de empregados: ");
        for (Empregado item: empregados)
        {
            System.out.println(item);
        }

        sc.close();
    }
}

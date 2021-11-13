package A70Ex2;

public class Empregado {

    String nome;
    double salarioBruto;
    double imposto;

    public double SalarioLiquido()
    {
        double salarioLiquido;
        salarioLiquido = salarioBruto - imposto;

        return salarioLiquido;
    }

    public void AumentaSalario(double p)
    {
         salarioBruto = salarioBruto + ( (salarioBruto * p)/100.0 );
    }
    
}

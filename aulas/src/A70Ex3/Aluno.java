package A70Ex3;

public class Aluno {

    String nome;
    double nota1;
    double nota2;
    double nota3;



    public double NotaFinal()
    {
        double notaFinal = nota1 + nota2 + nota3;
        return notaFinal;
    }

    public String Passou()
    {
        if(nota1 + nota2 + nota3 >= 60)
        {
            return "Passou";
        }
        else
        {
            return "Não passou";
        }

    }
    
}

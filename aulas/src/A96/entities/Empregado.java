package A96.entities;

public class Empregado
{
    private Integer id;
    private String nome;
    private double salario;


    // construtores
    public Empregado() {}

    public Empregado(Integer id, String nome, double salario)
    {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    // getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    /*
    public void setSalario(double salario) {
        this.salario = salario;
    }
    */

    // toString
    @Override
    public String toString() {
        return "Empregado [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
    }

    public void Aumento(Double perc)
    {
        salario = salario + ( (salario * perc) / 100) ;
    }
    


    


    
}

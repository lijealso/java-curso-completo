package A82.entities;

public class Conta
{
    private final double TAXA = 5.0;
    private int numeroConta;
    private String nome;
    private double saldo;

    // construtores

    // construtor padrão
    public Conta()
    {
    }

    // construtor para conta sem saldo inicial
    public Conta(int numeroConta, String nome)
    {   this.numeroConta = numeroConta;
        this.nome = nome;
    }

    // construtor para conta com saldo inicial
    public Conta(int numeroConta, String nome, double depInicial)
    {
        this.numeroConta = numeroConta;
        this.nome = nome;
        // tira-se este
        this.saldo = depInicial;
        // e faz-se diretamente
        Deposito(depInicial);
    }

    // getters e setters

    public int getNumeroConta() {
        return numeroConta;
    }

    // tem que se tirar este
    /*
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    */
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // o set saldo faz-se pelos métodos
    /*
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    */

    public void Deposito(double n)
    {
        saldo += n;
    }

    public void Levantamento(double n)
    {
        saldo = (this.saldo - n) - TAXA;
    }

    public String toString()
    {
        return "Dados da conta:\n"
            + "Conta "
            + numeroConta
            + ", Titular: "
            + nome
            + ", Saldo: $ "
            + String.format("%.2f", saldo);
    }  
}

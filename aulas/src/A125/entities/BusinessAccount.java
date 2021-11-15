package A125.entities;

public class BusinessAccount extends Account // <--- extends Account
{
    private Double loanLimit; // <---- atributo específico
    
    public BusinessAccount() 
    {
        super();
    }

    // todos os parâmetros
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // chamada dos atributos da classe mãe
        this.loanLimit = loanLimit; // específico
    }

    // get e set para o atributo específico
    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    // método
    public void loan(Double amount) 
    {
        if(amount <= loanLimit)
            balance = balance + amount - 10.0;
    }
}

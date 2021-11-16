package A125.application;

import A125.entities.Account;
import A125.entities.BusinessAccount;
import A125.entities.SavingsAccount;

public class Program 
{
    public static void main(String[] args) 
    {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // upcasting
        Account acc1 = bacc;

        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);

        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        System.out.println(acc);

        // downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2; // tem que se faz casting (BusinessAccount)
        acc4.loan(100.0);

        System.out.println(acc2);
        System.out.println(acc4);

        // BusinessAccount acc5 = (BusinessAccount) acc3; // dá erro em tempo de execução

        // testar

        if (acc3 instanceof BusinessAccount) 
        {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");    
        }

        if (acc3 instanceof SavingsAccount)
        {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }
}

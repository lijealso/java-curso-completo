package A73;

public class CurrencyConverter
{
    public static final double IOF = 0.06;

    public static double ValorRecebido(double p, double q)
    {
        return (p + (p*IOF)) * q;
    }
    

}

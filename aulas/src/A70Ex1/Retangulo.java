package A70Ex1;

public class Retangulo {

    public double largura;
    public double altura;

    public double Area(double l, double a)
    {
        double area = l * a;

        return area;
    }

    public double Perimetro(double l, double a)
    {
        double perimetro = (2.0 * l) + (2.0 * a);

        return perimetro;
    }

    public double Diagonal(double l, double a)
    {
        double diagonal = Math.sqrt(Math.pow(l, 2.0) + Math.pow(a, 2.0));

        return diagonal;
    }
    
}

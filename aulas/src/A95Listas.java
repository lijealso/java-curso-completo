import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A95Listas
{
public static void main(String[] args)
{
    List<String> lista = new ArrayList<>();

    lista.add("Maria");
    lista.add("Alex");
    lista.add("Bob");
    lista.add("Anna");
    lista.add(2, "Marco");

    System.out.println(lista.size());
    System.out.println("-----------------");

    for (String elemento : lista)
    {
        System.out.println(elemento);
    }

    System.out.println("-----------------");
    lista.remove("Anna");

    for (String elemento : lista)
    {
        System.out.println(elemento);
    }

    System.out.println("-----------------");
    lista.remove(1);

    for (String elemento : lista)
    {
        System.out.println(elemento);
    }

    System.out.println("-----------------");
    
    // expressão lambda
    lista.removeIf(x -> x.charAt(0) == 'M');

    for (String elemento : lista)
    {
        System.out.println(elemento);
    }

    System.out.println("-----------------");
    
    // indice de um elemento específico
    System.out.println(lista.indexOf("Bob"));
 
    lista.add("Maria");
    lista.add("Alex");
    lista.add("Anna");
    lista.add("Jorge");
    lista.add(2, "Marco");

    // deixa na lista os começados por A

    lista.removeIf(x -> x.charAt(0) != 'A' && x.charAt(0) != 'J');

    // ou:

    List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

    System.out.println("-----------------");

    for (String elemento : resultado)
    {
        System.out.println(elemento);
    }

    // primeiro elemento começado por J
    
    String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

    System.out.println("-----------------");

    for (String elemento : resultado)
    {
        System.out.println(nome);
    }











}

    
}

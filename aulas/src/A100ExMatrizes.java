import java.util.Scanner;

public class A100ExMatrizes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de linhas: ");
        int linhas = sc.nextInt();
        sc.nextLine();

        System.out.println("Número de colunas: ");
        int colunas = sc.nextInt();
        sc.nextLine();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0 ; i < linhas ; i++)
        {
            for (int j = 0 ; j < colunas ; j++)
            {
                matriz[i][j] = sc.nextInt();          
            }
        }

        System.out.println("Escolha um número existente na matriz: ");
        int X = sc.nextInt();
        sc.nextLine();


        for (int i = 0 ; i < linhas ; i++)
        {
            for (int j = 0 ; j < colunas ; j++)
            {
                if (matriz[i][j] == X)
                {
                    System.out.println("Posição " + i + "," + j + ":");

                    if (j > 0)
                    {
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if (j < colunas - 1)
                    {
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if (i > 0)
                    {
                        System.out.println("Acima: " + matriz[i-1][j]);
                    }
                    if (i < linhas - 1)
                    {
                        System.out.println("Abaixo: " + matriz[i+1][j]);
                    }
                }
                
                      
            }
        }

        sc.close();
    }    
}

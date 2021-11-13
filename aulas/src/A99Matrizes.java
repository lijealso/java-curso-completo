import java.util.Scanner;

public class A99Matrizes
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("tamanho da matriz (N x N): ");
        Integer N = sc.nextInt();
        sc.nextLine();
        int negativos = 0;

        int[][] matriz = new int[N][N];

        for (int i = 0 ; i < N ; i++)
        {
            for (int j = 0 ; j < N ; j++)
            {
                matriz[i][j] = sc.nextInt();          
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0 ; i < N ; i++)
        {
                    System.out.print(matriz[i][i] + " ");
        }

        for (int i = 0 ; i < N ; i++)
        {
            for (int j = 0 ; j < N ; j++)
            {
                if (matriz[i][j] < 0)
                {
                    negativos++;
                }
            }
        }
        System.out.println("Quantidade de negativos = " + negativos);

        sc.close();
    }
}

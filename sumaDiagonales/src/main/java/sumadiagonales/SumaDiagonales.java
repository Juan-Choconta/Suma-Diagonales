
package sumadiagonales;
import java.util.Scanner;

public class SumaDiagonales {
    
    public static void main(String args[])
    {
        Scanner input =new Scanner (System.in);
        
        int n ,Inicio=1, sumaP=0 , sumaS=0, sumaT, diferenciaT ;
        
        System.out.println("Ingrese el numero de filas y columnas de la matriz: ");
        n = input.nextInt();

        
        int matriz[][]=new int [n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matriz[i][j]=Inicio++;
                if(i==j)
                {
                    sumaP=sumaP+matriz[i][j];
                   
                }
                if(i+j==n-1)
                {
                    sumaS=sumaS+matriz[i][j];
                    
                }
            }
        }
        
        sumaT = sumaP + sumaS;
        diferenciaT = sumaP - sumaS;
        if(diferenciaT < 0)
        {
            diferenciaT = diferenciaT * (-1);
        }
        
        System.out.println("La suma de las diagonales es: "+sumaT);
        System.out.println("La diferencia de las diagonales es: "+diferenciaT);
        
    }
}
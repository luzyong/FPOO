/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numpar;
import java.util.Scanner;

/**
 *
 * @author Luz Yong
 */
public class Sumatoria {
    int suma;
    int i;
    int n;
    int k;
    int par;
    
    public Sumatoria()
    {
        this.suma = 0;
        this.i = 0;
        this.n = 0;
        this.k = 0;
        this.par = 0;
    }
    
    public int SumaPar()
    {
        while(n>0)
        {
            i++;
                if(i%2==0)
                {
                    par=i;
                    suma=suma+par;
                    n--;
                }
        }
       return suma;
    }
    public int ObtenerN()
    {
        Scanner var = new Scanner(System.in);
        n= var.nextInt();
        return n;
    }
}

    /**
     * @param args the command line arguments
     */
   
    


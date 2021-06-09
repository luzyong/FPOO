/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma12;

import java.util.Scanner;

/**
 *
 * @author Luz Yong
 */
public class terminos {
    int n;
    int suma;
    public terminos()
    {
        this.n = 0;
        this.suma = 0;
    }
    public int Sumando()
    {
        while(n>0)
        {
            
        suma = suma+((2*n)-1);
            
            n--;
        }
        return suma;
    }
    public int ObtenerN()
    {
        Scanner var = new Scanner(System.in);
        n = var.nextInt();
        return n;
    }

    /**
     * @param args the command line arguments
     */
    
    
}

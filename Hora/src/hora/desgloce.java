/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;
import java.util.Scanner;

/**
 *
 * @author Luz Yong
 */
public class desgloce {

    int h;
    int m;
    int H;
    int M;
    int S;
    public desgloce()
    {
        this.h = 0;
        this.m = 0;
        this.H = 0;
        this.M = 0;
        this.S = 0;
    }
    public int Hora()
    {
        Scanner ho = new Scanner(System.in);
        h = ho.nextInt();
        return h;
    }
    public int Minuto()
    {
        Scanner mi = new Scanner(System.in);
        m = mi.nextInt();
        return m;
    }
    
    public int ObtenerdesgloceH()
    {
        H=h;
        return H;
              
    }
    public int ObtenerdesgloceM()
    {
        M=((H*60)+m);
        return M;
          
    }
    public int ObtenerdesgloceS()
    {
        S=(M*60);
        return S;
         
    }
}

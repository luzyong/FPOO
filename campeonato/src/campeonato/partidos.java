/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;
import java.util.Scanner;

/**
 *
 * @author Luz Yong
 */
public class partidos {

   int n;
   int part;
   
   public partidos()
   {
       this.n = 0;
       this.part = 0;
       
              
   }
   
   public int PrimeraRonda()
   {
       part = (n-1)*n;
       return part;
   }
   public int ObtenerN()
   {
       Scanner equipos = new Scanner(System.in);
       n = equipos.nextInt();
       return n;
   }
    
}

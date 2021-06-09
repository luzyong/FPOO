/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.util.Scanner;

/**
 *
 * @author Luz Yong
 */
public class elementos {

  int n;
  int suma;
  float media;
  public elementos()
  {
      this.n = 0;
      this.suma = 0;
      this.media = 0;
  }
  public float Media()
  {
      while(n>0)
      {
          suma=suma+n;
          media=suma/2;
          n--;
      }
      return media;
  }
     public int ObtenerN()
    {
        Scanner var = new Scanner(System.in);
        n = var.nextInt();
        return n;
    }
}

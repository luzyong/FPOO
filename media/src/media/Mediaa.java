/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;
import media.elementos;
/**
 *
 * @author Luz Yong
 */
public class Mediaa {
    int N;
    float Media;
     public static void main(String[] args) {
         elementos e = new elementos();
         System.out.println("Este programa calcula la media de n numeros enteros positivos. Ingresa n: ");
         int N = e.ObtenerN();
         float Media = e.Media();
         System.out.println("La media de la suma de tus numeros es: "+Media);
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numpar;
import numpar.Sumatoria;
/**
 *
 * @author Luz Yong
 */
public class SumaPAr {
    int numero;
    int sumo;
    public static void main(String[] args)
    {
        Sumatoria s = new Sumatoria();
        System.out.println("Este programa realia la sum de n numeros pares. Intorduce n: ");
        int numero = s.ObtenerN();
        int sumo = s.SumaPar();
        System.out.println("La suma de tus numeros pares es: " +sumo);
        
    }
    
}

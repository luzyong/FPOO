/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;
import campeonato.primeraronda; 

/**
 *
 * @author Luz Yong
 */
public class primeraronda {
         int ronda;
         int parti;
     public static void main(String[] args) {
         partidos p = new partidos();
         System.out.println("En un campeonato de futbol participan n equipos. Introduzca n para saber cuantos partidos habrá en la primera ronda: ");
        int ronda = p.ObtenerN();
        int parti = p.PrimeraRonda();
        System.out.println("En la primera ronda jugarán: " +parti);
         
// TODO code application logic here
    }
}

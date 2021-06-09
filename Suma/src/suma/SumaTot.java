/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

/**
 *
 * @author Luz Yong
 */
public class SumaTot {
    int suma;
    int ene;
    public static void main(String[] args) {
        terminos t = new terminos();
        System.out.println("Este programa calcula la suma de '1x2+2x3+3x4+...+nx(n+1)'Ingrese n: ");
        int ene = t.ObtenerN();
        int suma = t.Sumando();
        System.out.println("La suma de tus terminos es: "+suma);
        // TODO code application logic here
    }
    
}

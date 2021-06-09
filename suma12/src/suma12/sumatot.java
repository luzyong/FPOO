/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma12;

/**
 *
 * @author Luz Yong
 */
public class sumatot {
    int suma;
    int ene;
    public static void main(String[] args) {
        terminos t = new terminos();
        System.out.println("Este programa calcula la suma de '1+3+5+7+...+(2n-1)' Ingrese n: ");
        int ene = t.ObtenerN();
        int suma = t.Sumando();
        System.out.println("La suma de tus terminos es: "+suma);
        // TODO code application logic here
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

/**
 *
 * @author Luz Yong
 */
public class Areaa {
    float b;
    float h;
    float A;
    float p;
    public static void main(String[] args) {
        area a = new area();
        System.out.println("Este programa calcula el area y perimetro de un rectangulo. Ingresa la base y la altura: ");
        float b = a.B();
        float h = a.H();
        float A = a.OArea();
        float p = a.Oper();
        System.out.println("A=" +A);
        System.out.println("P=" +p);
        // TODO code application logic here
    }
    
}

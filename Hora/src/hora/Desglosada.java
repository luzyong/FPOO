/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;
import hora.desgloce;
/**
 *
 * @author Luz Yong
 */
public class Desglosada {
    int hora;
    int minuto;
    int Hora;
    int Minuto;
    int segundo;
     public static void main(String[] args) {
         desgloce d = new desgloce();
         System.out.println("Este programa desglosa la hora que ingresas en cantidad de horas, minutos y segundos. Ingresa la hora y los minutos: ");
        int hora = d.Hora();
        int minuto = d.Minuto();
        int Hora = d.ObtenerdesgloceH();
        int Minuto = d.ObtenerdesgloceM();
        int segundo = d.ObtenerdesgloceS();
        System.out.println("Tu hora desglosada es:");
        System.out.println("Horas: "+Hora);
        System.out.println("Minutos: "+Minuto);
        System.out.println("Segundos: "+segundo);
        
        // TODO code application logic here
    }
    
}

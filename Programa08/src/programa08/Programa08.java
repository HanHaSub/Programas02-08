/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa08;
import java.util.Scanner; 
/**
 *
 * @author acer
 */
public class Programa08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int dias;
        int horae = 0;
        int horas = 0;
        int minutoe = 0;
        int minutos = 0;
        int segundoe = 0;
        int segundos = 0;
        int hora;
        int minuto;
        int segundo;
        int sumahorae=0;
        int sumahoras=0;
        int sumaminutoe=0;
        int sumaminutos=0;
        int sumasegundoe=0;
        int sumasegundos=0;
        System.out.println("¿Cuantos dias trabajo? ");
        dias=entrada.nextInt();
        for (int i=0; i<dias;i++){
            System.out.println("Hora de entrada del día de hoy: ");
            horae=entrada.nextInt();
            sumahorae=sumahorae+horae;
            System.out.println("Hora de salida del día de hoy: ");
            horas=entrada.nextInt();
            sumahoras=sumahoras+horas;
            System.out.println("Minuto de entrada del día de hoy: ");
            minutoe=entrada.nextInt();
            sumaminutoe=sumaminutoe+minutoe;
            System.out.println("Minuto de salida del día del dia de hoy: ");
            minutos=entrada.nextInt();
            sumaminutos=sumaminutos+minutos;
            System.out.println("Segundo de entrada del día de hoy: ");
            segundoe=entrada.nextInt();
            sumasegundoe=sumasegundoe+segundoe;
            System.out.println("Segundo de salida del día de hoy: ");
            segundos=entrada.nextInt();
            sumasegundos=sumasegundos+segundos;
        }
        if (sumasegundoe>sumasegundos){
            sumasegundos=sumasegundos+60;
            sumaminutos=sumaminutos-1;
        }
        segundos=sumasegundos-sumasegundoe;
        if (sumaminutoe>sumaminutos){
            sumaminutos=sumaminutos+60;
            sumahoras=sumahoras-1;        
        }
        minutos=sumaminutos-sumaminutoe;
        horas=sumahoras-sumahorae;
        System.out.println(String.format("El tiempo es: %d %d %d",horas,minutos,segundos));
    }
    
}

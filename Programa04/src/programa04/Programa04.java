/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa04;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Programa04 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner inicio = new Scanner(System.in);
        int numero = 0, x;
        x = 1;
        while (x == 1) {
        System.out.println("Ingrese un numero del 1 al 12 para que te diga que mes es:");
            numero = inicio.nextInt();
        if (numero ==1){
        System.out.println(" Enero \nDias: 31");
        }
        if (numero ==2){
         System.out.println("Febrero \nDias:29");
        }
        if (numero ==3){
        System.out.println(" Marzo \nDias:31");
        } 
        if (numero ==4){
        System.out.println(" Abril \nDias:30");
        } 
        if (numero ==5){
        System.out.println(" Mayo \nDias:31");
        } 
        if (numero ==6){
        System.out.println(" Es  Junio y tienen 30 dias");
        } 
        if (numero ==7){
        System.out.println("Julio \nDias:31");
        } 
        if (numero ==8){
        System.out.println("Agosto \nDias:31");
        }
        if (numero ==9){
        System.out.println(" Septiembre \nDias:30");
        } 
        if (numero ==10){
        System.out.println("Octubre \nDias:31");
        } 
        if (numero ==11){
        System.out.println("Noviembre \nDias:30");
        } 
        if (numero ==12){
        System.out.println("Diciembre \nDias:31");
        } 
        }
    }
}  

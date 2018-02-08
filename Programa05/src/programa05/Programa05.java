/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa05;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Programa05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=0;
        Scanner inicio=new Scanner(System.in);
        System.out.println("¿que edad tienes?");
        edad=inicio.nextInt();
        if (edad >= 0 && edad <=5){
            System.out.println("Eres un bebe!");
        }
        if (edad>=5 && edad<=14){
            System.out.println("¡¡que chavillo eres :P");
        }
        else if(edad>=15 && edad<=20){
            System.out.println("Puberto :v");
        }
        else if(edad>=20 && edad<=26){
            System.out.println("ya maduraste (?)");
        }
        else if(edad>=26 && edad<=40){
            System.out.println("CHAVORRUCO :V");
        }
        else if(edad>=41 && edad<=61){
            System.out.println("estas robando oxigeno");
        }
        else{
            System.out.println("DEAD °_____°");
        }         
    }
}
